import java.util.*;
public class pattern19 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           
            for(int j=i;j<=n;j++)
            {
               System.out.print("*");
            }
            int space=2*i-2;
            for(int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
               System.out.print("*");
            }
            System.out.println();

           
        }
        for(int i=n;i>0;i--)
        {
           
            for(int j=n;j>=i;j--)
            {
               System.out.print("*");
            }
            int space=2*i-2;
            for(int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
               System.out.print("*");
            }
            System.out.println();

           
        }
    
    }
}
