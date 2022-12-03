
public class numOfSteps {
	public static void main(String[] args) {
		int i = 14;
		
		int s = step(i);
		
		System.out.print(s);
		
	}
	
	public static int step(int i) {
		int c =0;
		
		while(i>0) {
			if (i%2==0) {
				i = i/2;
				c++;
			}
			else {
				i = i-1;
				c++;
			}
		}
		return c;
		
		
	}

}
