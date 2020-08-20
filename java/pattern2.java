import java.util.Scanner;

class pattern2
{
    public static void main(String[] args) 
    {
        System.out.print("Input number of lines:\t");
        Scanner sc = new Scanner(System.in);
        int i, j, n = sc.nextInt(); //Take input for number of lines
        sc.close(); //Closing the scanner
        for(i = n; i > 0; i--)  //changes i from n to 0
        {
            for(j = 0; j < i; j++) //prints the "*" i times
            {
                System.out.print("*");
            }
            System.out.println(""); //go to next line
        }
    }
}