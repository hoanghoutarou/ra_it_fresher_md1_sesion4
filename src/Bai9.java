import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhâp số lượng phan tu cua mang: ");
        int n=Integer.parseInt(sc.nextLine());
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]: ",i);
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        for (int temp:arr) {
            System.out.printf("%d\t",temp);
        }
        System.out.println("\nNhập vị trí cần xóa: ");
        int deleteIndex=Integer.parseInt(sc.nextLine());
        int [] newArr = new int[n-1];
        for(int i=0,j=0;i<n;i++){
            if(i!=deleteIndex){
                newArr[j]=arr[i];
                j++;
            }
        }
        System.out.println("Sau khi xóa ");
        for (int temp:newArr) {
            System.out.printf("%d\t",temp);
        }
    }
}
