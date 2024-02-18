import java.util.Scanner;
    public class Main {

        public static void main(String[] agrs) {
            // Creacion de variables
            double num1 = 0;
            double num2 = 0;


            //Objeto de lectura de valores
            Scanner lectura = new Scanner(System.in);

            //Captura de los valores
            System.out.println("Ingrese el primer numero: ");
            num1 = Double.parseDouble(lectura.next());

            System.out.println("Ingrese el segundo numero: ");
            num2 = Double.parseDouble(lectura.next());

            //Presentacion de los resultados
            System.out.println(calcularMayor(num1, num2));

        }

        //Funcion para validar el mayor numero
        public static String calcularMayor(double n1, double n2) {
            String resultado;
            if (n1 == n2) {
                resultado = "los valores son iguales";
            } else if (n1 > n2) {
                resultado = "El primer valor (" + n1 + ") es el mayor que el segundo (" + n2+")";
            } else {
                resultado = "El segundo valor (" + n2 + ") es el mayor que el primero (" + n1+")";
            }

            return resultado;

        }


    }


