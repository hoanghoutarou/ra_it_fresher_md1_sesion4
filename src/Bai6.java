import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu");
        int n = Integer.parseInt(sc.nextLine());
        int []arr = new int[n];
        System.out.println("Nhap phan tu");
        for(int i=0;i<n;i++){
            System.out.printf("arr[%d]= ",i);
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhap vao mot so:");
        int find = Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int element : arr){
            if (element==find){
                sum+=find;
            }
        }
        System.out.printf("Tong cac phan tu co gia tri bang %d la %d",find,sum);
    }
}
