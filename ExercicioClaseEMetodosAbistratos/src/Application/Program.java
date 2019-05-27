package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale .setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		double sum = 0;
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Tax payer #"+(i+1)+" data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name:");
			String nome = sc.nextLine();
			System.out.print("Anual income:");
			Double rendaAnual = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures:");
				Double gastosComSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			}else if(ch == 'c'){
				System.out.print("Number of employees:");
				int quantidadeDeFuncionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendaAnual, quantidadeDeFuncionarios));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Pessoa p : pessoas ) {
			System.out.println(p.toString());
			sum += p.calculaImposto();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $"+sum);
		sc.close();
	}

}
