import java .util.Scanner;
public class dev {
    public static void main(String []args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the number");
        int n= scr.nextInt();
        int t=n;

        int i=2;
        while(t>0)
        {
            if(t%i==0)
            {
                System.out.print(i +" , ");
                t=t/i;

            }
            else
            {
                i++;
            }
        }
    }

}
