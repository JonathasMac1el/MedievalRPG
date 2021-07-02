package Personagens;

import Itens.Item;

public abstract class PersonagemInicial {
    private String nome;
    private int forca;
    private int inteligencia;
    private int destreza;
    private int constituicao;
    private int sabedoria;
    private int carisma;
    private int pontosDeVida;

    public PersonagemInicial(String nome, int forca, int inteligencia, int destreza, int constituicao, int sabedoria, int carisma, int pontosDeVida) {
        this.nome = nome;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.pontosDeVida = pontosDeVida;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public abstract void atacar ();

    public abstract void esquivar ();

    public void pegarItem(Item item){

    }
    public void droparItem(){

    }


    public void fugir(){

    }


}


