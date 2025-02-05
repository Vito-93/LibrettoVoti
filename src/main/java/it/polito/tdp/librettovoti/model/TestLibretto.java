package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

    public static void main(String[] args){
        Libretto libretto = new Libretto();

        Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));

        libretto.add(voto1);
        libretto.add(new Voto("Chimica", 25, LocalDate.of(2019, 7, 27)));
        libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
        libretto.add(new Voto("Informatica", 28, LocalDate.of(2019, 7, 27)));
        List<Voto> venticinque = libretto.listaVotiUguali(25);
        Libretto venticinqueL = libretto.votiUguali(25);

        System.out.println(libretto.print());
        System.out.println(venticinque);
        System.out.println(venticinqueL.print());

    }


}
