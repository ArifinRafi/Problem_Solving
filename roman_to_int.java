import java.util.Scanner;
class sol {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(romanToInt(s));
        
        
    }
    
    public static int romanToInt(String s) {
        
        int sum = 0;
		int s1 = 0;
		int s2 = 0;
        
                
        for (int i = 0; i< s.length(); i++) {
			s1 = value(s.charAt(i));
			
			if (i+1 < s.length()) {
				s2 = value(s.charAt(i+1));
				
				if (s1 < s2) {
					sum = sum-s1;
				}
				else {
					sum = sum+s1;
				}
			}
			else {
				sum = sum+s1;
			}
			}
			
		
		return sum;
				
			}
    
     static int value(char j) {
        
        if ( j == 'I') {
		return 1;
	}
	
	else if ( j == 'V') {
		return  5;
	}
	
	else if ( j == 'X') {
		return 10;
	}
	else if (j == 'L') {
		return  50;
	}
	else if (j == 'C') {
		return 100;
	}
	else if (j == 'D') {
		return 500;
	}
	else if (j == 'M') {
		return 1000;
	}
	return -1;
}
    }
