import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ColaTrabajos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        List<String> trabajos = new ArrayList<>();


        do {

            System.out.println("1. Agregar trabajo normal.");
            System.out.println("2. Agregar trabajo urgente.");
            System.out.println("3. Procesar siguiente trabajo.");
            System.out.println("4. Consultar siguiente trabajo.");
            System.out.println("5. Mostrar trabajos pendientes.");
            System.out.println("6. Mostrar numero de trabajos.");
            System.out.println("7. Salir.");
            System.out.print("\nSelecciona una opcion: ");
            
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1\n");
                    break;
            
                case 2:
                    break;

                case 3:

                case 4:

                case 5:

                case 6:


            }
        } while(opcion != 7);

        input.close();
    }
}
