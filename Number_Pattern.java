import java.util.Scanner;
public class Number_Pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int row=1;
        int space=n-1;
        int stars=1;
        int st=9;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            
            while(j<=stars){
                if(j==((2*row-1)/2+1)){
                    System.out.print(0+" ");
                }
                else if(j<=(2*row-1)/2){
                    System.out.print(st+" ");
                    st++;
                }
                else{
                st--;
                System.out.print(st+" ");
                
                }
                j++;
                
            }
            space--;
            stars+=2;
            if(row>1){st--;}
            System.out.println();
            row++;
        }
    }
}
