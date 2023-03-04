package ui;
import model.Arbol;
import java.util.Scanner;
public class Main {

    public static Scanner sc;
    public static Arbol tree;

    static boolean exit = false;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("""

                     [1] Add name
                     [2] Show
                     [0] exit \
                    """);
            int option = sc.nextInt();
            selection(option);

        }


    }

    public static void selection(int option) {

        switch (option) {
            case 1:
                addName();

                break;
            case 2:

                break;
            case 0:
                exit = true;
                break;
        }

    }

    public static void addName() {

    System.out.println("names");
    String names = sc.nextLine();
    String[] array = names.split("");
    tree.addNode(array);
    }


}

