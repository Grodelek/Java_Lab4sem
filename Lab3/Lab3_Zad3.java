import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] tab = new int[5];
    int porownanie = 0;
        for(int i=0; i<tab.length; i++){
                System.out.println("Podaj tab["+i+"]");
                tab[i] = sc.nextInt();
            }
        for(int i=0; i < tab.length-1; i++){
            for(int j=0; j <tab.length - i - 1; j++){
                porownanie++;
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                    
                }
            }
        }
        System.out.println("Liczba porownan: "+porownanie);
       for(int element: tab){
           System.out.println(element);
       }
    }
}
