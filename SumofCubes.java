import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SumofCubes{
    public static void main(String[] args) {
        int num;
        int sum;
        sum = 0;
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input a whole number ");
        num = input.nextInt();
        while (num > 0){
            list.add((num % 10)*(num % 10)*(num % 10));
            num = num / 10;
        }
        for (int i = 0; 1 < list.size(); i++) {
            sum += list.get(1);
        }
        System.out.println(sum);
    }
}