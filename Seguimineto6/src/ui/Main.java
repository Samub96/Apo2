package ui;
import java.util.Scanner;
public class Main {

    public static Scanner sc;
    public static boolean exit = false;
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        menu();


    }
    public static void menu(){
        System.out.println("""
                        Bienvenido a  Cosmocentro
                        
                        ----------------------------------
                        Horario de paqueadreo\s
                        --------------------------
                        Automoviles\s
                        ----------
                        Placas iniciadas A - M
                            - 7 AM a 2 PM\s
                            
                        Placas inciada N - Z
                            - 2 PM a 10 Pm
                            
                        -----------------
                        
                        
                        Motos
                        -----------------
                        Numero de placa entre 00 y 49
                            -7 AM a 2 PM
                        
                        Numero de placa entre 50 y 99
                            -2 PM - 10 PM
                        ------------------------------
                        
                        RECUERDA!
                        
                        CONDUCTORES CUYA CEDULA TERMINE 0 Y 1
                           No puede entrar los lunes\s
                               
                        CONDUCTORES CUYA CEDULA TERMINE 2 Y 3
                           No puede entrar los martes
                           
                        CONDUCTORES CUYA CEDULA TERMINE 4 Y 5
                           No puede entrar los miercoles
                           
                        CONDUCTORES CUYA CEDULA TERMINE 6 Y 7
                           No puede entrar los jueves
                           
                        CONDUCTORES CUYA CEDULA TERMINE 8 Y 9
                           No puede entrar los viernes   \s
                        
                        
                      \
                    """);
        registrar();
    }
    public static void registrar(){

        while(!exit) {

            System.out.println("Registrar ingreso");
            System.out.println("\n [1] Si " +
                                "\n [2] No" +
                                "\n [0] volver al menu");

            String optionTemp = sc.nextLine();
            int option = Integer.parseInt(optionTemp);

            switch (option){
                case 0:
                    menu();
                    break;
                case 1:

                    break;
                case 2:
                    System.out.println("Gracias por elejir Cosmocentro");
                    exit = true;
                    break;
            }
        }
    }
}