import java .util.Scanner;
public class maximum
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the values of n numbers ");
        int n=scr.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=scr.nextInt();
        }
        int max=ar[0];
        for(int i=1;i<n;i++)
        {
            if(ar[i]<max)
            {
                max=ar[i];
            }
            System.out.println("max "+ max);
        }
    }
}