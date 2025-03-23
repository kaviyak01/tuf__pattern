import java.util.*;
public class pattern12 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=j)
                {
                    System.out.print(j);
                }
                else
                {
                System.out.print(" ");
                }
            
            }
            
            for(int k=n;k>0;k--)
            {
                if(i>=k)
                {
                System.out.print(k);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
