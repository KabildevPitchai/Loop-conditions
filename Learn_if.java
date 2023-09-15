package conditional_statements;

public class Learn_if{
	public static void main (String[] args) 
	{
	 	 Learn_if li = new Learn_if();
		 // li.t20(100,90);
		  li.try_Series(350,350,350); 
		// li.interview();
		  
		 }

		/* private void interview() {
			 int age1=20;
			 int age2=25;
			 if(age1>age2) {
				 System.out.println("age2 is greater"); //only oneline code without using {}
			 }
			 else if(age2<age1) {
				 System.out.println("age1 is greater");
			 }else {
				 System.out.println("both are same");
			 }
	}*/
			 

		private void try_Series(int ind, int pak, int aus) {
		if(ind>pak) {
			if(ind>aus) {
				System.out.println("ind won");
			}else if(aus>ind) {
				System.out.println("aus won");
			}else {
				System.out.println("ind & aus won");
			}
		}else if(pak>ind) {
			if(pak>aus) {
				System.out.println("pak won");
			}else if(aus>pak) {
				System.out.println("aus won");
			}else {
				System.out.println("aus & pak won");
			}
			
		}else if(pak>aus && ind>aus) {
			System.out.println("ind & pak won");
		}else if (aus>ind && aus>pak){
			System.out.println("aus won");
		}else{
			System.out.println("ind & pak & aus are won");
		}
		
	}

		/*public void t20(int team1,int team2) {
		  //int ind =90;
		  //int pak=90;
		  if(team1>team2) {
		   System.out.println("team1 won");
		  }else if(team2 > team1) {
		   System.out.println("team2 won");
		  }else if(team1==team2){
		   System.out.println("both are same score");
	}
	}*/

}
