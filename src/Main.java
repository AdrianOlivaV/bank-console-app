import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre="pedro";
        String tipoDeCuenta="Corriente";
        double saldo = 1599;

        System.out.println("************************************");
        System.out.println("\n Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: "+tipoDeCuenta);
        System.out.println("Saldo disponible: $"+saldo);
        System.out.println("\n************************************");


        String menu= """
                *** Ingresa el numero de la opcion deseada***
                1- Consultar saldo
                2- Retirar
                3- Depositar
                9- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (opcion !=9){
            System.out.println(menu);
            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Saldo actual: $"+saldo);
                    break;
                case 2:
                    System.out.println("Monto de retiro?");
                    double montoRetiro=teclado.nextDouble();
                    if (saldo < montoRetiro){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - montoRetiro;
                        System.out.println("el saldo actual es: $"+saldo);
                    }
                    break;
                case 3:
                    System.out.println("Monto a depositar");
                    double montoDeposito = teclado.nextDouble();
                    saldo+=montoDeposito;
                    System.out.println("el saldo actual es; $"+saldo);

                case 9:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }

        }
    }


