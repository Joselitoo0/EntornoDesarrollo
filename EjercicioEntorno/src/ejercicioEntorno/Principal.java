package ejercicioEntorno;



public class Principal {

	public static void main(String[] args) {
		
		Vista Vista = new Vista();
		Modelo Modelo = new Modelo();
		new Controlador(Vista, Modelo);
	}

}
