package proyectoFinal;

import java.util.Scanner;

//Codigo para un barco persquero diseñado para el caso ideal
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuestaU = "";
        boolean navegar = true;

        BarcoPesquero bP1 = new BarcoPesquero();

        System.out.println(bP1.getNombre());

        while (navegar) {
            System.out.println("\n----------------------");
            System.out.println("0 para saltar del barco");
            System.out.println("1 para encender barco");
            System.out.println("2 para acelerar");
            System.out.println("3 para girar el barco");
            System.out.println("4 para mostrar estado del anlca, red y encendido o apagado");
            System.out.println("5 para subir ancla");
            System.out.println("6 para baja ancla");
            System.out.println("7 para bajar red");
            System.out.println("8 para subir red");
            System.out.println("9 para reducir velocidad");
            System.out.println("10 para apagar barco");
            System.out.println("----------------------");

            respuestaU = entrada.nextLine();

            switch (respuestaU) {
                case "0":
                    System.out.println("el capitan saltó del barco");
                    navegar = false;
                    break;

                case "1":
                    bP1.encender();                   
                    break;

                case "2":
                    System.out.println("Recuerda ir acelerando poco a poco");
                    System.out.println("y que la velocidad máxima es de 55Km/h");
                    System.out.println("Con qué fuerza subes la palanca?");
                    respuestaU = entrada.nextLine();
                    bP1.aumentarVelocidad(Integer.parseInt(respuestaU));
                    break;

                case "3":
                    System.out.println("Gira el timon: ");
                    respuestaU = entrada.nextLine();
                    bP1.girarTimon(Integer.parseInt(respuestaU));
                    break;

                case "4":
                    System.out.println("El estado de la red es: " + bP1.getEstadoRed());
                    System.out.println("El estado del ancla es: " + bP1.getEstadoAncla());
                    System.out.println("El barco está: " +bP1.getEncendido());
                    System.out.println("1: arriba, 0: abajo, (exclusivo red) 2: red rota"
                            + "\ntrue: encendido, false: apagado");
                    break;

                case "5":
                    bP1.subirAncla();
                    bP1.setEstadoAncla(1);
                    break;

                case "6":
                    bP1.bajarAncla();
                    bP1.setEstadoAncla(0);

                    break;

                case "7":
                    System.out.println("Cuánto peso tiene la red?");
                    respuestaU = entrada.nextLine();
                    bP1.bajarRed(Integer.parseInt(respuestaU));
                    break;

                case "8":
                    System.out.println("Cuánto peso tiene la red?");
                    respuestaU = entrada.nextLine();
                    bP1.subirRed(Integer.parseInt(respuestaU));
                    break;
                case "9":
                    System.out.println("Recuerda ir desacelerando poco a poco");
                    System.out.println("Con qué fuerza bajas la palanca?");
                    respuestaU = entrada.nextLine();
                    bP1.disminuirVelocidad(Integer.parseInt(respuestaU));
                    break;
                case "10":
                    bP1.apagar();
                    bP1.setEncendido(false);
                    break;
            }

        }

    }
}
