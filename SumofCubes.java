import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofCubes{
    public static void main(String[] args) {
        int num;
        int digit;
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = input.nextInt();
        while(num >0){
            list.add((num%10)*(num%10)*(num%10));
            num = num / 10;
        }
        for (int i = 0; i < list.size(); i++){
            digit += list.get(i);
        }
        System.out.println(digit);
    }
}
