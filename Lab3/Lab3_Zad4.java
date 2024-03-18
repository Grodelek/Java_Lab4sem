import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] tab = new int[5];
    int porownanie = 0;
    int skroc = 1;
    int ostZam = tab.length - 1;
        for(int i=0; i<tab.length; i++){
                System.out.println("Podaj tab["+i+"]");
                tab[i] = sc.nextInt();
            }
        for(int i=0; i < tab.length-1; i++){
            skroc=1;
            for(int j=0; j < ostZam; j++){
                porownanie++;
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                    skroc++;
                    ostZam = j;
                }
            }
        }
        System.out.println("Liczba porownan: "+porownanie);
       for(int element: tab){
           System.out.println(element);
       }
    }
}
