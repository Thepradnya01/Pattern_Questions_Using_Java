package Pattern_Questions;

public class Half_Pyramid_With_Numbers {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}

}
