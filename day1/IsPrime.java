package week1.day1;

public class IsPrime {
public static void main(String[] args) {
	int n = 61;
	for(int i=2;i<=n-1;i=i+1) {
		if(n%i==0) {
			System.out.println("The given number is non-prime");
		}
	}
		System.out.println("The given number is prime");
}
}
