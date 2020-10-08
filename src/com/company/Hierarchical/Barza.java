package com.company.Hierarchical;

public class Barza extends Pasare {

    public Barza(String denumire, String gen, double greutate, double lungime, String increngatura) {
        super(denumire, gen, greutate, lungime, increngatura);
    }

    @Override
    public String hrana() {
        return (getDenumire()+" " +"maninca peste");
    }

    public String print(String migratie){
        return (super.print() + "\n" + "Migratie: " + migratie);
    }
}
