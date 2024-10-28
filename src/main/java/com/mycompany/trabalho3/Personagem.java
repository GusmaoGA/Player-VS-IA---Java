/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho3;

/**
 *
 * @author Gusmão
 */
public abstract class Personagem {
    private String nome;
    private int vida;
    private int forca;

    // Construtor
    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    // Métodos abstratos
    public abstract void atacar(Personagem p);
    public abstract void curar();

    // Métodos públicos para acessar atributos privados
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }
}
