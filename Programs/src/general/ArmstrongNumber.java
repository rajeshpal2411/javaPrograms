package general;

public class ArmstrongNumber {
	public static void main(String[] args){
		int num =153;
		int temp=num;
		int reminder;
		int sum = 0;
		
		int power = 0;
		while(temp>0) {
			temp = temp/10;
			power++;
		}
		temp=num;
		while(temp>0) {
			reminder= temp%10;
			sum+= (Math.pow(reminder, power));
			temp=temp/10;
			
		}
		if(num==sum) {
			System.out.println(num+" : is a Armstrong number : "+sum);
			
		}
	}

}
