import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Contato> contatos = new ArrayList <Contato>();
		
		Random geratel = new Random();
		 
        int telefone = geratel.nextInt(99999999);
        

		Random geranome = new Random();
		 
        long nome = geranome.nextLong();
		 
		int op = 0;
	        Scanner ler = new Scanner(System.in);
	        
	        
	        do
	        {

                System.out.println("Cadastro Contatos\n\r");
                System.out.println("1 - Cadastrar Contato");
                System.out.println("2 - Listar Contatos");
                op=ler.nextInt();
                
		 switch(op)
	        {
	            case 1:
	            {
	                String Nome;
	                String Telefone;
	                String Endereco;
	                
	                for (int r=0; r<5; r++)
	                {
	                	
	                System.out.println("Nome: ");
	                Nome = ler.next();
	                System.out.println("Telefone: ");
	                Telefone = ler.next();
	                System.out.println("Endereco: ");
	                Endereco = ler.next();
	                
		
	                Contato contact = new Contato (Nome, Telefone, Endereco);
	                contatos.add(contact);
	                }
	}
	            case 2:
	            {
	                System.out.println("Listando Contatos...");
	               
	            //    for (int j =0;j<contatos.size();j++)
	            
	                   
	                {
	                System.out.println("----------------------------------");
	                
	                System.out.println("Nome: "+nome);
	                System.out.println("Telefone: "+telefone);
	                
	                /**
	                 System.out.println("Nome: "+contatos.get(j).getNome());
	                System.out.println("Telefone: "+contatos.get(j).getTelefone());
	                System.out.println("Endere�o: "+contatos.get(j).getEndereco());
	                */
	                }
	                break;
	            }
	        }
	            
	            
	        }while(op !=2);
	}
	
}
	
