import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] tab = new String[5];
        for(int i=0; i<tab.length; i++){
                System.out.println("Podaj tab["+i+"]");
                tab[i] = sc.nextLine();
            }
        for(int i=0; i < tab.length-1; i++){
            for(int j=0; j < tab.length-i-1 ; j++){
              int alfabetyczneSort = tab[j].compareTo(tab[j+1]);
                if(alfabetyczneSort > 0) {
                    String temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j+1] = temp;
                }
            }
        }
       for(String element: tab){
           System.out.println(element);
       }
    }
}
