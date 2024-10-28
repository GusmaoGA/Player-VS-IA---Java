/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho3;

/**
 *
 * @author Gusmão
 */
import java.util.Random;
    class PlayerIA extends Personagem {
      // Construtor
    public PlayerIA (String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    // Implementação do ataque (computador ataca aleatoriamente)
    @Override
    public void atacar(Personagem p) {
        Random random = new Random();
        int danoAleatorio = random.nextInt(getForca()) + 5;
        System.out.println(getNome() + " atacou " + p.getNome() + " com " + danoAleatorio + " de dano.");
        p.setVida(p.getVida() - danoAleatorio);
    }

    // Implementação do método curar
    @Override
    public void curar() {
        Random random = new Random();
        int valorCura = random.nextInt(15) + 1;
        System.out.println(getNome() + " (Computador) se curou em " + valorCura + " pontos de vida.");
        setVida(getVida() + valorCura);
    }
}
