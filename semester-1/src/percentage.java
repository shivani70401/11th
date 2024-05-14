import java . util .Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] name = new String[5];
        System.out.println("enter the name");
        for (int i = 0; i < 5; i++) {
            name[i] = scr.nextLine();
        }
        int[] r = new int[5];
        System.out.println("enter the roll number");
        for (int i = 0; i < 5; i++) {
            r[i] = scr.nextInt();
        }
        int[] age = new int[5];
        System.out.println("enter the age");
        for (int i = 0; i < 5; i++) {
            age[i] = scr.nextInt();
        }
        double[] percent = new double[5];
        System.out.println("enter the percentage");
        for (int i = 0; i < 5; i++) {
            percent[i] = scr.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] +" "+ age[i] + " years old whose roll number is " + r[i] + " got " + percent[i] + " % ");
        }
    }
}