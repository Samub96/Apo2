package ui;
import java.util.Scanner;
import model.ListaCircular;

public class Turnos {
	
	private static Scanner sc;
	private static ListaCircular turnos;
	
	public Turnos() {
		sc = new Scanner(System.in);
		turnos = new ListaCircular();
		
	}

	public static void main(String[] args) {
		
		System.out.println("Turnos Bancolombia");
		
		Turnos turno = new Turnos();

		int option = 0;

		do {
			option = turno.showMenu();
			turno.executeOperation(option);

		} while (option != 0);

	}

	private void executeOperation(int option) {
		boolean exit =false;
		while(!exit) {
		switch (option) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			exit =true;
			break;
			
			
			
		}
		}
		
	}

	private int showMenu() {
		int option = 0;
				
		System.out.println("\n escoja una opcion"
							+ "\n [1] Dar turno "
							+ "\n [2] Mostrar turno actual "
							+ "\n [3] pasar turno "
							+ "\n [4] seguir "
							+ "\n [5] Salir ");
		option = sc.nextInt();
		return option;
	}
		

	}


