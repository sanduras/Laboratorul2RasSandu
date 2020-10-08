package com.company;

import com.company.Encapsulation.Monitor;
import com.company.Encapsulation.Mouse;
import com.company.Hierarchical.Barza;
import com.company.Hierarchical.Bufnita;
import com.company.Hierarchical.Pasare;
import com.company.Hierarchical.Ciocirlie;
import com.company.SingleInheritance.Programator;
import com.company.SingleInheritance.Salariat;

public class Main {

    public static void main(String[] args) {
        Mouse m1 = new Mouse("HyperX", 100D, 6, "USB", "Chine" );

        m1.setName("HP");
        System.out.println("New name is: " + m1.getName() + "\n");
        System.out.println(m1.print());

        System.out.println("-----------------");

        Monitor lg = new Monitor("Lg", 3840F, 60, "IPS", 5D);

        lg.setResponse(5.3D);
        System.out.println("Display is:" + lg.getDisplay() + "\n");
        System.out.println(lg.print());

        System.out.println("-----------------------------------------------------------");

        Salariat anatolie = new Salariat(
                "Anatolie",
                7300.89,
                2004347829847L,
                "varlamov.anatolie@mial.ru",
                78148698L);

        System.out.println(anatolie.print());

        System.out.println("-----------------");

        Programator vasile = new Programator(
                "Vasile",
                8500.89,
                20040578456666L,
                "teodosii.vasile@gmail.com",
                75109348L);

        System.out.println(vasile.print());
        System.out.println(vasile.print(300));

        System.out.println("-----------------------------------------------------------");

        Pasare gaina = new Pasare(
                "Gaina",
                "Gallus",
                4.3D,
                25.3,
                "Chordata"
        );
        System.out.println(gaina.print());
        System.out.println(gaina.hrana());

        System.out.println("-----------------");

        Barza jabiru = new Barza(
                "Jabiru",
                "Cioconiidae",
                8.5,
                40,
                "Chordata");

        System.out.println(jabiru.print());
        System.out.println(jabiru.print("India"));
        System.out.println(jabiru.hrana());

        System.out.println("-----------------");

        Bufnita strigidae = new Bufnita(
                "Strigidae",
                "Strigiformes",
                6.3,
                27.9,
                "Chordata");

        System.out.println(strigidae.print());
        System.out.println(strigidae.print("Aerian"));
        System.out.println(strigidae.hrana());

        System.out.println("-----------------");

        Ciocirlie alaudidae = new Ciocirlie(
                "Alaudidae",
                "Passeriformes",
                0.3,
                8.1,
                "Chordata");

        System.out.println(alaudidae.print());
        System.out.println(alaudidae.print(6));
        System.out.println(alaudidae.hrana());
    }
}
