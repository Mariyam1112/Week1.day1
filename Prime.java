package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// To check if a number is prime or not
		int n= 11;
		int count=0;
		for(int i=2;i<=n-1;i++) {
			if (n%i==0)
			count ++;
		}
		if (count==0)
			System.out.println("This is a prime number");
		else
			System.out.println("This is not a prime number");
		
    }

}
