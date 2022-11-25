class Richest_customer {
    int total = 0;
    int temp1 = 0; 
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        
        for (int i=0; i<n;i++) {
			total = total+accounts[0][i];
		}
		
		for (int k = 1; k<m;k++) {
			for (int j=0; j<n; j++) {
				temp1 = temp1+accounts[k][j];
			}
			if(temp1>total) {
				total = temp1;
				temp1 = 0;
			}
			temp1 = 0;
		}
		return total;
		
	}
        
    }
