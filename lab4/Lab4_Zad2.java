class Test {
    public static void main(String[] arg) {
        // Utworzenie 3 pracownikow:
        Pracownik[] pracownik = new Pracownik[15];
        pracownik[0] = new Pracownik("Kowalski","Jan", Wyksztalcenie.WYZ_TECHN, 18251.37);
        pracownik[1] = new Pracownik("Zawadowska", "Emilia",Wyksztalcenie.WYZ_EKON, 12251.37);
        pracownik[2] = new Pracownik("Nowak", "Boleslaw", Wyksztalcenie.NIEISTOTNE, 3152.73);
        pracownik[3] = new Pracownik("Ebert", "Bogdan", Wyksztalcenie.WYZ_TECHN, 4162.73);
        pracownik[4] = new Pracownik("Rak", "Borys", Wyksztalcenie.SREDNIE, 2142.73);
        pracownik[5] = new Pracownik("Zywiec", "Artur", Wyksztalcenie.WYZ_TECHN, 4252.72);
        pracownik[6] = new Pracownik("Edel", "Marcin", Wyksztalcenie.WYZ_EKON, 3252.73);
        pracownik[7] = new Pracownik("Apart", "Konrad", Wyksztalcenie.SREDNIE, 2352.71);
        pracownik[8] = new Pracownik("Nowad", "Kacper", Wyksztalcenie.WYZ_EKON, 2552.73);
        pracownik[9] = new Pracownik("Owad", "Dominik", Wyksztalcenie.WYZ_TECHN, 6152.73);
        pracownik[10] = new Pracownik("Zuk", "Piotr", Wyksztalcenie.NIEISTOTNE, 2452.75);
        pracownik[11] = new Pracownik("Motyl", "Lech", Wyksztalcenie.SREDNIE, 2652.73);
        pracownik[12] = new Pracownik("Ptak", "Anna", Wyksztalcenie.WYZ_TECHN, 5152.53);
        pracownik[13] = new Pracownik("Jelen", "Agnieszka", Wyksztalcenie.WYZ_EKON, 4152.13);
        pracownik[14] = new Pracownik("Prus", "Boleslawa", Wyksztalcenie.WYZ_EKON, 8152.33);
        // Drukowanie pracownikow w tabeli:
        System.out.println();
        System.out.println("+=============================================================+");
        System.out.println("                       | Wszyscy Pracownicy |");
        System.out.println("+=============================================================+");
        for(Pracownik element: pracownik){
         System.out.println(element);
     }
        Szef sz_jan = new Szef(pracownik[0], 23400);
        Szef sz_artur = new Szef(pracownik[5], 24500);
       for(int i=1; i<=4 ;i++){
           sz_jan.nowyPodwladny(pracownik[i]);
       }
        sz_jan.nowyPodwladny(pracownik[6]);

        for(int i=7; i<=14; i++){
            sz_artur.nowyPodwladny(pracownik[i]);
        }
        System.out.println("+=============================================================+");
        System.out.println("                    |Podwladni szefa Jana|");
        System.out.println("+=============================================================+");

        for(Pracownik element: sz_jan.podwladni){
            System.out.println(element);
        }
        System.out.println("+=============================================================+");
        System.out.println("                    |Podwladni szefa Artura|");
        System.out.println("+=============================================================+");

        for (Pracownik element: sz_artur.podwladni){
            System.out.println(element);
        }
        System.out.println();
    }
}
