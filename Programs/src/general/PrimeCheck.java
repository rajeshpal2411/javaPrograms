package general;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i>=20;i++) {
			isPrime(i);
		}
		
	
	}
static void isPrime(int num) {
	int flag=0;
	if(num==0 || num==1) {
		System.out.println(num +" is not a prime number");
	}else {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(num +": is not a prime number");
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println(num +": is PRIME");
		}
	}
	
}
}
