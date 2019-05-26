package practica6;

public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1(String modelo,String fabricante) {
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA();
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB();
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC();
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
	

	public void metodoA(String modelo,String fabricante) {
		fabricante="Opel";
		modelo="corsa";
		System.out.println("Es un" + fabricante +  modelo + "y gasta 1,337 euros por litro.");
		
		
	}
	public void metodoB(String modelo,String fabricante) {
		fabricante="Seat";
		modelo="Ibiza";
		System.out.println("Es un" + fabricante +  modelo + "y gasta 1,052 euros por litro.");
		
		
	}public void metodoC(String modelo,String fabricante) {
		fabricante="Hyundai";
		modelo="Getz";
		System.out.println("Es un" + fabricante +  modelo + "y no necesita combustible.");
		
		
	}
}
