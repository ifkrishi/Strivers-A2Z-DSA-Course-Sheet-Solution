import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
		int i = 0;
		while(i != digits.length){
			if(digits[i] % 2 == 0){
				sumEven += digits[i];
			}
			if(digits[i] % 2 != 0){
				sumOdd += digits[i];
			}
			i++;
		}
		System.out.println(sumEven +" "+ sumOdd);
	}
}
