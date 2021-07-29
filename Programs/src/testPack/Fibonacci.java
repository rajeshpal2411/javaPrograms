package testPack;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,count=10,fib;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<count;i++) {
			fib=n1+n2;
			
			System.out.println(fib);
			n1=n2;
			n2=fib;
			
		}

	}

}
