package model;

import java.util.ArrayList;

public class MatrixController {

	private ArrayList<int[][]> numericMatrices;
	private ArrayList<String[][]> stringMatrices;

	public MatrixController() {
		numericMatrices = new ArrayList<int[][]>();
		stringMatrices = new ArrayList<String[][]>();
	}

	public String createEmptyMatrix(int type, int rows, int columns) {
		String out = "";
		switch (type) {
		case 1: // Numeric Matrix
			int[][] newMatrix = new int[rows][columns];
			numericMatrices.add(newMatrix);
			out = printNumericMatrix(newMatrix);

			break;
		case 2: // String Matrix (pending)
			String[][] newMatrixs = new String[rows][columns];
			stringMatrices.add(newMatrixs);
			out = printStringMatrix(newMatrixs);
			break;
		}

		return out;

	}

	public String showMatrices() {
		String out = "";
		out += "\nNumeric matrices \n";

		if (!numericMatrices.isEmpty()) {

			for (int i = 0; i < numericMatrices.size(); i++) {
				out += "Matrix "+(i+1)+":\n";
				out += printNumericMatrix(numericMatrices.get(i));
			}
		} else {

			out += "There are no numeric matrixes registered yet \n";

		}

		
		  out += "\nString matrices \n";
		  
		  if (!stringMatrices.isEmpty()) {
		  
		  for (int i = 0; i < stringMatrices.size(); i++) { out +=
		  printStringMatrix(stringMatrices.get(i)); } } else { out +=
		  "There are no String matrixes registered yet \n"; }
		 
		return out;
	}

	public void addNumericMatrix(int[][] numMatrix) {
		numericMatrices.add(numMatrix);
	}

	// String Matrix (Pending)
	public void addStringMatrix(String[][] stringMatrix) {
		stringMatrices.add(stringMatrix);
	}

	private String printNumericMatrix(int[][] numMatrix) {
		String print = "";
		for (int i = 0; i < numMatrix.length; i++) { // filas numbers.length
			for (int j = 0; j < numMatrix[0].length; j++) { // columnas numbers[0].length
				print += numMatrix[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}

	// String Matrix (pending)
	private String printStringMatrix(String[][] stringMatrix) {
		
		String print = "";
		for (int i = 0; i < stringMatrix.length; i++) { // filas numbers.length
			for (int j = 0; j < stringMatrix[0].length; j++) { // columnas numbers[0].length
				print += stringMatrix[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}

	public String calculateCodeN(int mat) {

		int[][] matrix = numericMatrices.get(mat);
		
		String msg = "";

		// 6x6: length = 6 Posiciones 0 a 5
		for (int i = matrix[0].length; i > 0; i--) { // Columnas

			msg += matrix[i - 1][0];

		}

		for (int i = 0; i < matrix.length; i++) { // Filas

			for (int j = 0; j < matrix[0].length; j++) { // Columnas

				if (i == j && i > 0 && i < matrix.length - 1) {

					msg += matrix[i][j];

				}

			}

		}

		for (int i = matrix[0].length; i > 0; i--) { // Columnas

			msg += matrix[i - 1][matrix[0].length - 1];

		}

		return msg;

	}
}
