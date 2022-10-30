package matrixTranspose;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] matrix= {
				{2,3,4},
				{5,6,4}
		};
				
		for(int i=0; i<matrix[0].length; i++) {
			for(int k=0; k<matrix.length; k++) {
				System.out.print(matrix[k][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
