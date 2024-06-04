package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextShort();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextShort();

		try {

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");

		}

	}

	static void contar(int inicio, int fim) throws ParametrosInvalidosException {
		if (inicio > fim) {
			throw new ParametrosInvalidosException();
		}
		int contagem = fim - inicio;
		for(int i = inicio; i < fim; i++) {

			System.out.println("Imprimindo o número: " + contagem);

			contagem++;
		}

	}
}