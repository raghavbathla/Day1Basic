import java.util.Scanner;

public class TwoStringCompare {
    public static void main(String[] args) {

        String s1 ,s2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String");
        s1 = sc.nextLine();

        System.out.println("Enter second String");
        s2 = sc.nextLine();
        // Comparing two input string
        if (s1.equals(s2))
            System.out.print("both are equal");
        else
            System.out.print("no single Strings  matching");
    }
}
