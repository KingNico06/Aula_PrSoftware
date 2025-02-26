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
		
		System.out.println("A média do aluno é: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if(media >= 5) {
			System.out.println("Exame");
			System.out.println("O aluno está de exame, digite a nota da prova: ");
			
			double notaexame = sc.nextDouble();
			double MediaFinal = (media + notaexame)/2;
			
			if (MediaFinal >=7) {
				System.out.println("Aprovado, sua média foi de: " + MediaFinal);
			}
			else {
				System.out.println("Reprovado, sua média foi de: " + MediaFinal);
			}
			
		}
		else{
			System.out.println("Reprovado");
		}
		
		
		
		sc.close();
		
		}

	}


