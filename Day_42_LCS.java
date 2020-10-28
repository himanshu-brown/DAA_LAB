import java.util.*;
import java.lang.*;
public class Day_42_LCS {
	
	public static void lcs_length(char[] x, char[] y) {
		int m = x.length;
		int n = y.length;
		char[][] b = new char[m+1][n+1];
		int[][] c = new int[m+1][n+1];
		int i=0, j=0;
		for(i=1; i<=m; i++)
			c[i][0] = 0;
		for(j=0; j<=n; j++)
			c[0][j] = 0;
		for(i=1; i<=m; i++) {
			for(j=1; j<=n; j++) {
				if(x[i-1] == y[j-1]) {
					c[i][j] = c[i-1][j-1] + 1;
					b[i][j] = '/';
				}else if(c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i][j] = '^';
				}
				else {
					c[i][j] = c[i][j-1];
					b[i][j] = '<';
				}
			}
		}
		for(i=1; i<=m; i++) {
			for(j=1; j<=n; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0; i<=m; i++) {
			for(j=0; j<=n; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String X = scan.nextLine();
		String Y = scan.nextLine();
		char[] x = X.toCharArray();
		char[] y = Y.toCharArray();
		lcs_length(x,y);
		

	}

}
