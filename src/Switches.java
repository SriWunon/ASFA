
public class Switches {
	private static int lighton = 100;
	
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if ( i == 1) {
				for (int j = 1; j <= 100; j++) {
					if (j % 2 == 0) {
						lighton++;
					}
				}
			} else {
				for (int j = 1; j <= 100; j++) {
					if (j % 3 == 0) {
						lighton++;
					}
				}
			}
		}
		
		System.out.println("light on: " + lighton);

	}

}
