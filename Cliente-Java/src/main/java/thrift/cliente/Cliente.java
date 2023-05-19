package thrift.cliente;

import java.io.IOException;
import java.util.Scanner;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;

public class Cliente{
    public static void main(String[] args) throws IOException, InterruptedException{
        try{
            TTransport transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            Pagos.Client cliente = new Pagos.Client(protocol);

            ejecutarServicio(cliente);

            transport.close();
        }catch(TException e){
            e.printStackTrace();
        }
    }

    private static void ejecutarServicio(Pagos.Client cliente) throws TException, IOException, InterruptedException{
        Scanner lectura = new Scanner(System.in);
        Boolean ban = true;

        while(ban){
            System.out.flush();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("|------ Cliente ------|");
            System.out.println("| 1. Agregar          |");
            System.out.println("| 2. Actualizar       |");
            System.out.println("| 3. Eliminar         |");
            System.out.println("| 4. Visualizar       |");
            System.out.println("| 5. Salir            |");
            System.out.println("|---------------------|");

            System.out.print("| Ingrese la operacion: ");
            int op = lectura.nextInt(); lectura.nextLine();

            short id;
            int folio;
            String titular, concepto;
            Double cantidad;
            Boolean estado;

            Pago pago;

            switch(op){
                case 1:
                    System.out.flush();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("|----------------|");
                    System.out.print("| Id: ");
                    id = lectura.nextShort(); lectura.nextLine();
                    System.out.print("| Folio: ");
                    folio = lectura.nextInt(); lectura.nextLine();
                    System.out.print("| Titular: ");
                    titular = lectura.nextLine();
                    System.out.print("| Concepto: ");
                    concepto = lectura.nextLine();
                    System.out.print("| Cantidad: ");
                    cantidad = lectura.nextDouble(); lectura.nextLine();
                    System.out.print("| Estado: ");
                    estado = lectura.nextBoolean(); lectura.nextLine();
                    System.out.println("|----------------|");

                    pago = new Pago();
                    pago.setId(id);
                    pago.setFolio(folio);
                    pago.setTitular(titular);
                    pago.setConcepto(concepto);
                    pago.setCantidad(cantidad);
                    pago.setEstado(estado);

                    try{
                        System.out.println();
                        System.out.println(cliente.add(pago));
                        System.out.println();

                        System.out.print("Presione enter para continuar...");
                        lectura.nextLine();
                    }catch(TException e){
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.flush();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("|----------------|");
                    System.out.print("| Id: ");
                    id = lectura.nextShort(); lectura.nextLine();
                    System.out.print("| Folio: ");
                    folio = lectura.nextInt(); lectura.nextLine();
                    System.out.print("| Titular: ");
                    titular = lectura.nextLine();
                    System.out.print("| Concepto: ");
                    concepto = lectura.nextLine();
                    System.out.print("| Cantidad: ");
                    cantidad = lectura.nextDouble(); lectura.nextLine();
                    System.out.print("| Estado: ");
                    estado = lectura.nextBoolean(); lectura.nextLine();
                    System.out.println("|----------------|");

                    pago = new Pago();
                    pago.setId(id);
                    pago.setFolio(folio);
                    pago.setTitular(titular);
                    pago.setConcepto(concepto);
                    pago.setCantidad(cantidad);
                    pago.setEstado(estado);

                    try{
                        System.out.println();
                        System.out.println(cliente.update(pago));
                        System.out.println();

                        System.out.print("Presione enter para continuar...");
                        lectura.nextLine();
                    }catch(TException e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.flush();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("|----------------|");
                    System.out.print("| Id: ");
                    id = lectura.nextShort(); lectura.nextLine();
                    System.out.println("|----------------|");

                    try{
                        System.out.println();
                        System.out.println(cliente.delete(id));
                        System.out.println();

                        System.out.print("Presione enter para continuar...");
                        lectura.nextLine();
                    }catch(TException e){
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.flush();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("|----------------|");
                    System.out.print("| Id: ");
                    id = lectura.nextShort(); lectura.nextLine();
                    System.out.println("|----------------|");

                    try{
                        System.out.println();
                        System.out.println(cliente.get(id));
                        System.out.println();

                        System.out.print("Presione enter para continuar...");
                        lectura.nextLine();
                    }catch(TException e){
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    ban = !ban;
                    break;
                default:
                    System.out.flush();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("|-----------------------------------|");
                    System.out.println("| Selecciona una opcion, por favor  |");
                    System.out.print("| Presione enter para continuar...");
                    lectura.nextLine();
                    break;
            }
        }

        lectura.close();
    }
}