import java.util.Scanner;

public class TotalZerosCount {

    static long countZeros(long nos){
        long res=0;
        int counter=5;
        while (counter <= nos) {
            res=res+(long)(nos/counter);
            counter *= 5;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter factorial nos: ");
        long nos;
        try (Scanner sc = new Scanner(System.in)) {
            nos=sc.nextLong();
        }
        long result=countZeros(nos);
        System.out.println("Trailing zeros are : "+ result);
    }
}
