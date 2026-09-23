import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class ColaTrabajos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        
        Deque<String> trabajos = new LinkedList<>();

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
                    trabajos.addLast("Tarea.");
                    break;
            
                case 2:
                    trabajos.addFirst("Proyecto.");
                    break;

                case 3:
                    String procesar = trabajos.pollFirst();
                    System.out.println(procesar);
                    break;

                case 4:
                    String siguiente = trabajos.peekFirst();
                    System.out.println(siguiente);
                    break;

                case 5:
                    System.out.println("Trabajos pendientes: " + trabajos);
                    break;

                case 6:
                    System.out.println("Numero de trabajos: " + trabajos.size());
                    break;
            }
        } while(opcion != 7);

        input.close();
    }
}
