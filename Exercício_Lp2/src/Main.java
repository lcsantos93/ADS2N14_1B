import java.util.Scanner;
public class Main {


	static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String Estado = null;
		Object Ligado = null;
		
		System.out.println("Estado, Ligado");
		
		Estado = scan.next();
		
		System.out.println("A lampada esta: "+Estado);
	}

}
