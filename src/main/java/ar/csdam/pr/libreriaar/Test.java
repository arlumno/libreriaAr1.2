/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.csdam.pr.libreriaar;

import java.util.Scanner;

/**
 *
 * @author a20armandocb
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner lector = new Scanner(System.in);
        Menu menu = construirMenuPrincipal(lector);
        do {
            try {
                continuar = menuAcciones(menu);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } while (continuar);

        lector.close();
    }

    private static Menu construirMenuPrincipal(Scanner lector) {
        Menu menu = new Menu(lector);
        
        menu.setTituloMenu("Menú Vacunas");
        menu.addOpcion("Listar todas las vacunas y mostrar todos sus datos");
        menu.addOpcion("Buscar vacuna");
        menu.addOpcion("Agregar vacuna");
        menu.addOpcion("Eliminar vacuna");
        menu.addOpcion("Introducir resultado de las fases de la vacuna");
        menu.addOpcion("Autorizar/Rechazar vacuna");
        menu.addOpcion("Ver vacunas autorizadas");
        menu.addOpcion("Ver vacunas rechazadas");
        menu.addOpcion("Ver vacunas pendientes de autorizar/rechazar");
        menu.addOpcion("Ver la última fase investigada de cada vacuna almacenada");
        menu.addOpcion("Cargar Vacunas de ejemplo");
        menu.addOpcion("Comprueba si un código es Valido");
        menu.addOpcion("AYUDA / INSTRUCCIONES");
    
//        menu.setTituloMenu("Ejemplo Menu");
//        menu.addOpcion("OPCION 1");
//        menu.addOpcion("OPCION 2");
//        menu.addOpcion("OPCION 3");
//        menu.addOpcion("OPCION 4");
//        menu.addOpcion("OPCION 5");
//        menu.addOpcion("OPCION 6");
        return menu;
    }

    private static boolean menuAcciones(Menu menu) throws Exception {
        boolean continuar = true;
        menu.mostrarGUI();
        menu.mostrar();
        switch (menu.getSeleccion()) {
            case 0:
                //salir
                continuar = false;
                break;
            case 1:
                System.out.println("Ha seleccionado la opción 1");
                break;
            case 2:
                System.out.println("Ha seleccionado la opción 2");
                break;
            case 3:
                System.out.println("Ha seleccionado la opción 3");
                break;
            case 4:
                System.out.println("Ha seleccionado la opción 4");
                break;
            case 5:
                System.out.println("Ha seleccionado la opción 5");
                break;
            case 6:
                System.out.println("Ha seleccionado la opción 6");
                break;

        }
        return continuar;
    }
}
