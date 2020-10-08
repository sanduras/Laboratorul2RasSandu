package com.company.Hierarchical;

public class Bufnita extends Pasare{

    public Bufnita(String denumire, String gen, double greutate, double lungime, String increngatura) {
        super(denumire, gen, greutate, lungime, increngatura);
    }

    @Override
    public String hrana() {
        return (getDenumire()+" " +"maninca soareci");
    }

    public String print(String mediu){
        return (super.print() + "\n" + "Mediul: " + mediu);
    }
}
