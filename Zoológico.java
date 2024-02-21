public class  Zoologico{
	public static void main(String[] args){
		Animal a1= new Animal("Tigre",120.500);
		Animal a2= new Animal("Salmon",true);
		Animal a3= new Animal("Tiranosaurio",15000.00,true);

		a1.setNombre("Tigre de Bengala");
		a1.setVertebrado(true);
		a2.setPeso(5.00);
		a3.setNombre("Hipo");
		a3.setPeso(2000.0);

		System.out.println("Objetos de Animal");
		System.out.println("Animal 1 es "+a1.getNombre()+",peso:"+a1.getPeso()+",vertebrado: "+a1.getVertebrado());
		System.out.println("Animal 2 es "+a2.getNombre()+",peso:"+a2.getPeso()+",vertebrado: "+a2.getVertebrado());
		System.out.println("Animal 3 es "+a3.getNombre()+",peso:"+a3.getPeso()+",vertebrado: "+a3.getVertebrado());

		System.out.println("");
		System.out.println("Animal 1:"+a1.comer("pollo"));
		System.out.println("Animal 2:"+a2.comer("alga"));
		System.out.println("Animal 3:"+a3.comer("sandia"));

	}
	}
