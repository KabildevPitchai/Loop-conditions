package looping_statements;

public class Compsitenumbers {

	public static void main(String[] args) {
		
		//we GOT PARTICULAR DIVIDER EX:1TH DIV,2ND DIV,4TH DIV from this code
		int v=50;
		int d=2;
		int u=0;
	 	while(d<50) 
		{
			if(v%d==0) 
 			{
				if(u==3)  //this condition decide ur div values
				{
					System.out.println(d);	
				}u++;
			}d++;
		}
	}
}

