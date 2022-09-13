package view;

import controller.MatrixController;

public class Main {

	public static void main(String[] args) {
		
		int[][] matrix = generate();
		MatrixController[] mThreads = new MatrixController[3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				mThreads[i] = new MatrixController(matrix[i][j],i);
				mThreads[i].start();
			}
		}

	}
	
	public static int[][] generate() {
		int[][] matrix = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}
		
		return matrix;
	}

}
