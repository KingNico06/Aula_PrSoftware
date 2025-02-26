package Helloworld;

import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
		//Program que calcula a media de um aluno e diga se ele foi:
		//Approved - 7 a 10
		//Reproved 0 a 6.9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if(media >= 5) {
			System.out.println("Exame");
		}
		else{
			System.out.println("Reprovado");
		}
		
		
		
		sc.close();
		
		}

	}


