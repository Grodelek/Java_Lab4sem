public class Sklep {
    public static void main(String[] args) {
    Sprzedawcy
        jacek = new Sprzedawcy(),
        iwona = new Sprzedawcy(),
        roman = new Sprzedawcy();
        jacek.sprzedaz(5.50);
        roman.sprzedaz(10.80);
        roman.sprzedaz(7.00);
        iwona.sprzedaz(11.20);
        jacek.sprzedaz(2.30);
        System.out.println("Sumaryczny przychod: "+Sprzedawcy.uzysk());
    }
}
class Sprzedawcy{
    static double sumaPrzychodu = 0.0;
    double kwota;
    void sprzedaz(double kwota){
        sumaPrzychodu += kwota;
    }
    static double uzysk(){
        return sumaPrzychodu;
    }
}
