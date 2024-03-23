class Osoba {

    private String nazwisko;
    private Osoba ojciec;
    ArrayList<Osoba> synowie = new ArrayList<>();

    Osoba(String nazwisko, Osoba ojciec){
        this.nazwisko = nazwisko;
        this.ojciec = ojciec;
        this.synowie = new ArrayList<>();
        if(ojciec != null){
            ojciec.nowySyn(this);
        }

    }
  //Do klasy Piastowie.java
