package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO - Plain Old Java Object
//Java Bean

/**
 * Memorizza il risultato di un esame singolo
 * @author Vito
 */
public class Voto {
    private String nome;
    private int voto; // 30L come la rappresento?
    private LocalDate data;

    public Voto(String nome, int voto, LocalDate data) {
        this.nome = nome;
        this.voto = voto;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Esame{" +
                "nome='" + nome + '\'' +
                ", voto=" + voto +
                ", data=" + data +
                '}';
    }
}
