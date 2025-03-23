import java.util.*;
public class pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=i-1;j<n;j++)
            {
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();

        }
    }
}
