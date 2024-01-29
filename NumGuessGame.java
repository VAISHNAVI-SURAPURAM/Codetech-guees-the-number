import java.util.*;
public class NumGuessGame {
	public static void main(String a[]) {
	Random random=new Random();
	int r=random.nextInt(100);
	Scanner sc=new Scanner(System.in);
	System.out.println("number of attempts");
	int n1=sc.nextInt();
	for(int k=0;k<n1;k++) {
		System.out.println("enter a number");
		int n=sc.nextInt();
	if(n>r) {
		System.out.println("too large ");	
	}
	else if(n<r) {
		System.out.println("too small");
	}
	else {
		System.out.println("you guessed right");
		break;
	}
	}
sc.close();
}
}