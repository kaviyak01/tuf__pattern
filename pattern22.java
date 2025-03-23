import java.util.*;
public class pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
            //  int top = i;
            //  int bottom = j;
             int right = (2*n - 2) - j;
             int bottom= (2*n - 2) - i;
             int temp=Math.min(Math.min(i,j), Math.min(bottom,right));
             System.out.print(n- temp + " ");
            }    
            System.out.println();
        }
    }
}
