package model;

public class Dia {

    //Atributos da classe
    protected int dia;

    public Dia() {

    }

    //Construtor da classe
    public Dia(int dia) {
        this.dia = dia;
    }

    //Set e get da classe
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public String toString(){
        return "Hoje é: " + getDia();
    }
}

