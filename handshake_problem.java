import java.util.Scanner;
/*
Hand shake problem, n people shake hands with each other
Approach: n*n matrix count each i*j and j*i as single handshake, self handshake doesn't count
The catch: matrix isn't actually present, only counting the upper triangle of matrix, minus the diagonal
now divide the matrix in 3 parts 
(upper triangle minus diagonal[handshake i->j])<=This is all we need to count
(diagonal[self handshake])
(upper triangle minus diagonal[handshake i<-j,repeated handshakes])
matrix has n*n handshakes 
diagonal has n handshakes 
upper triangle and lower triangle have same number of handshakes
therefore actual handshakes=(total handshakes - self handshakes)/number of repeats per handshake
=> actual handshakes=((n*n)-n)/2
*/
class handshake_problem
{
    public static void main(String[] args) 
    {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(((n*n)-n)/2);
    }
}