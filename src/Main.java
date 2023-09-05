import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;

        int toplam = 0;
        int adet = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        k = input.nextInt();

        for(int i=1; i<=k; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                System.out.println(i);
                toplam += i;
                adet ++;
            }
        }
        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("Toplam " + toplam);
            System.out.println("Adet " + adet);
            System.out.println( "3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println( "3 ve 4'etam bölünen sayı yok.");
        }
    }
}
