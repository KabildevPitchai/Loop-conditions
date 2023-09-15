package Methods;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int no=1;no<=5;++no) {
			System.out.println(no);
		}
		
		int no1=1;
		while(no1<=5) {
			System.out.println(no1);
			no1++;
		}
		System.out.println("hi"+no1);
		
		int no2=1;
		for (;no2<=6;no2++) {
			System.out.println(no2);   //fixing error below the program
		}System.out.println("hello"+no2);
		
		/*for (int no2=1;no2<=6;no2++) {
			System.out.println(no2);
		}System.out.println("hello"+no2)*/
		
		//COMMON DIVISORS PROGRAM

		int val=100,val1=60;
		int div=2;int small=val<val1?val:val1;
		
//		if(val<val1)
//			small=val;
//		else
//			small=val1;
		
		while(div<=small) {
			if(val%div==0 && val1%div==0) 
			{
				System.out.println(div);
			}
			div++;
		}
		
		//GREAT COMMON DIVISER PROGRAM
		
		int val2=100,val3=60;
		int small1=val2<val3?val2:val3;
		int gcd=0;
		for(int div1=2;div1<=small1;div1++) {
			if(val2%div1==0 && val3%div1==0) 
			{
				gcd=div1;
			}
		}
		if(gcd!=0)
		System.out.println("GCD =>"+gcd);
		else
			System.out.println("no common divisors found");

	
	
	//LEAST COMMON MULTIPLE PROGRAM
	
	int n1=3;
	int n2=9;
	int big=n1>n2?n1:n2;
	while(true) {
		if(big%n1==0 && big%n2==0) {
		System.out.println("LCM IS =>"+big);	
		break;
		}
		big++;
	}
	
	
	
	
	
}
}



//FOR LOOP 
//1.INITIAL-only one
//2.CONDITION-every time before the action
//3.INCREMENT/DECREMENT-every time after the action