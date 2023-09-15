package looping_statements;

public class Learn_while_looping {

	public static void main(String[] args) {
		Learn_while_looping learn=new Learn_while_looping();
		learn.CD(); // common divisor method
		learn.GCD();//great common division b/w two numbers
		learn.MUL(); //multipliers of 3  method
		learn.LCM();
		learn.digits_break();
		learn.remains();
		learn.remains_in_oneline();
		learn.count_of_digits();
		learn.total_digits_add();
		learn.single_digit_output(1234567);
		/*learn.prime_numbers(100);
		learn.nestedWhile();
		//learn.prime_num_hundred();
			int start=2;
			while(start<=100) {
				learn.prime_numbers(start);
				start++;
				}*/
	}
	
	private void prime_numbers(int no) {
		//int no=4;
		int count=0;
		int div=2;
		while(div<no) {
			if(no%div==0) {
				count++;
			}
			div++;
		}
		if(count==0) {
			System.out.println( no+" " + "given no is prime");
		}
		else 
		{
			System.out.println( no +" " + "given not in prime");
		}
	}
		
		private void nestedWhile() {
			int no=2;
			int i=0;
			while(no<=100) {
				int count=0;
				int div=2;
				while(div<no) {
					if(no%div==0) {
						count++;
					}
					div++;
				}
				if(count==0) {
					i++;
				}
				no++;	
			}
			System.out.println(i);
	}

	private void CD() {
		int no1=15,no2=30;
		int small=no1<no2?no1:no2;
		int div=2;
		while(div<=small) {
			if(no1%div==0 && no2%div==0) {
				System.out.println(div);
			}div++;
		}System.out.println();
		
	}
	
	private void GCD() {
		int no1=15,no2=30;
		int small=no1<no2?no1:no2;
		int div=2;
		int great=0;
		while(div<=small) { //2<=15
			if(no1%div==0 && no2%div==0) { //(15%3==0&&30%3==0,
				//System.out.println(div);
				great=div;
			}div++;
		}
		System.out.println(great);
		System.out.println();
	}

	private void MUL() {
		int no=3;
		int count=1;
		while(count<=5) {
	 		System.out.println(count*no);
			count++;
		}
		System.out.println();
		
	}
	
	private void LCM() { //least common multiple
		int no1=15,no2=5;
		int big=no1>no2?no1:no2;
		
		while(true) {
			if(big%no1==0 && big%no2==0) {
				System.out.println(big);
				break;
				} big++;
		}System.out.println();
		
		
	}
	
	private void digits_break() {
		int no=1234;
		while(no>0)
		{
			System.out.println(no);//it gives 1234,123,12,1
			no=no/10; //1234/10,123/10,12/10,1/10-not execute becoz of while condition
		}System.out.println();
		
	}
	
	private void remains() {
		int no=1234;
		while(no>0) {
			System.out.println(no%10); // it gives remains value 4 3 2 1 
			no=no/10; //1234/10,123/10,12/10,1/10-not execute becoz of while condition
			
		}System.out.println();
		
	}
	
	private void remains_in_oneline() {
		int no=1234;
		while(no>0) {
			System.out.print(no%10);
			no=no/10;
			}System.out.println();
	}

	private void count_of_digits() {
		int no=877654;
		int count=0;
		while(no>0)
		{
			System.out.println(no%10);
			no=no/10;
			count++;
		}
		System.out.println(count);
		System.out.println();
	}
	
	private void total_digits_add() {
		int no=1234;
		int total=0;
		while(no>0) {
			total=total+no%10;//0+1234%10=0+4,4+123%10=4+3=7,7+12%10=7+2=9,9+1%10=9+1=10
			no=no/10;//1234/10=123,123/10=12,12/10=1 then loop stop
		}System.out.println(total);
		System.out.println();
		
	}
	
	
	private void single_digit_output(int no) {   //gets double value into single value
		//int no=1234567;
		int total=0;
		while(no>0) {
			total=total+no%10;
			no=no/10;
		} //output is 28
		
		if(total>9) { //28>9
			System.out.println(total); 
			this.single_digit_output(total);//method calling 
		}
		else
			System.out.println(total);
		
	}
}