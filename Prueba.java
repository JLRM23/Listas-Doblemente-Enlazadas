public class Prueba{

    public static void main(String[] args) {
        
        ListaDoblementeEnlazada<String> lista = new ListaDoblementeEnlazada<>();
        
        lista.insertarInicio("a");
        lista.insertarInicio("b"); 
        lista.insertarInicio("c"); 
        lista.insertarInicio("d");
        lista.insertarInicio("e");
        lista.insertarInicio("f");
        lista.insertarInicio("g"); 
        lista.insertarFinal("a");
        lista.insertarFinal("b");
        lista.insertarFinal("c");
        lista.insertarFinal("d");
        
        System.out.print("Recorrer desde elemento E a Inicio = ");
        lista.recorreDesde("d",false);
        System.out.print("Recorrer desde elemento E a Final = ");
        lista.recorreDesde("d",true);

        
    
        System.out.print("Recorrer de Fin a Inicio = ");
        lista.mostrarFinInicio();
        System.out.println("");
        
        System.out.print("Recorrer de Inicio a Fin = ");
        lista.mostrarInicioFin();
        System.out.println("");

        System.out.print("Insertar al Inicio = ");
        lista.insertarInicio("InsertarInicio");
        lista.mostrarFinInicio();
        System.out.println("");

        System.out.print("Insertar al Final = ");
        lista.insertarFinal("insertarFinal");
        lista.mostrarFinInicio();
        System.out.println("");

        System.out.print("Borrar al Inicio = ");
        lista.eliminarInicio();
        lista.mostrarFinInicio();
        System.out.println("");

        System.out.print("Borrar al Final = ");
        lista.eliminarFinal();
        lista.mostrarFinInicio();
        System.out.println(" ");

        System.out.print("Mostrar Inicio = ");
        lista.mostrarInicio();

        System.out.print("Mostrar Fin = ");
        lista.mostrarFin();

        System.out.print("antes de insertar despues de elemento = ");
        lista.mostrarFinInicio();
        System.out.println(" ");
        lista.InsertarDespuesDeElemento("b","A");
       	System.out.print("despues de insertar despues de elemento = ");
       	lista.mostrarFinInicio();
       	System.out.println(" ");
        
        System.out.print("antes de insertar antes de elemento = ");
        lista.mostrarFinInicio();
        System.out.println(" ");
        lista.InsertarAntesDeElemento("b","B");
        System.out.print("despues de insertar antes de elemento = ");
        lista.mostrarFinInicio();
        System.out.println(" ");

        System.out.print("Remover especifico f = ");
        lista.removerEspecifico("f");
        lista.mostrarFinInicio();

    }
}
