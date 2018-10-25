public class Nodo<E> {
    Nodo<E> anterior;  //Nodo parte anterior 
    E informacion;     //Donde se mete el dato
    Nodo<E> siguiente; //Nodo parte siguiente
    
    public Nodo(E dato){ 
        informacion = dato;
        anterior = null;
        siguiente = null;
    }

    public String toString() {
        return informacion+"\n";
    }    
}