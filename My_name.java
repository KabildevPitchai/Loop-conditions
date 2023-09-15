package looping_statements;

public class My_name {

	public static void main(String[] args) {
		My_name m=new My_name();
		m.name_k();
		m.name_a();
		m.name_r();
		m.name_t();
		m.name_h();
		m.name_i();
		m.name_k1();
		m.name_a();
		
	}

	private void name_k1() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1||row==1&&col==4||row==5&&col==4||row==2&&col==3||row==4&&col==3||row==3&&col==2) {
					System.out.print("K ");
				} 
				else
					System.out.print("  ");
			}System.out.println();
		}System.out.println();
		
	}

	private void name_i() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||row==5||col==3)
					System.out.print("I ");
				else
					System.out.print("  ");
			}System.out.println();
		}System.out.println();
		
	}

	private void name_h() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1||col==5||row==3)
					System.out.print("H ");
				else 
					System.out.print("  ");
			}System.out.println();
		}System.out.println();
	}

	private void name_t() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==3) {
					System.out.print("T ");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
		
	}

	private void name_r() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==1||col==4||row==3||row==4&&col==3||row==5&&col==4) {
					if(row==4&&col==4) {
					System.out.print("  ");
					}
					else
					{
						System.out.print("R ");
					}
				}	
				else
					System.out.print("   ");
			}System.out.println();
		}System.out.println();
		
	}

	private void name_a() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || row==1 || row==3  || col==5) {
					if(row==1&&col==1||row==1&&col==4) 
						System.out.print(" ");
						
					else
						System.out.print("A ");
				}
				else
					System.out.print("  ");
				
			}System.out.println();
		}
		System.out.println();
		
	}

	private void name_k() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1||row==3&&col==2||row==2&&col==3||row==1&&col==4||row==4&&col==3||row==5&&col==4) {
					System.out.print("K ");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}System.out.println();
	}

}
