package com.company.SingleInheritance;

public class Programator extends Salariat {


    public Programator(String name, double salariu, long idnp, String email, long telefon) {
        super(name, salariu, idnp, email, telefon);
    }

    public String print(int bonus) {
        return  ( super.getNume() + " " + "are bonus " + bonus);
    }
}
