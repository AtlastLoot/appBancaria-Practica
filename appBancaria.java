import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class appBancaria {
    static Scanner teclado = new Scanner(System.in);
    static float saldo = 0;
    static String nombre = "tribilin";
    static String tipoDeCuenta = "Ahorros";
    public static void main(String[] args) {
        System.out.println("nombre del cliente: "+nombre);
        System.out.println("Tipo de cuenta: "+tipoDeCuenta);
        System.out.println("Su saldo es: "+saldo);
        String menu ="""
                    Escriba el numero de la opcion deseada
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """;
        int opcion = 0;
        while ( opcion != 9){

            System.out.print(menu);

            opcion = teclado.nextInt();

            if (opcion == 1){
                ConsultarSaldo();
            } else if (opcion == 2) {
                Retirar();
            } else if (opcion == 3) {
                Depositar();
            } else if (opcion == 9) {
                break;
            }else {
                System.out.println("no existe esa opcion");
            }

        }
    }

    public static void ConsultarSaldo(){
        System.out.println("Su saldo es: $" +saldo);
    }
    public static void Depositar(){

        System.out.println("ingrese el valor a depositar: ");

        saldo += teclado.nextFloat();
    }
    public static void Retirar(){
        System.out.println("ingrese el valor a retirar: ");
        float valor = teclado.nextFloat();
        if(valor > saldo){
            System.out.println("saldo insuficiente");
        }else {
            saldo -= valor;
        }

    }
}
