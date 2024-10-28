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
    class Player extends Personagem { 
     // Construtor
    public Player (String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    // Implementação do ataque
    @Override
    public void atacar(Personagem p) {
        System.out.println(getNome() + " atacou " + p.getNome() + " com " + getForca() + " de dano.");
        p.setVida(p.getVida() - getForca());
    }

    // Implementação do método curar
    @Override
    public void curar() {
        Random random = new Random();
        int valorCura = random.nextInt(15) + 1;
        System.out.println(getNome() + " se curou em " + valorCura + " pontos de vida.");
        setVida(getVida() + valorCura);
    }
}
