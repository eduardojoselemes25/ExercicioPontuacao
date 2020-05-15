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
		double ticket = sc.nextDouble();
		System.out.println();
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		int atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		char formaPag= sc.next().toUpperCase().charAt(0);
		System.out.println();
		System.out.println("Score de volume de compras = 40 pontos");
		
		
		int scoreCompras = 0;
		double numQuantMedioCompra = ticket * quantCompras;
		if (quantCompras == 0 && numQuantMedioCompra == 0) {
			scoreCompras = 0;
		} else if (numQuantMedioCompra <= 3000 && quantCompras <= 2) {
			scoreCompras += 20;
		} else if (quantCompras > 2 && numQuantMedioCompra <= 3000) {
			scoreCompras += 40;
		} else if (numQuantMedioCompra > 3000) {
			scoreCompras += 60;
		}
		System.out.println("Score de volume de compras = " + scoreCompras);
		System.out.println();
		
		int scoreInadimpl = 0;
		if (atraso > 1 || quantCompras == 0) {
			scoreInadimpl = 0;
		} else if (quantCompras > 0 && atraso == 1) {
			scoreInadimpl = 15;
		} else if (quantCompras > 0 && atraso == 0) {
			scoreInadimpl = 30;
		}
		System.out.println("Score de inadimplência = " + scoreInadimpl);
		
		int scorePagam = 0;
		if (quantCompras > 0 && formaPag == 'D') {
			scorePagam += 5;
		} else if (quantCompras > 0 && (formaPag == 'C' || formaPag == 'B')) {
			scorePagam += 10;
		}
		System.out.println("Score de forma de pagamento = " + scorePagam);
		System.out.println();
		
		int scoreTotal = scoreCompras + scoreInadimpl + scorePagam;
		String classCliente = "";
		if (scoreTotal == 0 || scoreTotal <= 25) {
			classCliente = "BRONZE";
		} else if (scoreTotal > 25 || scoreTotal <= 75) {
			classCliente = "PRATA";
		} else if (scoreTotal > 75) {
			classCliente = "OURO";
		}

		System.out.println("Classificação final = CLIENTE " + classCliente);
	}

}
