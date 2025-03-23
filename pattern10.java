import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
            System.out.println();
        }
    }
}
