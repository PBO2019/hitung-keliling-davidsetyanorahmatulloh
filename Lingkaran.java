public class Lingkaran {
    private double phi = 3.14;
    private int radius;
    private double keliling;

    public void hitungkelilinglingkaran(){
        this.keliling = 2*phi*radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double getkeliling(){
        return keliling;
    }
}
