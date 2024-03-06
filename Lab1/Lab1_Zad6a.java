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
        double pole = jakis3kat.pole();
        double obwod = jakis3kat.obwod();

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
    double pole(){
        return (a+b+c)/2;
    }
    double obwod(){
        return a+b+c;
    }
}

