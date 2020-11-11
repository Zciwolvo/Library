package com.biblioteka.test;

public class Czytelnik {
    int id;
    String imie;
    String nazwisko;
    String pesel;
    String data_urodzenia;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    public String getData_urodzenia(){
        return data_urodzenia;
    }
    public void setData_urodzenia(String data_urodzenia){
        this.data_urodzenia = data_urodzenia;
    }
}