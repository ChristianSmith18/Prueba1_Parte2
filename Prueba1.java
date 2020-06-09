class NodoLista {
  int dato;
  NodoLista siguiente;

  NodoLista() {
    dato = 0;
    siguiente = null;
  }

  NodoLista(int x) {
    dato = x;
    siguiente = null;
  }
}

class Lista {
  NodoLista cabeza;

  Lista() {
    cabeza = new NodoLista();
    cabeza.siguiente = null;
  }

  public static void main(String[] args) {

  }
}