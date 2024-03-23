//Plik Pracownik.java
class Pracownik {
    private String nazwisko, imie;
    private Wyksztalcenie wyksztalcenie;
    private double pensja;
    public Pracownik() {}
    // selektory:
    public void setNazwisko(){
        Scanner sc = new Scanner(System.in);
        nazwisko = sc.nextLine();
    }
    public void setImie(){
        Scanner sc = new Scanner(System.in);
        imie = sc.nextLine();
    }

    public void setWyksztalcenie() {
        Scanner sc = new Scanner(System.in);
        int wybor = sc.nextInt();
        switch(wybor){
            case 0:
               wyksztalcenie =  Wyksztalcenie.NIEISTOTNE;
               break;
            case 1:
                wyksztalcenie = Wyksztalcenie.SREDNIE;
                break;
            case 2:
                wyksztalcenie = Wyksztalcenie.WYZ_EKON;
                break;
            case 3:
                wyksztalcenie = Wyksztalcenie.WYZ_TECHN;
                break;
        }
    }
    public void setPensja(){
        Scanner sc = new Scanner(System.in);
        try{
        pensja = sc.nextDouble();
    }catch(InputMismatchException e){
            System.out.println("Podales liczbe w zlym formacie: "+e.getMessage());
        }
    }

//Plik test:

import java.util.Scanner;

class Test {
    public static void main(String[] arg) {
        // Utworzenie 3 pracownikow:
        Pracownik[] pracownik = new Pracownik[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< pracownik.length; i++){
            pracownik[i] = new Pracownik();
            System.out.println("NOWY PRACOWNIK ");
            System.out.println("Podaj nazwisko:");
            pracownik[i].setNazwisko();
            System.out.println("Podaj imie:");
            pracownik[i].setImie();
            System.out.println("wyksztalcenie (wybrać z listy)\n" +
                    "0 — nieistotne\n" +
                    "1 — srednie\n" +
                    "2 — wyzsze ekonomiczne\n" +
                    "3 — wyzsze techniczne\n" + "wybor:");
            pracownik[i].setWyksztalcenie();
            System.out.println("Podaj pensje");
            pracownik[i].setPensja();

        }
        // Drukowanie pracownikow w tabeli:
        System.out.println();
        System.out.println("+=============================================================+");
        System.out.println("                       | Wszyscy Pracownicy |");
        System.out.println("+=============================================================+");
        for(Pracownik element: pracownik){
         System.out.println(element);
     }
        Szef szef1 = new Szef(pracownik[0], 23400);
        Szef szef2 = new Szef(pracownik[1], 24500);



//
//        System.out.println("+=============================================================+");
//        System.out.println("                    |Podwladni szefa Jana|");
//        System.out.println("+=============================================================+");
//
//        for(Pracownik element: szef1.podwladni){
//            System.out.println(element);
//        }
//        System.out.println("+=============================================================+");
//        System.out.println("                    |Podwladni szefa Artura|");
//        System.out.println("+=============================================================+");
//
//        for (Pracownik element: szef2.podwladni){
//            System.out.println(element);
//        }
        System.out.println();
    }
}
