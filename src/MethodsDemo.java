
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo(); //Declarando objeto de la clase.
		String name = d.getData(); //Acceso al metodo getData para el objeto d
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2(); //Declarando objeto para acceder a metodos de la clase MethodsDemo2
		d1.getUserData(); //accediendo al metodo
		getData2(); //Llamada al metodo estatico directamente desde la clase sin un objeto.
	}
	
	
	public String getData()
	{
		System.out.println("Hello World");
		return "Yoisy Perez";
	}

	public static String getData2()//Este metodo static se usa directamente desde la clase sin necesidad de un objeto
	{
		System.out.println("Jorgitin");
		return "Jorgitin";
	}
}
