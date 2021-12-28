package Loops.Exercises5;
import java.util.Scanner;
public class LoopExercises5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n,k,sum=1;
            System.out.print("Please enter the number to be exponentiated:");
            n=input.nextInt();
            System.out.print("Enter the number with the exponent:");
            k=input.nextInt();
            for(int i=1; i<=k; i++){
            sum=sum*n;
            
   
        }
        System.out.println(sum);
        }
    
    
    }
    
}
