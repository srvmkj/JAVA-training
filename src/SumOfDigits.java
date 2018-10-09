
public class SumOfDigits {
public static void main(String[] args){
	int i=567;
	int d=0,sum=0;
	while (i!=0)
	{
		d=i % 10;
		sum+=d;
		i=i/10;
	}
	System.out.println("sum of digits: "+sum);
}
}
