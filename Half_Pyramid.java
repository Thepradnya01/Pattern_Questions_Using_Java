package Pattern_Questions;

public class Half_Pyramid {

	public static void main(String[] args) {
		int n=4;
		int m=4;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
