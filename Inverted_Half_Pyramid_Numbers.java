package Pattern_Questions;

public class Inverted_Half_Pyramid_Numbers {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}

}
