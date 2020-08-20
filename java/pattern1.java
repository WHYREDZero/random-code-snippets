import java.util.Scanner;

class pattern1
{
    public static void main(String[] args) 
    {
        System.out.print("Input number of lines:\t");
        Scanner sc = new Scanner(System.in);
        int i, j, n = sc.nextInt(); //Take input for number of lines
        sc.close(); //Closing the scanner
        for(i = 0; i < n; i++)  //changes i from 0 to n-1
        {
            for(j = 0; j <= i; j++) //prints the "*" i times
            {
                System.out.print("*");
            }
            System.out.println(""); //go to next line
        }
    }
}