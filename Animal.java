public class Animal{
	private String nombre;
	private double peso;
	private boolean vertebrado;

	// Constructores 
	public Animal(String nombre, double peso){
	this.nombre = nombre;
	this.peso = peso;
	}
	public Animal(String nombre, boolean vertebrado){
		this.nombre=nombre;
		this.vertebrado=vertebrado;
	}
	public Animal(String nombre, double peso, boolean vertebrado){
		this.nombre=nombre;
		this.peso=peso;
		this.vertebrado=vertebrado;
	}

	//Métodos GET (Sirven para obtener valores)

	public String getNombre(){
		return nombre;
	}
	public double getPeso(){
		return peso;
	}
	public boolean getVertebrado(){
		return vertebrado;
	}

	//Métodos SET (Sirven para establecer valores)

	public void setNombre (String nombre){
		this.nombre=nombre;
	}

	public void setPeso (Double peso){
		this.peso=peso;
	}

	public void setVertebrado (boolean vertebrado){
		this.vertebrado=vertebrado;
	}

	// Método que realiza una accion en especifico

	public String comer (String alimento){
		return nombre + " comiendo: " +alimento;
	}
}
