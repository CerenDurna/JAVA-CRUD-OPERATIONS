public class Market {
    private String urunUretici;
    private int urunID;
    private String urunAdi;
    private float urunFiyat;
    
    public Market(String urunAdi, int urunID, String urunUretici, float urunFiyat) {
        this.urunUretici = urunUretici;
        this.urunID = urunID;
        this.urunAdi = urunAdi;
        this.urunFiyat = urunFiyat;
    }

    public void setUrunUretici(String urunUretici) {
        this.urunUretici = urunUretici;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public void setUrunFiyat(float urunFiyat) {
        this.urunFiyat = urunFiyat;
    }
   
    public String getUrunUretici() {
        return urunUretici;
    }

    public int getUrunID() {
        return urunID;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public float getUrunFiyat() {
        return urunFiyat;
    }
    
}
