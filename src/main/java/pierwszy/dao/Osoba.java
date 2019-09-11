package pierwszy.dao;

public class Osoba extends Oskarzony {
    private String imie;
    private String nazwisko;
    private int wiek;


    public Osoba() {
        imie="imie";
        nazwisko="nazwisko";
        wiek=0;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public String getPowod() {
        return super.getPowod();
    }

    public void setPowod(String powod) {
    super.setPowod(powod);
    }

    public String getZawod() {
        return super.getZawod();
    }

    public void setZawod(String zawod) {
        super.setPowod(zawod);
    }

}
