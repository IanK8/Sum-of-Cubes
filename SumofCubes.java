import java.util.Scanner;

public class SumofCubes{
    public static void main(String[] args) {
        int num;
        int integer;
        int digit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        while (num > 0) {
            digit = num % 10;
               System.out.print(digit + "*" + digit + "*" + digit + "+");
               num = num / 10;
               integer = digit * digit * digit;

            }
        System.out.print(" = " + digit);
    }
}