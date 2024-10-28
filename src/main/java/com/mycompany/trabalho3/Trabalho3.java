/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho3;

/**
 *
 * @author Gusmão
*/
import java.util.Random;
import java.util.Scanner;
public class Trabalho3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o jogador humano e o computador
        Player jogador = new Player ("Herói", 100, 10);
        PlayerIA inimigo = new PlayerIA("Inimigo", 100, 15);
        

        // Loop do jogo (combate) enquanto ambos os personagens tiverem vida
        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            // Turno do jogador
            System.out.println("\nSua vida: " + jogador.getVida() + " | Vida do inimigo: " + inimigo.getVida());
            System.out.println("Escolha uma ação: [1] Atacar [2] Curar");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                jogador.atacar(inimigo);  // Jogador ataca o inimigo
            } else if (escolha == 2) {
                jogador.curar();  // Jogador se cura
            }

            // Verificar se o inimigo foi derrotado
            if (inimigo.getVida() <= 0) {
                System.out.println("Você derrotou o inimigo!");
                break;
            }

            // Turno do computador (inimigo)
            Random random = new Random();
            int acaoInimigo = random.nextInt(2) + 1;

            if (acaoInimigo == 1) {
                inimigo.atacar(jogador);  // Computador ataca o jogador
            } else {
                inimigo.curar();  // Computador se cura
            }

            // Verificar se o jogador foi derrotado
            if (jogador.getVida() <= 0) {
                System.out.println("Você foi derrotado!");
                break;
            }
        }

        // Fim do jogo
        if (jogador.getVida() > 0) {
            System.out.println("\nParabéns! Você venceu o jogo.");
        } else {
            System.out.println("\nVocê perdeu o jogo.");
        }

        scanner.close();
    }
}
