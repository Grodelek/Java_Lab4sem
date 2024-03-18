import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] tab = new String[5];
    BubbleSort bubbleSort = new BubbleSort() {
        @Override
        void bubbleString(String[] tab) {
            for(int i=0; i<tab.length; i++){
                for(int j=0; j<tab.length-i-1; j++){
                    int compareStrings = tab[j].compareTo(tab[j+1]);
                    if(compareStrings > 0){
                        String temp = tab[j];
                        tab[j] = tab[j+1];
                        tab[j+1] = temp;
                    }
                }
            }
        }
    };
        System.out.println("Podaj 5 lancuchow tekstu:");
        for(int i=0; i< tab.length; i++){
            tab[i] = sc.nextLine();
        }
        bubbleSort.bubbleString(tab);
        System.out.println("Teksty po zamianie:");
        for (String element : tab){
            System.out.println(element);
        }
        System.out.println("Teksty po odwroconej zamianie");
        bubbleSort.reverseString(tab);
        for(String element : tab){
            System.out.println(element);
        }
        System.out.println("Teksty posortowane wedlug ostatnich indeksow:");
        bubbleSort.lastSort(tab);
        for(String element:tab){
            System.out.println(element);
        }
    }
}
abstract class BubbleSort{
     abstract void bubbleString(String[] tab);
     void reverseString(String[] tab){
         for(int i=0; i<tab.length; i++){
             for(int j=0; j<tab.length-i-1; j++){
         int wynikPorownania = tab[j].compareTo(tab[j+1]);
            if(wynikPorownania <= 0){
                String temp = tab[j];
                tab[j] = tab[j+1];
                tab[j+1] = temp;
                }
             }
         }
     }
    void lastSort(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                int n = 1;
                int m = 1;
                int len = tab[j].length();
                int len2 = tab[j + 1].length();
                char lastFirst = tab[j].charAt(len - n);
                char lastSecond = tab[j + 1].charAt(len2 - m);
                if(lastFirst == lastSecond){
                while (lastFirst == lastSecond && len - n >= 0 && len2 - m >= 0) {
                    n++;
                    m++;
                    if (len - n >= 0) {
                        lastFirst = tab[j].charAt(len - n);
                        }
                    if (len2 - m >= 0) {
                        lastSecond = tab[j + 1].charAt(len2 - m);
                        }
                    }
                }
                if (lastFirst > lastSecond) {
                    String temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }
}//To ostatnie nie wiem czy dobrze dziala
