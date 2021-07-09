package br.com.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exerci1 {

	public static void main(String[] args) {
		// media de aluno
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 double nota1;
		 double nota2;
		 double media;
		 
		 System.out.print("digite a primeira nota: ");
		 nota1 = sc.nextDouble();
		 System.out.println();
		 System.out.print("digite a segunda nota: ");
		 nota2 = sc.nextDouble();
		 System.out.println();
		 media = (nota1 + nota2)/2;
		 if(media >= 7 && media <= 10) {
			 System.out.println("ALUNO APROVADO COM MÉDIA: "+ media);
		 }
		 else {
			 if(media >= 3 && media <= 6.9) {
				 System.out.println("ALUNO EM RECUPERAÇÃO COM MEDIA: "+ media);
			 }
			 else {
				 System.out.println("ALUNO REPROVADO COM MEDIA: "+ media);
			 }
		 }
		 
		 
	}

}
