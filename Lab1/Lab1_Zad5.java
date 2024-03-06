import java.util.Random;
import java.util.Scanner;

public class Macierze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Podaj wielkosc macierzy:");
        int n = sc.nextInt();
        System.out.println("Na");
        int m = sc.nextInt();
        int tab[][] = new int[n][m];
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                tab[i][j] = rand.nextInt(10)+1;
            }
        }
        System.out.println("Wydrukowana macierz:");
        for(int[] wiersz: tab){
            for(int element : wiersz){
                System.out.print(element +" ");
            }
            System.out.println();
        }
//zrobic transponowanie
    }
}
