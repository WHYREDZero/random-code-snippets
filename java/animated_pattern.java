import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class pattern
{
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.print("Input number of lines:\t");
        Scanner sc = new Scanner(System.in);
        int i, j, n = sc.nextInt(), slp = 60; //Take input for number of lines
        sc.close(); //Closing the scanner
        for(i = 1; i <= n; i++)  //changes i from 0 to n
        {
            for(j = 0; j < n-i; j++) //prints the " " n-i times
            {
                System.out.print(" ");
            }
            for(j = 1; j < 2*i; j++) //prints the "*" 2i-1 times
            {
                if((j == 1) || (j == 2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            TimeUnit.MILLISECONDS.sleep(slp);
            System.out.println(""); //go to next line
        }
        for(i = n-1; i > 0; i--)  //changes i from n-1 to 0
        {
            for(j = 0; j < n-i; j++) //prints the " " n-i times
            {
                System.out.print(" ");
            }
            for(j = 1; j < 2*i; j++) //prints the "*" 2i-1 times
            {
                if((j == 1) || (j == 2*i-1))//if its the first or the last char, print *
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            TimeUnit.MILLISECONDS.sleep(slp);
            System.out.println(""); //go to next line
        }
    }
}
