package com.company.SingleInheritance;

public class Salariat {
    private  String nume;
    private  double salariu;
    private  long idnp;
    private String email;
    private long telefon;

    public Salariat(String nume, double salariu, long idnp, String email, long telefon){
        this.nume = nume;
        this.salariu = salariu;
        this.idnp = idnp;
        this.email = email;
        this.telefon = telefon;
    }

    public String getNume() {
        return nume;
    }

    public String print() {
        return ("Nume: " + nume + "\n" +
                "Salariul: " + salariu + "\n" +
                "Idnp: " + idnp + "\n" +
                "Email: " + email + '\n' +
                "Telefon: " + telefon
        );
    }
}


