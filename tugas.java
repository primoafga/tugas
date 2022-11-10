import java.util.Scanner;

public class tugas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai alasnya        : ");
        int alas = input.nextInt();
        System.out.print("Masukkan nilai tingginya      : ");
        int tinggi = input.nextInt();
        double LuasSegitiga = (double)(alas*tinggi)/2;
        System.out.println("Jadi Luas Segitiga adalah   :" +LuasSegitiga);
        System.out.println("");

        System.out.print("Masukkan nilai jari-jari      : ");
        int r = input.nextInt();
        int phi = 22/7;
        double LuasLingkaran = (double)((r*r)*phi)/2;
        System.out.println("Jadi Luas Segitiga adalah   : " +LuasLingkaran);
        System.out.println("");

        System.out.print("Masukkan nilai panjang        : ");
        int panjang = input.nextInt();
        System.out.print("Masukkan nilai tingginya      : ");
        int lebar = input.nextInt();
        double LuasPersegi = (double)(panjang*lebar);
        System.out.println("Jadi Luas Segitiga adalah   :" +LuasPersegi);
    }
}