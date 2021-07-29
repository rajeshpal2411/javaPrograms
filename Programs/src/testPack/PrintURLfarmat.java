package testPack;

public class PrintURLfarmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "http:\\/\\/172.31.25.166:8020";
		System.out.println(str.replace("\\", ""));
String str1 = "papa";
System.out.println("[\""+str1+"\"]");
	}

}
//EXPECTED OUTPUT: http://172.31.25.166:8020