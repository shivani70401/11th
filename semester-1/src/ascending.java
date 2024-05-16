import java.util.Scanner;

public class ascending
{
    public static void main(String[]args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("enter one number");
        int n=scr.nextInt();
        System.out.println("enter the values of n numbers ");
        int[] a=new int [n]; int temp ;
        for(int i=0;i<n;i++)
        {
            a[i]=scr.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("ascending order");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
