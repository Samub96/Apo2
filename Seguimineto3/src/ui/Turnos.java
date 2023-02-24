package ui;
import java.util.Scanner;
import model.ListaCircular;

public class Turnos {
	
	public static Scanner sc = new Scanner(System.in);
	public static ListaCircular control = new ListaCircular();
	
	

	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a turnos bancolombia ");
		
		boolean exit = false;
		while (!exit) {
	
		System.out.println("\n escoja una opcion"
							+ "\n [1] Dar turno "
							+ "\n [2] Mostrar turno actual "
							+ "\n [3] pasar turno "
							+ "\n [4] seguir "
							+ "\n [5] Salir ");
		int turnos = sc.nextInt();
		
		switch(turnos) {
		case 1:
			control.addNode();
			break;
		case 2:
			System.out.println(control.printActual());
			break;
		case 3:
			System.out.println(control.pasarTurno());
			break;
		case 4: 
			System.out.println(control.delete());
			break;
		case 5:
			exit = true;
			break;
			default :
				System.out.println("digita una opcion correcta");
				
		}
		}
		
		
	}
		
}
	


