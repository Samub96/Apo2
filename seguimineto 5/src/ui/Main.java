package ui;
import model.Arbol;
import java.util.Scanner;
public class Main {

    public static Scanner sc;
    public static Arbol tree;

    static boolean exit = false;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        tree = new Arbol();
        while (!exit) {
            System.out.println("""

                     [1] Add name
                     [2] Show
                     [0] exit \
                    """);

            String temp = sc.nextLine();
            int option = Integer.parseInt(temp);
            selection(option);

        }


    }

    public static void selection(int option) {

        switch (option) {
            case 1:
                addName();

                break;
            case 2:
                tree.printTreeReverse();
                break;


            case 0:
                exit = true;
                break;
        }

    }

    public static void addName() {

        boolean exit = false;

    while (!exit) {

        System.out.println("names separado en espacios");
        String names = sc.nextLine();

        String[] array =  names.split(" ");
        System.out.println("hacer nuevo listado?"
                + "\n [1] si"
                + "\n [2] no");
        String optionTemp = sc.nextLine();
        int option = Integer.parseInt(optionTemp);

        switch (option) {
            case 1:


//andres carlos daniela nicolas pablo wiliam
                break;
            case 2:
                for (int i =0;i<array.length-1;i++){
                    System.out.println(array[i] );
                }

                System.out.println("agregados exitosamente");

                tree.addNode(array);
                exit =true;
                break;
        }
    }

    }



}

