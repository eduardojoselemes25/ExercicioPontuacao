package exercicio_pontuacao;

import java.util.Locale;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("----------------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		System.out.print("Quantas compras o cliente fez no último ano? ");
		int quantCompras =sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		double tiket = sc.nextDouble();
		System.out.println();
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		int atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		char formaPag= sc.next().toUpperCase().charAt(0);

		
		
		
		

	}

}
