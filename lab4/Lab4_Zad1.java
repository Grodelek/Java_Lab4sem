//Do pliku o nazwie Pracownik
class Szef extends Pracownik{
    ArrayList<Pracownik> podwladni;
    double pensjaNS;
    Szef(Pracownik pracownik, double pensjaNS){
        this.pensjaNS = pensjaNS;
        this.podwladni = new ArrayList<>();
    }

    public void nowyPodwladny(Pracownik pracownik){
        podwladni.add(pracownik);
    }

    public boolean czyPodwladny(Pracownik pracownik) {
        return podwladni.contains(pracownik);
    }
    public double getPensjaNS(){
        return pensjaNS;
    }
}

//Nowy plik 
class Test {
    public static void main(String[] arg) {
        // Utworzenie 3 pracownikow:
        Pracownik kowalski = new Pracownik("Kowalski", "Jan", Wyksztalcenie.WYZ_TECHN, 18251.37);
        Pracownik zawadowska = new Pracownik("Zawadowska", "Emilia",Wyksztalcenie.WYZ_EKON, 12251.37);
        Pracownik nowak = new Pracownik("Nowak", "Boleslaw", Wyksztalcenie.NIEISTOTNE, 3152.73);
        // Drukowanie pracownikow w tabeli:
        System.out.println();
        System.out.println(kowalski);
        System.out.println(zawadowska);
        System.out.println(nowak);
        System.out.println();
        Szef sz_kowalski = new Szef(kowalski, 21000);
        System.out.println("Nowe wynagrodzenie szefa: "+ sz_kowalski.getPensjaNS());
        sz_kowalski.nowyPodwladny(zawadowska);
        sz_kowalski.nowyPodwladny(nowak);
        System.out.println("Podwladni szefa:");
        System.out.println(sz_kowalski.podwladni.get(0));
        System.out.println(sz_kowalski.podwladni.get(1));
        System.out.println("Czy "+zawadowska.nazwisko()+" jest podwladna: " +sz_kowalski.czyPodwladny(zawadowska));
        System.out.println("Czy "+nowak.nazwisko()+" jest podwladny: "+sz_kowalski.czyPodwladny(nowak));
        System.out.println("Czy "+sz_kowalski.imie()+" jest podwladny: "+sz_kowalski.czyPodwladny(sz_kowalski));

        System.out.println();
    }
}
