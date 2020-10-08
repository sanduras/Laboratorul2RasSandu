package com.company.Hierarchical;

public class Ciocirlie extends Pasare {
    public Ciocirlie(String denumire, String gen, double greutate, double lungime, String increngatura) {
        super(denumire, gen, greutate, lungime, increngatura);
    }

    @Override
    public String hrana() {
        return (getDenumire() + " " + "maninca viermi");
    }

    public String print(int oua){
        return (super.print() + "\n" + "scoate circa: " + oua + " " + "oua");
    }
}
