import java.util.ArrayList;

public class Hospital {

	private String nombre;
	public ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	public ArrayList<Medico> medicos = new ArrayList<Medico>();

	public Hospital(String nombre, ArrayList<Paciente> pacientes, ArrayList<Medico> medicos) {
		this.nombre = nombre;
		this.pacientes = pacientes;
		this.medicos = medicos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}



	public Medico buscarMedico(String nombre, int edad) {
		for (Medico medico : this.medicos) {
			if (medico.getNombre().equals(nombre) && medico.getEdad()==edad) {
				return medico;
			}
		}
		return null;
	}

	public boolean contratarMedico(Medico medico) {
		if(buscarMedico(medico.getNombre(),medico.getEdad()) == null){
			this.medicos.add(medico);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean despediMedico(int edad, String nombre) {
		Medico medico = this.buscarMedico(nombre,edad);
		if (medico != null){
			this.medicos.remove(medico);
			return true;
		}
		else {
			return false;
		}
	}

	public Paciente buscarPaciente(String nombre, int edad) {
		for (Paciente paciente : this.pacientes) {
			if (paciente.getNombre().equals(nombre) && paciente.getEdad()==edad) {
				return paciente;
			}
		}
		return null;
	}
	public boolean registrarPaciente(Paciente paciente) {
		if(buscarPaciente(paciente.getNombre(),paciente.getEdad()) == null){
			this.pacientes.add(paciente);
			return true;
		}
		else{
			return false;
		}
	}
}