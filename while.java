import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan bilangan Bulat : ");
        int a = inputUser.nextInt();

        int hasil = 1;
        int i = a;
        while(i > 0){
            hasil *= i;
            i--;
        }
        System.out.println(hasil);

    }
}
