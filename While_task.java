package looping_statements;

public class While_task {

	public static void main(String[] args) {
		While_task w=new While_task();
		w.div_of_100();
	}

		
		
		private void div_of_100() {
			int no=1;
			int div=5;
			while(no<100){
				if(no%div==0)
			System.out.println(no);
			no++; 
			}
		}
	}



		//IT'S A COMPOSITE NUMBER TASK
		
		/*
		 int no=50;
		  int div=2;
		  while(div<50) { 
			  if(no%div==0) {
		  System.out.println(div); 
		  break ; // break keyword is use to "BREAK THE LOOP"
		  }
		  div++; }
		 
		  int no1=50; 
		  int div1=2; 
		  int last=0; 
		  while(div1<50) { 
			  if(no1%div1==0) {
		  last=div1; //div1++; its not possible otherwise its gives infinite loop 
		  }
		  div1++;
		  }
		 System.out.println(last);
	
	int val=100;
	int var=5;
	int hi=0;
	while(var<=val/2){
		if(val%var==0) {  
			if(hi==3) {
				System.out.println(var);
			}hi++;
		}
		var++; 
	}*/
		
	/*	int no=100;
		int div=5;
		//int div1=3;
		while(div<=no) {
			if(no%div==0) {
				System.out.println(div);
//				System.out.println(div1);
			}
			div++;
		}*/
		
		
	




