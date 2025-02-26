package Helloworld;

import java.util.Scanner;

public class compras {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o valor da sua compra: ");
		
		double valorCompra = sc.nextDouble();
		
		System.out.println("metodos de pagamento ");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Debito");
		System.out.println("3 - Credito");
		int MetododePagamento = sc.nextInt();
		
		switch(MetododePagamento) {
	
		case 1:
			double valorFinal = valorCompra * 0.9;
			System.out.println("Sua compra ficou R$:" + valorFinal);
			break;
		case 2:
			 valorFinal = valorCompra * 0.95;
			 System.out.printf("Sua Compra ficou R$: %.2f", valorFinal);
			 break;
		case 3: 
			System.out.printf("Sua compra ficou R$: %.2f", valorCompra);
			
			System.out.println("metodos de pagamento ");
			System.out.println("1 - À Vista");
			System.out.println("2 - 2x, 5% de juros");
			System.out.println("3 - 3x, 10% de juros");
			int OpcaoCredito = sc.nextInt();
			
			switch(OpcaoCredito) {
			
			case 1:
				double finalCredito = valorCompra;
				System.out.println("Sua compra é de: R$" + finalCredito);
				break;
			
			case 2:
				finalCredito = valorCompra * 1.05;
				System.out.printf("Sua compra é de: R$ %.2f", finalCredito);
				break;
				
			case 3:
				finalCredito = valorCompra * 1.1;
				System.out.printf("Sua compra é de: R$ %.2f", finalCredito);
				break;
			
			default :
				System.out.println("Opção Invalida");
				break;
			}
			break;
		default :
			System.out.println("Opção Invalida");
			break;
		
		}	
		
		sc.close();
}
}
