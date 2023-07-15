import java.util.Scanner;
public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double area = 0.0;
        double pi = 22 / 7;
        switch(ch){
            case 1 : area = Math.PI*(a[0]*a[0]);  
            break;
            case 2 : area = a[0] * a[1];
            break;
            default: System.out.println(0.0);
        }
        return area;
    }
}
