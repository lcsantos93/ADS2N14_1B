import java.util.Scanner;
import javax.swing.JOptionPane;


public class Hello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nome = null;
		Scanner ler = new Scanner(System.in);
		
		
		Nome = JOptionPane.showInputDialog("Informe Seu Nome:");
		//Nome = ler.next();
		JOptionPane.showMessageDialog(null, "Hello "+ Nome);
	}

}
