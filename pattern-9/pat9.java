import java.util.*;

public class pat9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.print("\n");
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i+1;j++)
                System.out.print(" ");
            for(int k=0;k<(n-i)*2+1;k++)
                System.out.print("*"); 
            System.out.print("\n");       
        }
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<i+1;j++)
                System.out.print(" ");
            for(int k=0;k<(n-i)*2+1;k++)
                System.out.print("*");
            System.out.print("\n");        
        }
        System.out.print("\n");
        sc.close();
    }    
}
