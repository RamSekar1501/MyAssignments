package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int fn = 0;
		int sn= 1,tn;
		System.out.println(fn);
		System.out.println(sn);
		for (int i=2;i<8;i++)
		{
			tn=fn+sn;
			System.out.println(tn);
			fn=sn;
			sn=tn;
		}

	}

}
