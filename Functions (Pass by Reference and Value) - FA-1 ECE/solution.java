import java.util.Scanner;
public class Solution {
    public static int Maximum(int a, int b){
        if(a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        return 0;
    }
    public static int Swap(int a, int b){
        int c = a + b;
        a = b;
        b = c - a;
        System.out.println(a + " " + b);
        return 0;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      switch(number){
          case 1: Maximum(a, b);
          break;
          case 2: Swap(a, b);
          break;
          default: System.out.print("Invalid input, only enter 1 or 2");
      }
    }
}
