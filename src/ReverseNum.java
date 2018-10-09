
public class ReverseNum {
public static void main(String[] args){
	int i=56045;
	int d=0,rn=0;
	while (i!=0)
	{
		d=i % 10;
		rn=rn*10+d;
		i=i/10;
	}
	System.out.println("reverse number: "+rn);
}
}