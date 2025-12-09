import java.util.Scanner;

class hours
{
    static int hcalc(int h)
    {   
        return 24 - h;
    }
}



public class problem1{
    public static void main(String[] args)
    {
        hours employee1 = new hours();
        System.out.println("hours worked: ");
        Scanner work = new Scanner(System.in);
        int num = work.nextInt();
        System.out.println("The amont of hours slept is: "+ employee1.hcalc(num));
    }

}