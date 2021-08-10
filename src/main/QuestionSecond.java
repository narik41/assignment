import exception.NumberOutOfRangeException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program to find all n-digit numbers with an equal sum where n varies from 1 to 9 and sum <=81
 * Here, the value of n and sum will be provided by a user. If sum is found, then output will print all the
 * list of n-digit number
 *
 * @author Kiran Subedi
 * @Date 2021/08/08
 */
public class QuestionSecond {

    static void findNDigitEqualSum(String result, int n, int sum){

        if(n>0 && sum>0){
            char digit = '1';
            for(;digit<='9'; digit++){
                findNDigitEqualSum(result+digit, n-1, sum-(digit-'0'));
            }
        }else if(n==0 && sum == 0){
            System.out.print(result+" ");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("The value of n:");
        int num=0, sum =0 ;
        try{
            // get the n digit numbers
            num = sc.nextInt();
            if(num<1 || num>9){
               throw new NumberOutOfRangeException("Invalid n value.");
            }

            // get the sum value
            System.out.print("Must have sum of: ");
            sum = sc.nextInt();
            if(sum>81){
                throw  new NumberOutOfRangeException("Invalid sum value");
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid n value.");
            System.exit(-1);
        }catch (NumberOutOfRangeException e){
            System.out.println(e.getMessage());
            System.exit(-1);
        }catch(Exception e){
            System.out.println("!!!!Error!!!!");
            System.out.println(1);
        }

        String result = "";
        findNDigitEqualSum(result, num, sum);
    }
}
