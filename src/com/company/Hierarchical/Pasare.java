package com.company.Hierarchical;

public class Pasare {
    private String denumire;
    private String gen;
    private double greutate;
    private double lungime;
    private String increngatura;

    public Pasare(String denumire, String gen, double greutate, double lungime, String increngatura) {
        this.denumire = denumire;
        this.gen = gen;
        this.greutate = greutate;
        this.lungime = lungime;
        this.increngatura = increngatura;
    }

    public String hrana(){
        return (getDenumire() + " " + "maninca");
    }

    public String getDenumire() {
        return denumire;
    }

    public void setIncrengatura(String increngatura) {
        this.increngatura = increngatura;
    }

    public String print() {
        return (
                "Denumire: " + denumire + "\n" +
                "Gen: " + gen + "\n" +
                "Greutate: " + greutate + "\n" +
                "Lungime: " + lungime + "\n" +
                "Increngatura:" + increngatura
        );
    }
}
