package org.jared.java.basico;

public class UsarMenu {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Lector lector = new Lector();
        ManejoListaTareas lista = new ManejoListaTareas();
        byte opcionSeleccionada = 0;

        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();

            System.out.printf("%n%nLa opción seleccionada es: %d%n", opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.eliminarListaDeTareas();
                    break;
                case 6:
                    lista.guardarTareas();
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }

        }while(opcionSeleccionada != 6);
    }
}
