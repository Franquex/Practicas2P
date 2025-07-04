import lcse.ListaCircularSimplementeEnlazada;
import lde.ListaDoblementeEnlazada;
import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
        /*
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);
        listaSimplementeEnlazada.mostar();

        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        listaSimplementeEnlazada.mostar();

         */

        /*
        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacia());

        for (int i = 30; i > 0; i--) {
            listaDoblementeEnlazada.insertar(i);
        }
        System.out.println(listaDoblementeEnlazada.estaVacia());
        listaDoblementeEnlazada.mostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();
        listaDoblementeEnlazada.mostrarAtras();

         */
        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i = 1; i <= 12 ; i++) {
            listaCircularSimplementeEnlazada.insertarFin(i);

        }
        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        /*
        listaCircularSimplementeEnlazada.eliminarFin();
        listaCircularSimplementeEnlazada.eliminarFin();

        listaCircularSimplementeEnlazada.mostrar();

         */

        listaCircularSimplementeEnlazada.mostrarCircular(2);
    }
}
