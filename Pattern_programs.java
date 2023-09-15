package looping_statements;

public class Pattern_programs{

	public static void main(String[] args) {
		Pattern_programs p=new Pattern_programs();
		//p.ten();
		//p.increment_pattern();
		//p.decrement_pattern();
		p.name_pattern_k();
		p.name_a(); 
		p.name_b();
		p.name_i();
		p.name_l(); 
		p.name_d();
		p.name_e();
		p.name_v();
		 

	}

	private void name_v() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1||col==5||row==4||row==5) {
					if(row==4&&col==1||row==4&&col==3||row==4&&col==5||row==5&&col==1||row==5&&col==2||row==5&&col==4||row==5&&col==5) 
					{
						System.out.print("  ");
					}
					else 
						System.out.print("@ ");
						}
				else 
					System.out.print("  ");
				}
			System.out.println();
			}
		System.out.println();
	}

	private void name_e() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==1||row==3||row==5) {
					System.out.print("@ ");
				}
				else
					System.out.print("  ");
			} System.out.println();
		}System.out.println();
	}

	private void name_d() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || row==1 || col==5 || row==5) {
					if(row==1 && col==5 || row==5 && col==5 ) {
						System.out.print(" ");
					}
					else
						System.out.print("@ ");
					}
				else 
					System.out.print("  ");
				}System.out.println();
				}System.out.println();
	}

	private void name_l() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || row==4) {
					if(col==1 && row==5) 
					{
					System.out.print(" ");
					}
					else 
						System.out.print("@ ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}System.out.println();
	}

	private void name_i() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1 || col==3 || row==5 )
					System.out.print("@ ");
				else 
					System.out.print("  ");
				}System.out.println();
			}System.out.println();
	}

	private void name_b() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || row==3 || row==1 ||row==5 || col==5) {
					if(row==1 && col==5 || row==5 && col==5) {
					System.out.print("  ");
				}
				else
					System.out.print("@ ");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}System.out.println();
	}

	private void name_a() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(	col==1 ||row==1 || col==5 || row==3) {
					if(row==1 && col==1 ||row==1 && col==5) {
					System.out.print("  ");
				}
				else
					System.out.print("@ ");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}System.out.println();
	}
	

	private void name_pattern_k() 
	{
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1|| row==3 && col==2 || row==2 && col==3 || row==1 && col==4 || row==4 && col==3 || row==5 && col==4)
					System.out.print("@ ");
				else
				System.out.print("  ");
			}System.out.println();
		}System.out.println();
	}	
	

	private void ten() {
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}

	private void decrement_pattern() {
		for(int row=1;row<=5;row++) {
			for(int col=row;col<=5;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private void increment_pattern() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}


}






