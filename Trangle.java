import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int row=1;
        int space=n;
        int stars=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            space--;
            stars+=2;
            System.out.println();
            row++;
        }
    }
}
