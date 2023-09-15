package looping_statements;

public class Learn_Looping {

	public static void main(String[] args) {
		/*int count=0;
		if (count<5) {   //0<5
		System.out.print(count);  //1
		count=count+1;  //0+1=1
		}
		if (count<5) {
			System.out.print(count);//1<5
			count=count+1;  //1+1=2
			}
		if (count<5) {
			System.out.print(count); //2<5
			count=count+1;  //2+1=3
			}
		if (count<5) {
			System.out.print(count);  //3<5
			count=count+1;  //3+1=4
			}
		if (count<5) {
			System.out.print(count);  //4<5
			count=count+1;  //4+1=5
			}
		if (count<5) {  //ANS IS 5 BUT WHILE CONDITION < 5 SO ITS NOT POSSIBLE
			System.out.print(count);  
			count=count+1;
			}*/
		
	/*	
		//TASKS 
		System.out.print("hi"+" ");
		System.out.print("hi"+" ");
		System.out.print("hi"+" ");
		System.out.print("hi"+" ");
		System.out.print("hi"+" ");
		
		System.out.println("hi"+" ");
		System.out.println("hi"+" ");
		System.out.println("hi"+" ");
		System.out.println("hi"+" ");
		System.out.println("hi"+" ");
		
		int count=0;
		while(count<=5) {
			System.out.print(count+" "); 
			count=count+1;
			//count= count+2 -->count+=2
			//count= count*2 -->count*=2
		}
		
		int var=1;
		if (var<6) { // 1<6
			System.out.println(var);//1
			var=var+1;//1+1=2
		}
		if (var<6) { //2<6
			System.out.println(var);//2
			var=var+1; //3
		}
		
		if (var<6) {  //3<6
			System.out.println(var); //3
			var=var+1;//4
		}
		
		if (var<6) { //4<6
			System.out.println(var); //4
			var=var+1;//5
		}
		
		if (count<6) { //5<6
			System.out.println(count);//5
			count=count+1;//6
		}
		
		if (count<6) {  //6<6
			System.out.println(count);//not execute becoz condition failed
			count=count+1;//7
		} */
		
		//WHILE CONDITION 
		/*
		  int total=0; 
		  while (total<=8) {
			  System.out.print(total+" "); 
			  total=total+2;
		  }
		  //or total+=2 } 
		  int val=7;
		  while(val<=70) {
			  System.out.println(val);
		  }
		  val=val+7;//val+=7 }
		 
		
		int value=0;
		while(value<=99)
		{
			System.out.print(value+" ");
			System.out.println();
			//value=value+11;
			value+=11;//value=+11
		}
		
		int dec=5;
		while(dec>=0)
		{
			System.out.println(dec);
			System.out.println();
			dec=dec-1;
	}
		int no=9;
		while(no>=-1)
		{
			System.out.println(no);
			no=no-2;
		}*/
		
		/*int values=1;
		int diviser=3;
		while(values<=100) {
			if(values%diviser==0) {
			System.out.println(values);
		}
			values++;
//		}	*/
		
	/*	int number = 1;
		while(number <= 10){
			
			System.out.print(number + " ");
			number = number+2;
			if(number == 11)
				number=2;
		}
		
		
		int num1=10;
		int num2=2;
		while (num1 <= 90 && num2 <= 10) {
			System.out.println(num1);
			System.out.println(num2);
			num1 = num1 + 20;
			num2 = num2 + 2;
		}*/
		
		int array [] = {1,2,3,4,5};
		System.out.println(array.length);
//		 for(int i=0;i<=array.length-1;i++) {
//			 System.out.print(array[i]);
//			 
//		 }
 		 for(int i=array.length-1;i>=0;i--) {
			 System.out.print(array[i]);
			 
		 }
		 
		 
		
		
/*		String strArray [] = {"dhinesh","kabil","raj"};
		String name = "kabil";
		String city = "chennaimumbaikolakata";
		String names = "kabil dev";
		*/
		
}
}
