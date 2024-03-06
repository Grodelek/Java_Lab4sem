import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("*-----------*");
        System.out.println();
        System.out.println("Podaj bok a:");
        double a = sc.nextDouble();
        System.out.println("Podaj bok b:");
        double b = sc.nextDouble();
        System.out.println("Podaj bok c:");
        double c = sc.nextDouble();
        Trojkat jakis3kat = new Trojkat(a, b, c);
        double pole = Trojkat.pole(jakis3kat);
        double obwod = Trojkat.obwod(jakis3kat);

        System.out.println("Pole trojkata (wg wzoru Herona): "+pole);
        System.out.println("Obwod trojkata: "+obwod);
    }
}
class Trojkat{
    double a;
    double b;
    double c;
    Trojkat(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getA(){
        return a;
    }
    double getB(){
        return b;
    }
    double getC(){
        return c;
    }
    static double pole(Trojkat jakis3kat){
        return (jakis3kat.getA()+jakis3kat.getB()+jakis3kat.getC())/2;
    }
    static double obwod(Trojkat jakis3kat){
        return (jakis3kat.getA()+jakis3kat.getB()+jakis3kat.getC());
    }
}

