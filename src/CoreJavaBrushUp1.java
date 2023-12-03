
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int myNum = 5;
		String website = "Yoisy Perez Olmos";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum+"is the value stored in the myNum variable");
		System.out.println(website);
		
		//Arrays
		int[] arr = new int [5]; //declaracion del arreglo de enteros (arr) y asignacion de memoria para una longitud de 5 elementos
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10}; //Otra forma mas directa de declarar arreglo, cuando se conocen sus valores.
		
		//for loop arr.lrngth - 5
		//for(int i = 0; i< arr.length; i++)
		//{
		//	System.out.println(arr[i]);
		//}
		
		for(int i = 0; i< arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		
		String[] name = {"yoisy", "perez", "olmos"};
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for( String s: name)
		{
			System.out.println(s);
		}
		
	}
	

}
