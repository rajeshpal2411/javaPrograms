package general;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am Rajesh Pal";
		String output = "";
		String[] arr = str.split(" ");
		for(int i = arr.length-1; i>=0;i--) {
			output= output+arr[i]+" ";
		}
		System.out.println(output);
	}

}
