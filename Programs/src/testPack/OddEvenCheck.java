package testPack;

public class OddEvenCheck {

	public static void main(String[] args) {
		for(int i=0; i<=10;i++) {
			isOdd(i);
		}

	}
	static void isOdd(int num){
		if(num%2==0 || num==0) {
			System.out.println(num +"is evn");
		}else
			System.out.println(num+" is odd");
		
	}

}
