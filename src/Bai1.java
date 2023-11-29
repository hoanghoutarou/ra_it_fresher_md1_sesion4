import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Nhap gia tri cac phan tu mang:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]=",i);
            numbers[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Gia tri cac phan tu trong mang:");
        for (int i =0;i<numbers.length;i++){
        System.out.printf("%d\t",numbers[i]);
    }
    }
}