package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

    private List<Voto> voti;

    public Libretto() {
        this.voti = new ArrayList<>();
    }

    public void add(Voto v) {
        this.voti.add(v);
    }

    public String print(){
        String result = "";

        for(Voto v: this.voti){
            result += String.valueOf(v) + "\n";
        }
        return result;
    }


}
