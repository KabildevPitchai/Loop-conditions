package looping_statements;

public class New_task {

	public static void main(String[] args) {
	New_task task=new New_task(); 
	//task.fibonacci();
//	task.polindrome();
//	task.amstrong();
//	task.fd();
//	task.ld();
//	task.par_div();
//	task.par_div1();
//	task.div_mul();
//	task.cd();
//	task.gcd();
//	task.lcm();
//	task.digit_break();
//	task.remains();
	task.fib_sub();
//	task.();
	}

	private void remains() {
		int no=12345;
		while(no>0) {
			no=no%10;
			System.out.println(no);
		}
		
	}

	private void digit_break() {
		int no=45678;
		while(no>0) {
			System.out.println(no);
			no=no/10;
		}
	}

	private void lcm() {
		int no1=50;
		int no2=100;
		int lcm=no1<no2?no1:no2;
		while(true) {
			if(lcm%no1==0 && lcm%no2==0) {
				System.out.println(lcm);
				break;
			}lcm++;		
		}
	}

	private void gcd() {
		
	}

	private void cd() {
		int no1=50,no2=100;
		int cd=no1>no2?no1:no2;
		int div=2;
		while(div<=cd) {
			if(no1%div==0 && no2%div==0) {
			System.out.println(div);
			}div++;
		}
	}

	private void div_mul() {int no=100;
	int mul=1;
	while(mul<=10) {
		System.out.println(no*mul);
		mul++;
	}
	}

	private void par_div() {
		int no=100;
		int ntime=1;
		while(ntime<no) {
			if(no%ntime==0) {
			System.out.println(ntime);
			}ntime++;
		}
	}

	private void par_div1() {
		int no=100;
		int div=2;
		int count=1;
		while(div<no) {
			if(no%div==0) {
				if(count==6) {
					System.out.println(div);
				}count++;
			}div++;
		}
		
	}

	private void ld() {
		int n1=20;
		int ld=2;
		int last=0;
		while(ld<n1) {
			if(n1%ld==0) {
				last=ld;
			}
			ld++;
		} System.out.println(last);
		
	}

	private void fd() {
		int n=20;
		int fd=2;
		while(fd<n) {
			System.out.println(fd);
			break;
		} fd++;
	}

	private void amstrong() {
		int no1=153;
		int no=no1; //153
		int sum=0;
		while(no1>0) {  //153>0,15>0,1>0
			int digit=no1%10; //153%10=3,15%10=5,1%10=1
			sum=sum+(digit*digit*digit); //0+3*3*3=27,27+5*5*5=152,152+1*1*1=153 it goes to line 22
			no1=no1/10; //153/10=15,15/10=1`
		}
		if(no==sum) {
			System.out.println(no+" "+"given num is amstrong num");
		}else {
			System.out.println(no+" "+"given num is not a amstrong num");
		}
	}

private void palindrome() {
	int num=121;
	int num1=num;
	int rev=0;
	while(num>0) {
		int rem=num%10;//121%10=1,12%10=2,1%10=1
		
	rev=(rev*10)+rem;//0*10+1=1,1*10+2=12,12*10+1=121
		num=num/10;//12 ,12/10=1
		//System.out.print(rem+" ");
	}System.out.print(rev+" ");
	if(num1==rev) {
		System.out.println("palindrome num");
	}
	else {
		System.out.println("not a palindrome num");
	}
}
	private void fib_sub() {
		int first=0;
		int second=1;
		int i=0;
		while(i<8) {
			int third=first+second;
			System.out.print(first+" ");
			first=second;
			second=third;
			i++;
			}
		}
}
