import java.util.Scanner;
/*
Kaprekar Number
Take number, square it
Split number in middle
add the 2 parts
If original number is obtained then it's kaprekar number
*/
class kaprekar_number
{
    public static void main(String[] args)
    {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] sqn = return_split(n*n);
        int a = sqn[0], b = sqn[1];
        if ((a+b)==n)
        {
            System.out.println("Kaprekar Number");
        }
        else
        {
            System.out.println("Not a Kaprekar Number");
        }
    }   
    static int[] return_split(int a)
    {
        int test = a;
        int[] spl = new int[2];
        int count = 0;
        while (a!=0)//counting digits in a
        {
            count++;
            a = a/10;
        }
        a = test;
        if(count%2==0)//number of digits is even
        {
            for(int i = 0; i<count/2; i++)
            {
                test = test/10;
            }
            spl[0] = test;
            spl[1] = a-(test*((int)Math.pow(10, count/2)));
        }
        else //number of digits is odd, split is different, spl[0] has to be the smaller split
        {
            for(int i = 0; i<count/2+1; i++)
            {
                test = test/10;
            }
            spl[0] = test;
            spl[1] = a-(test*((int)Math.pow(10, count/2+1)));
        }
        return spl;
    }
}