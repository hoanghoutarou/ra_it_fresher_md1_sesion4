import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        int [] numbers=new int[n];
        System.out.println("Nhap phan tu");
        for(int i=0;i<n;i++){
            System.out.printf("Number[%d]= ",i);
            numbers[i]=Integer.parseInt(sc.nextLine());
        }
        int max = numbers[0];
        int min= numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        for(int i=0; i<numbers.length;i++){
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.printf("\n giá trị max: %d",max);
        System.out.printf("\ngiá trị min: %d ",min);
    }
}
