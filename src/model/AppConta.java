package model;

import java.util.Scanner;

import util.GerenciaConta;

public class AppConta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		GerenciaConta contas = new GerenciaConta();
		Conta c;
		
		int opcao = 0;
		int numero;
		double saldo, valor;
		
		while(opcao != 7) {
			System.out.println("=============================");
			System.out.println("1. Adicionar Conta Corrente");
			System.out.println("2. Adicionar Conta Especial");
			System.out.println("3. Sacar");
			System.out.println("4. Depositar");
			System.out.println("5. Remover");
			System.out.println("6. Exibir");
			System.out.println("7. Sair");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite um numero: ");
				numero = teclado.nextInt();
				saldo = 0;
				c = new ContaCorrente(numero, saldo);
				contas.adicionar(c);
				break;
			case 2:
				System.out.println("Digite um numero: ");
				numero = teclado.nextInt();
				saldo = 0;
				double limite = teclado.nextDouble();
				c = new ContaEspecial(numero, saldo, limite);
				contas.adicionar(c);
				break;
			case 3:
				System.out.println("Digite um numero: ");
				numero = teclado.nextInt();
				System.out.println("Digite um valor para sacar: ");
				valor = teclado.nextDouble();
				if(contas.sacar(numero, valor)) {
					System.out.println("R$: "+valor+" sacados com sucesso");
				}else {
					System.out.println("Não foi possivel efetuar o saque");
				}
				break;
			case 4:
				System.out.println("Digite um numero: ");
				numero = teclado.nextInt();
				System.out.println("Digite um valor para depositar: ");
				valor = teclado.nextDouble();
				if(contas.depositar(numero, valor)) {
					System.out.println("R$: "+valor+" depositados com sucesso");
				}else {
					System.out.println("Não foi possivel efetuar o deposito1");
				}
				break;
			case 5:
				System.out.println("Digite um numero: ");
				numero = teclado.nextInt();
				if(contas.reomver(numero)) {
					System.out.println("Removido com sucesso!!");
				}else {
					System.out.println("Não foi possivel remover");
				}
				break;
			case 6:
				System.out.println("Digite um numero: ");
				numero = teclado.nextInt();
				System.out.println(contas.exibir(numero));
				break;
			case 7:
				System.out.println("Saindo");
				break;
			}
		}
		
		
		
		teclado.close();
	}

}
