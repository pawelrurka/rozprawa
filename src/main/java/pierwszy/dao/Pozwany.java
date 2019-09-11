package pierwszy.dao;

public class Pozwany {
    private String adresPozwanego;
    private int numerAdresuPozwanego;
    private String ulicaaCzyAlejaPozwanego;
    private String opis;
    private String ulica;
    private String aleja;

    public Pozwany(){
    opis = "Lubi robić na drutach";
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }


}
