import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        int i=0;

        while (i < k){

            if (i % 12 == 0){
                sum += i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Toplam: " + sum);
    }
}