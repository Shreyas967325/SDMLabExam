public class Factorial{
	public static int factNum(int num){
		if(num == 0){
		return 1;
		}
		return num * (factNum(num - 1));
}
 public static void main(String args[]){
	int num=5;
	System.out.println("Factorial of number is : " + factNum(num));
}
}
