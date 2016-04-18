import java.util.Scanner;
/**
 * Write a description of class Fibonachi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonachi
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Fibonachi
     */
    public static void main()
    {
        int x;
        long num;
        for (int i = 0; i < 8; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("What would you like the number to be");
            x = scan.nextInt();

            num = fibonachi(x);

            System.out.println("The number " + x + " in fibonachi sequence is " + num);
        }
    }

    public static long fibonachi(int x){
        if (x <= 2){        
            return 1;
        }
        else {
            return fibonachi(x - 1) + fibonachi(x - 2);
        }

    }

}
