package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		//To print fibonacci series
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		
		for(int i=3;i<=11;i++) {
			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
		
			
		}
	}
}
