import java.util.Scanner;


public class Prime {
    // naive mtd
    boolean isPrimeNaive(int n){
        if (n==1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        boolean res;
        System.out.println("Enter nos: ");
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
        }
        Prime pr = new Prime();
        res = pr.isPrimeNaive(n);
        System.out.println(res);
    }
}

    
