package ui;

import java.util.Scanner;

import model.MatrixController;

public class MatrixManager {

	private Scanner reader;
	private MatrixController matrixController;

	public static void main(String[] args) {

		System.out.println("Welcome to the Matrix Calculator");
		MatrixManager matrixManager = new MatrixManager();

		int option = 0;

		do {
			option = matrixManager.showMenu();
			matrixManager.executeOperation(option);

		} while (option != 0);

	}

	public MatrixManager() {
		reader = new Scanner(System.in);
		matrixController = new MatrixController();
	}

	public int showMenu() {
		int option = 0;

		System.out.println("Please pick an option\n" + "(1) Create an empty matrix \n"
				+ "(2) Show the contents of all matrixes \n" + "(3) Create a Numeric matrix\n"
				+ "(4) Create a String matrix\n"+"(5) Calculate N code for a matrix\n"+ "(0) To leave the application");
		option = reader.nextInt();
		reader.nextLine();
		return option;
	}

	public void executeOperation(int operation) {

		switch (operation) {
		case 0:
			System.out.println("Thanks for using our services!");
			break;
		case 1:
			createEmptyMatrix();
			break;
		case 2:
			System.out.println(matrixController.showMatrices());
			break;

		case 3:
			createNumericMatrix();
			break;

		case 4:
			creatStringMatrix();
			break;
			
		case 5:
			calculateMatrixN();
			break;

		default:
			System.out.println("Error, type a valid option");

		}

	}

	public void createEmptyMatrix() {
		System.out.println("Please select the type of matrix " + "\n (1) Numeric matrix" + "\n (2) String matrix");
		int type = reader.nextInt();
		reader.nextLine();

		System.out.println("Please type the number of rows");
		int rows = reader.nextInt();
		reader.nextLine();

		System.out.println("Please type the number of columns");
		int columns = reader.nextInt();
		reader.nextLine();

		System.out.println("New matrix:");
		System.out.println(matrixController.createEmptyMatrix(type, rows, columns));
	}

	public void createNumericMatrix() {

		int rows, columns, number;

		System.out.println("Please type the number of rows");
		rows = reader.nextInt();
		reader.nextLine();

		System.out.println("Please type the number of columns");
		columns = reader.nextInt();
		reader.nextLine();

		int[][] tmp = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Type the number you want to register in the [" + i + "][" + j + "] position");
				number = reader.nextInt();
				reader.nextLine();
				tmp[i][j] = number;
			}
		}
		matrixController.addNumericMatrix(tmp);

	}

	// String Matrix (pending)
	private void creatStringMatrix() {
		
		int rows, columns; String string;
		
		reader.nextLine();

		System.out.println("Please type the number of rows");
		rows = reader.nextInt();
		reader.nextLine();

		System.out.println("Please type the number of columns");
		columns = reader.nextInt();
		reader.nextLine();

		String[][] tmp = new String[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Type the String you want to register in the [" + i + "][" + j + "] position");
				string = reader.nextLine();
				reader.nextLine();
				tmp[i][j] = string;
			}
		}
		matrixController.addStringMatrix(tmp);

	}

	private void calculateMatrixN() {
		
		System.out.println("Numeric matrixes registered:");
		System.out.println(matrixController.showMatrices());
		
		int matrix = reader.nextInt();
		
		System.out.println(matrixController.calculateCodeN(matrix-1));
		
		
		
	}
}
