// euclidean mtd 1 for gcd

import java.util.Scanner;

public class Gcd {
    static int gcdfinder(int a, int b){
        while (a!=b) {
            if (a>b) {
                a-=b;
            }
            else{
                b-=a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Enter numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            n1=sc.nextInt();
            n2=sc.nextInt();
        }
        int res=gcdfinder(n1, n2);
        System.out.println("GCD is "+ res);
    }
}
