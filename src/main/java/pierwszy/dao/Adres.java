package pierwszy.dao;


import java.util.ArrayList;

public class Adres {

    private String rodzaj;
    private String nazwa;
    private int numerUlicy;
    private String rozszerzenieUlicy;
    private int numerMieszkania;
    private String rozszerzenieMieszkania;
    private ArrayList<String> adresKoncowy = new ArrayList();

    public Adres() {
        rodzaj = "ul. ";
        nazwa = "Batorego ";
        numerUlicy = 34;
        rozszerzenieUlicy = " ";
        numerMieszkania = 3;
        rozszerzenieMieszkania = "c";


    }
    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getNumerUlicy() {
        return numerUlicy;
    }

    public void setNumerUlicy(int numerUlicy) {
        this.numerUlicy = numerUlicy;
    }

    public String getRozszerzenieUlicy() {
        return rozszerzenieUlicy;
    }

    public void setRozszerzenieUlicy(String rozszerzenieUlicy) {
        this.rozszerzenieUlicy = rozszerzenieUlicy;
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(int numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getRozszerzenieMieszkania() {
        return rozszerzenieMieszkania;
    }

    public void setRozszerzenieMieszkania(String rozszerzenieMieszkania) {
        this.rozszerzenieMieszkania = rozszerzenieMieszkania;
    }



}
