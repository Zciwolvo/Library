package com.biblioteka.test;

public class Wypozyczenie {
    private int id;
    private int id_ksiazki;
    private int id_czytelnika;
    private String data_wypozyczenia;
    private String zwrot_przewidywany;
    private String zwrot_rzeczywisty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(int id_ksiazki) {
        this.id_ksiazki = id_ksiazki;
    }

    public int getId_czytelnika() {
        return id_czytelnika;
    }

    public void setId_czytelnika(int id_czytelnika) {
        this.id_czytelnika = id_czytelnika;
    }

    public String getData_wypozyczenia() {
        return data_wypozyczenia;
    }

    public void setData_wypozyczenia(String data_wypozyczenia) {
        this.data_wypozyczenia = data_wypozyczenia;
    }

    public String getZwrot_przewidywany() {
        return zwrot_przewidywany;
    }

    public void setZwrot_przewidywany(String zwrot_przewidywany) {
        this.zwrot_przewidywany = zwrot_przewidywany;
    }

    public String getZwrot_rzeczywisty() {
        return zwrot_rzeczywisty;
    }

    public void setZwrot_rzeczywisty(String zwrot_rzeczywisty) {
        this.zwrot_rzeczywisty = zwrot_rzeczywisty;
    }
}