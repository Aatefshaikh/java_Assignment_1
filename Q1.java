package q1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || (i == n-1 && j <= (n-1)/2) || (j == (n-1)/2) || (j == 0 && i >= (3*n)/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n-1 || i == (n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if ((i == j && j <= (n-1)/2 && i <= (n-1)/2) || (i+j == n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n-1 || i == (n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || i == (n-1)/2 || (j == n-1 && i <= (n-1)/2) || (i-j == (n-1)/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n-1 || i == (n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n-1 || (i == j && i <= (n-1)/2 && j <= (n-1)/2) || (i+j == n-1 && i <= (n-1)/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int k = 0; k < 7; k++)
				System.out.print(" ");
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n-1 || j == (n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == j || j == 0 || j == (n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n-1)/2 || i == (n-1) || j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i < n-1) || (j == n-1 && i < n-1) || (i == n-1 && j > 0 && j < n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || i == (n-1)/2 || (j == n-1 && i <= (n-1)/2) || (i-j == (n-1)/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0 && j < n-1) || (i == n-1 && j > 0 && j < n-1) || (j == 0 && i > 0 && i < n-1) || (j == n-1 && i > 0 && i < n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == j || j == 0 || j == (n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
