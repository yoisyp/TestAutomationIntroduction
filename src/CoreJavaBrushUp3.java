import org.checkerframework.checker.units.qual.Length;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is an object  //string literal
		
		//String s1 = "Yoisy Perez";
		String s5 = "hello";
		
		//new operator
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		
		String s = "Yoisy Perez Olmos";
		//s.split(" ") divide  string s, genera una nueva cadena en cada espacio " " 
		String[] splittedString = s.split("Perez");//la variable splittedString es un arreglo de string que almacena cada cadena de s en cada posicion del arreglo.
		System.out.println(splittedString[0]); //Se imprimira solo la cadena "Yoisy", es la que esta en la posicion 0 de s.
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());//Elimina espacios a la izquierda y derecha de la cadena
		
		for(int i = 0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i)); //Imprime el caracter i de la cadena s
		}
		
		for(int i = s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i)); //Imprime el caracter i de la cadena s
		}
	}
		
}
