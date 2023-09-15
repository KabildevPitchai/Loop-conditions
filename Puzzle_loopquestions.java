package looping_statements;

public class Puzzle_loopquestions {

	public static void main(String[] args) {
		Puzzle_loopquestions p=new Puzzle_loopquestions();
//		p.thenaliq1();
		p.templeq2();
		p.magicpondq3();

	}

	private void magicpondq3() {
		
	}

	private void templeq2() {
		int temple=7;
		int flower=1;
		while(temple>=1) {
			flower=flower*2; 
			System.out.println(temple+" out "+flower);
			temple--;
		}
		System.out.println(flower);
	}

	private void thenaliq1() {
		int beat=1024;
		int security=0;
		while(beat>1) {
			beat=beat/2;
			//System.out.println(beat);
			security++;
			System.out.println(security+" got "+beat);
		}System.out.println(security);
		
	}
	
	

}
