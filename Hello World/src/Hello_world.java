import java.util.Scanner;
import javax.swing.JOptionPane;


public class Hello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nome;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Informe Seu Nome:");
		Nome = ler.next();
		System.out.println("Hello "+ Nome);
	}

}
