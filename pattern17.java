import java.util.*;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            char c='A';
            int breakpoint=(2*i+1)/2;
            for(int k=1;k<=2*i+1;k++)
            {
                System.out.print(c+" ");
                if(k<=breakpoint)
                {
                    c++;
                }
                else{
                    c--;
                }
                
            }
            System.out.println();
        }
    }
}
