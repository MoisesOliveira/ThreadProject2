package controller;

public class MatrixController extends Thread{

	public int number;
	public int sum;
	public int lineNumber;
	
	
	public MatrixController(int number, int lineNumber) {
		this.number = number;
		this.lineNumber = lineNumber;
	}
	
	@Override
	public void run() {
		sum = number + number;
		System.out.println("Soma: " + sum + ", linha: " + lineNumber);
	}

}
