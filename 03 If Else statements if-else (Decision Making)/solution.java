import java.util.Scanner;
public class Solution {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        String output = "";
        if(a > b){
            output = "greater";
        }
        else if(a < b){
            output = "smaller";
        }
        else if(a == b){
            output = "equal";
        }
        else{
            output = "Invalid Input";
        }

        return output;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        compareIfElse(a, b);
    }
}
