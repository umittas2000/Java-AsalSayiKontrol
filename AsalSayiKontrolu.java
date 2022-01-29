import java.util.Scanner;

public class AsalSayiKontrolu {

    static int asalMi(int sayi,int sayi2){
        if(sayi2==1){
            return 1;
        }

        if((sayi % sayi2)==0){
            return 2;
        }

        //System.out.println(sayi + "--"+sayi2); //Adim adim kontrol icin.
        return asalMi(sayi,sayi2-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,ret;

        System.out.print("Bir sayi girin: ");
        sayi=input.nextInt();

        if(asalMi(sayi,sayi-1)==1){
            System.out.println(sayi + " Sayisi Asal bir sayidir!");
        }else{
            System.out.println(sayi + " Sayisi Asal degildir...");
        }
        //System.out.println(asalMi(sayi,sayi-1));
    }

}
