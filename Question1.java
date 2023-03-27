package assign1day2;
import java.util.Scanner;
public class Question1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System .out.println("enter marks");
		
	int marks=s.nextInt();
	
	String result=(marks>40)?"pass":"fail";
	
	System .out.println(result);
	}

}
