import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {

    Scanner scanner = new Scanner(System.in);
    String alg, int1, int2;
    BigInteger big1, big2, result;

    public void inputCompute() {

        //input for values
        System.out.println("Add first value to compute:");
        int1 = scanner.nextLine();
        System.out.println("Add second value to compute:");
        int2 = scanner.nextLine();

        //String to BigInt
        big1 = new BigInteger(int1);
        big2 = new BigInteger(int2);

        //type alg1 or alg2
        System.out.println("Select alg1 or alg2: ");
        alg = scanner.nextLine();

        switch (alg) {
            case "alg1":
                result = big1.multiply(big2);
                break;
            case "alg2":
                result = big2.multiply(big1);
                break;
            default:
                System.out.println("Wrong input!");
        }
    }


    public void output() {
        System.out.println("\nResult: " + result);
    }
}
