public class Main {

    public static void main(String[] args) {
        Lingkaran oval = new Lingkaran();
        BujurSangkar kotak = new BujurSangkar();


        oval.setRadius(10);
        oval.hitungkelilinglingkaran();
        System.out.println("keliling lingkaran adalah        = "+oval.getkeliling());

        kotak.setSisi(20);
        kotak.hitungbujursangkar();
        System.out.println(" keliling bujur sangkar adalah   = "+ kotak.getKeliling());



        // System.out.println("Menghitung keliling Bujur dan Lingkaran");
        //BujurSangkar bujursangkar = new BujurSangkar();
        //Lingkaran lingkaran = new Lingkaran();
        //bujursangkar.hitungbujursangkar( 8);
        //lingkaran.hitungkelilinglingkaran(12);
    }
}
