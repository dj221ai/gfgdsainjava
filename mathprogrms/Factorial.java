import java.util.Scanner;

// Recursive approach in Java

public class Factorial{

    static long fact(long n){
        if (n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        // iterative approach
        // int n,temp=1;
        // System.out.println("Enter number: ");
        // try (Scanner sc = new Scanner(System.in)) {
        //     n=sc.nextInt();
        // }
        // // if(n==0){
        // //     System.out.println("Factorial of 0 is 1");
        // // }
        // for(int i=2;i<=n;i++){
        //     temp=temp*i;
        // }
        // System.out.println("factorial of "+n+" is "+temp);

        long res;
        res=fact(5);
        System.out.println("result is "+res);
    }
        
}
