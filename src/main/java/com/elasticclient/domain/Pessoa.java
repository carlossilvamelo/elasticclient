package com.elasticclient.domain;

import java.util.Random;

public class Pessoa {

    static final String SEXO[] = {"M", "F"};
    static final String ESTADO_CIVIL[] = {"casado", "solteiro", "divorciado"};

    private String sexo;
    private Integer idade;
    private String estadoCivil;
    private boolean trabalhando;
    private Integer numeroFilhos;
    private boolean possuiCarro;
    private boolean possuiCasa;
    private boolean problemaVisao;
    private boolean problemaCardiaco;
    private Integer diasAtividadeFisica;
    private boolean bebidaAlcoolica;
    private boolean falaOutroIdioma;
    private boolean desejaMigrar;


    public Pessoa() {
        Random rand = new Random();

        this.sexo = SEXO[rand.nextInt(2)];
        this.idade = aleatoriar(18,70);
        this.estadoCivil = ESTADO_CIVIL[rand.nextInt(3)];
        this.trabalhando = rand.nextBoolean();
        this.numeroFilhos = rand.nextInt(7);
        this.possuiCarro = rand.nextBoolean();
        this.possuiCasa = rand.nextBoolean();
        this.problemaVisao = rand.nextBoolean();
        this.problemaCardiaco = rand.nextBoolean();
        this.diasAtividadeFisica = rand.nextInt(8);
        this.bebidaAlcoolica = rand.nextBoolean();
        this.falaOutroIdioma = rand.nextBoolean();
        this.desejaMigrar = rand.nextBoolean();
    }

    public int aleatoriar(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }


    public static String[] getSEXO() {
        return SEXO;
    }

    public static String[] getEstadoCivil() {
        return ESTADO_CIVIL;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public Integer getNumeroFilhos() {
        return numeroFilhos;
    }

    public void setNumeroFilhos(Integer numeroFilhos) {
        this.numeroFilhos = numeroFilhos;
    }

    public boolean isPossuiCarro() {
        return possuiCarro;
    }

    public void setPossuiCarro(boolean possuiCarro) {
        this.possuiCarro = possuiCarro;
    }

    public boolean isPossuiCasa() {
        return possuiCasa;
    }

    public void setPossuiCasa(boolean possuiCasa) {
        this.possuiCasa = possuiCasa;
    }

    public boolean isProblemaVisao() {
        return problemaVisao;
    }

    public void setProblemaVisao(boolean problemaVisao) {
        this.problemaVisao = problemaVisao;
    }

    public boolean isProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(boolean problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    public Integer getDiasAtividadeFisica() {
        return diasAtividadeFisica;
    }

    public void setDiasAtividadeFisica(Integer diasAtividadeFisica) {
        this.diasAtividadeFisica = diasAtividadeFisica;
    }

    public boolean isBebidaAlcoolica() {
        return bebidaAlcoolica;
    }

    public void setBebidaAlcoolica(boolean bebidaAlcoolica) {
        this.bebidaAlcoolica = bebidaAlcoolica;
    }

    public boolean isFalaOutroIdioma() {
        return falaOutroIdioma;
    }

    public void setFalaOutroIdioma(boolean falaOutroIdioma) {
        this.falaOutroIdioma = falaOutroIdioma;
    }

    public boolean isDesejaMigrar() {
        return desejaMigrar;
    }

    public void setDesejaMigrar(boolean desejaMigrar) {
        this.desejaMigrar = desejaMigrar;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
