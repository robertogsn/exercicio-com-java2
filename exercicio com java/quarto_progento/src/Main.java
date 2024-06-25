import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	  
      Locale.setDefault(Locale.US);	
      Scanner sc = new Scanner(System.in);	
      
       double salario1,salario2;
       String nome1,nome2;
       int idade;
       char sexo;
       
       
       System.out.print("nome da primeira pessoa: ");
       nome1 = sc.nextLine();
       System.out.print("salario da primeira pessoa: ");
       salario1 = sc.nextDouble();
       
       System.out.print("nome da segunda pessoa: ");
       sc.nextLine();     
       nome2 = sc.nextLine();
       System.out.print("salario da segunda pessoa: ");
       salario2 = sc.nextDouble();
         
       System.out.print("Digite uma idade: ");
       idade = sc.nextInt();
       System.out.print("Digite um sexo (F/M): ");
       sexo = sc.next().charAt(0);
       
       System.out.println("Nome 1:" + nome1);
       System.out.println("salario 1: " + String.format("%.2f",salario1));
       System.out.println("Nome 2: "+ nome2);
       System.out.println("salario 2:" + String.format("%.2f",salario2));
       
       System.out.println("idade: " + idade);
       System.out.println("sexo: " + sexo);
       
       sc.close();   
       
		

	}

}
