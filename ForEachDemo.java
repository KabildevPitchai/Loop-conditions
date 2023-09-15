package looping_statements;

public class ForEachDemo {

	public static void main(String[] args) {
		int[] marks= {89,74,86,93,65};
//		              0  1  2  3  4
		
//		for(int i=marks.length-1;i>=0;i--) { //reverse condition
//		if(i%2==0) //for even position condition
//		if(i%2!=0) //for odd position condtion
//			System.out.println(marks[i]);
//		}
	
		//foreach loop intitalization is fore(ctrl+space) to get foreach ...
		
 		for (int i : marks) {   
			System.out.println(i);
		}
		
		
		
		
		
	
	
	}
}
