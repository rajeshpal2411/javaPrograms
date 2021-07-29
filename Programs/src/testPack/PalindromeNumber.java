package testPack;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number=232,sum=0,r;
		int temp=232;
		while(number>0) {
			r =number%10;
			sum=(sum*10)+r;
			number=number/10;
			
			
	}
		if(sum==temp) {
			System.out.println("Palindrone");
		}else
		{
			System.out.println("Not pal");
		}

}

}
