import java.util.Scanner;

class Calculadora {
    public double sumar(double x, double y) {
        return x + y;
    }

    public double restar(double x, double y) {
        return x - y;
    }

    public double multiplicar(double x, double y) {
        return x * y;
    }

    public double dividir(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("NO se puede dividir entre cero.");
            return Double.NaN;
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("MENU DE OPERACIONES:");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. SALIR");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el primer numero:");
                double num1 = scanner.nextDouble();
                System.out.println("Ingresa el segundo numero:");
                double num2 = scanner.nextDouble();
                System.out.println("Respuesta: " + calculadora.sumar(num1, num2));
                break;
            case 2:
                System.out.println("Ingresa el primer numero:");
                num1 = scanner.nextDouble();
                System.out.println("Ingresa el segundo numero:");
                num2 = scanner.nextDouble();
                System.out.println("Respuesta: " + calculadora.restar(num1, num2));
                break;
            case 3:
                System.out.println("Ingresa el primer numero:");
                num1 = scanner.nextDouble();
                System.out.println("Ingresa el segundo numero:");
                num2 = scanner.nextDouble();
                System.out.println("Respuesta: " + calculadora.multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Ingresa el primer numero:");
                num1 = scanner.nextDouble();
                System.out.println("Ingresa el segundo numero:");
                num2 = scanner.nextDouble();
                System.out.println("Resultado: " + calculadora.dividir(num1, num2));
                break;
            case 5:
                System.out.println("Gracias por usarme :).");
                break;
            default:
                System.out.println("Opción no valida.");
        }
    }
}