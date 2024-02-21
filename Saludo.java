class Saludo {
	public void saludar(String nombre){
	System.out.println("Hola "+nombre+" a la POO");
	}
}

public class Bienvenido {
	public static void main (String[] args){
		Saludo s = new Saludo ();
		s.saludar("Oscar");
	}
}
