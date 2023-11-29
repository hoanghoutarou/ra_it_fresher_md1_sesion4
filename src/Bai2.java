import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        float tbc=0;
        System.out.println("Nhap so phan tu:");
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        System.out.println("Nhap gia tri cac phan tu mang:");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.printf("Number[%d]= ",i);
            numbers[i]=Integer.parseInt(sc.nextLine());
        }
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println("Tổng của mảng: "+sum);
        tbc=(float) sum/n;
        System.out.printf("Trung bình cộng : %f",tbc);

    }
}
