import java.util.Scanner;
/*
Collatz sequence
a[i]=(a[i-1]%2==0)?(a[i-1]/2):(3*a[i]+1)
*/
class collatz_sequence
{
    public static void main(String[] args) 
    {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        while(n!=1)
        {
            System.out.print(n+" ");
            n = (n%2==0)?(n/2):(3*n+1);
        }
        System.out.print(n);
    }   
}