package extra;

public class Fibonacci {
public static void main(String[] args) {
	int num=0;
	int num2=1;
	int sum;
	System.out.println(num);
	System.out.println(num2);
	for (int i = 0; i <12 ; i++) {
		sum=num+num2;
		
		System.out.println(sum);
		num=num2;
		num2=sum;
		
	}
}
}
