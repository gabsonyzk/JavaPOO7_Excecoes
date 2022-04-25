package applitacion;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainException;

public class Progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados da conta");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		
		System.out.print("Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Inicial saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double limiteDeSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero, nome, saldo, limiteDeSaque);
		
		System.out.print("Insira o valor para saque: ");
		double quantidae = sc.nextDouble();
		try {
			conta.saque(quantidae);
			System.out.println(conta);	
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
