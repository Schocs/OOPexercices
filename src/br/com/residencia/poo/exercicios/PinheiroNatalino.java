package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class PinheiroNatalino {

	//Padrão da árvore:
	/*
	 * 		   * 			-> Variável quantidadeDePadroes define quantas "estruturas de folha" a árvore terá
              * * 
             * * * 
             * * * 
            * * * * 
           * * * * * 
           * * * * * 
          * * * * * * 
         * * * * * * * 
         * * * * * * * 
        * * * * * * * * 
       * * * * * * * * * 
       * * * * * * * * * 
      * * * * * * * * * * 
     * * * * * * * * * * * 
            * * * * 
            * * * * 
            * * * * 
            * * * * 
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira altura desejada da árvore: "); 
		int quantidadeDePadroes = sc.nextInt();
		System.out.print("Insira a largura desejada da árvore: ");
		int larguraDoPadraoUm = sc.nextInt();
		int espacoLateral = larguraDoPadraoUm * 5;
		int tamanhoDoPadraoUm = 1;
		for (int a = 1; a <= quantidadeDePadroes; a++) {
			for (int i = tamanhoDoPadraoUm; i <= larguraDoPadraoUm; i++) {
				for (int j = espacoLateral; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			tamanhoDoPadraoUm = tamanhoDoPadraoUm + 2;
			larguraDoPadraoUm = larguraDoPadraoUm + 2;
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = espacoLateral - 3; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 4; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
