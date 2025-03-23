
import java.util.*;
public class middlepattern {
    public static void main(String[] args)
    
    {
           Scanner sc=new Scanner(System.in);
           String s=sc.next();
           String str="";
           for(int i=s.length()/2;i<s.length();i++)
           {
               str+=s.charAt(i);
               System.out.print(str+"$"+" ");
               
           }
           for(int j=0;j<s.length()/2;j++)
           {
              str+=s.charAt(j);
              System.out.print(str+"$"+" ");
           }
    }
}
