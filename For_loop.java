package looping_statements;

public class For_loop {

	public static void main(String[] args) {
		For_loop f=new For_loop();
		f.num_pattern();
		f.left_triangle();
		f.right_triangle();
		f.triangle();
		f.testPattern();
		f.fivedecrease_pattern();
 		f.number_row();
	}

	private void number_row() {
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(row);
			}System.out.println();

		}System.out.println();
	}

	private void fivedecrease_pattern() {
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print(col);
			}System.out.println();
		}System.out.println();
	}

	private void triangle() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}System.out.println();
		}
		System.out.println();
	}

	private void right_triangle() {
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print(col);
			}System.out.println();
		}System.out.println();
	}

	private void left_triangle() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}System.out.println();
		}System.out.println();
	}

	private void num_pattern() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}System.out.println();
		}System.out.println();
	}

	private void testPattern() {
		int sum = 0;
		for (int row = 5; row <= 9; row++) {
			System.out.print(row + " ");
		}
		System.out.println();
		System.out.println();
		for (int row = 5; row <= 9; row++) {
			System.out.println(row + " ");
			sum = sum + row;
		}
		System.out.println();
		System.out.println("Sum value is : " + sum);
		System.out.println();
	}
}
