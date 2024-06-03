package HolaMundo;
import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("que mensaje deseas ver:\n 1-Hola\n 2-Mundo");
        int dato = scanner.nextInt();

        if (dato == 1) {
            System.out.println("Hola ");
        }else if (dato == 2) {
            System.out.println("Mundo");
        }else{
            System.out.println("esa opcion no existe");
        }

        
        scanner.close();
    }
    
}
