package pyramid;

public class Pyramid {
    private String pharoh, ancientName, modernName, site;
    private int dynasty;
    private double base1, base2, height;

    public Pyramid(String pharoh, String ancientName, String modernName, int dynasty, String site,  double base1, double base2, double height) {
        this.pharoh = pharoh;
        this.ancientName = ancientName;
        this.modernName = modernName;
        this.site = site;
        this.dynasty = dynasty;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "pharoh='" + pharoh + '\'' +
                ", ancientName='" + ancientName + '\'' +
                ", modernName='" + modernName + '\'' +
                ", site='" + site + '\'' +
                ", dynasty=" + dynasty +
                ", base1=" + base1 +
                ", base2=" + base2 +
                ", height=" + height +
                '}';
    }

    public String getPharoh() {
        return pharoh;
    }

    public void setPharoh(String pharoh) {
        this.pharoh = pharoh;
    }

    public String getAncientName() {
        return ancientName;
    }

    public void setAncientName(String ancientName) {
        this.ancientName = ancientName;
    }

    public String getModernName() {
        return modernName;
    }

    public void setModernName(String modernName) {
        this.modernName = modernName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getDynasty() {
        return dynasty;
    }

    public void setDynasty(int dynasty) {
        this.dynasty = dynasty;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
