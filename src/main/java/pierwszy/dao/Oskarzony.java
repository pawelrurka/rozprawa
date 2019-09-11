package pierwszy.dao;

public class Oskarzony {
    private String powod;
    private String zawod;
    public Oskarzony(){
        powod = "Nie dotyczy";
        zawod = "Nie dotyczy";
    }
    protected String getPowod() {
        return powod;
    }

    protected void setPowod(String powod) {
        this.powod = powod;
    }

    protected String getZawod() {
        return zawod;
    }

    protected  void setZawod(String zawod) {
        this.zawod = zawod;
    }
}
