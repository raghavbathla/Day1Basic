import java.util.Scanner;

public class LeapYear {


    public static void isLeapYear()
    {
        System.out.println("enter the year you want to check ");
        Scanner s = new Scanner(System.in);

        int year=s.nextInt();

        if (year % 4 == 0) {


            if (year % 100 == 0) {


                if (year % 400 == 0) {
                    System.out.println("it is leap year");
                }

                else {
                    System.out.println("it is not a leap year");
                }
            }



        }


        else


        {
            System.out.println("not Leap year");}
    }



    public static void main(String[] args)
    {

        LeapYear y = new LeapYear();
        y.isLeapYear();
    }
}


