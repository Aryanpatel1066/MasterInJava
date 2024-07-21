package loopQuestion;
import java.util.Scanner;
public class SolveLoopQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //question1) the sum of N natural number
        int sum = 0;
        System.out.println("enter the N number:");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("the sum of"+n+"number is "+sum);
    }
}
