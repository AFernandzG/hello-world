import java.util.Scanner;



public class Operadores{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        suma = num1 * num2;

        System.out.println("La multiplicacion de los dos números es: " + suma);
    
}
}
