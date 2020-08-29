import java.util.Scanner;
/*
Staircase Problem
We will try to solve this using simple trees and count the end nodes
the catch, the trees don't exist, we are using a recursive solution
at each step we create a binary tree and test if the left steps are 0 or less than 0
if 0, we have reached viable solution, return 1
if less than 0, return 0
if greater than 0, split the node
*/
class staircase_problem
{
    public static void main(String[] args) 
    {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(combo_check(n)); 
    }
    static int combo_check(int n)
    {
        if(n==0)//viable solution reached
        {
            return 1;
        }
        if(n<0)//useless solution reached
        {
            return 0;
        }
        return combo_check(n-1) + combo_check(n-2);//binary tree split
    }
}