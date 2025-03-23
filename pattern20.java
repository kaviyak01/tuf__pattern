import java.util.*;
public class pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++)
        {
            int start=i;
            if(i>n)
            {
                start=2*n-i;
            }
            for(int j=0;j<start;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for(int j=start;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i<n)
            {
                space-=2;
            }
            else{
                space+=2;
            }

        }
    }
}

