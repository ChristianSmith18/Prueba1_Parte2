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

  public void insertar(int x, int p) {
    NodoLista aux = new NodoLista(x);
    NodoLista temp = cabeza;
    int i = 0;
    if (p < 0)
      System.out.println("Posicion inválida!");
    else {
      while ((temp.siguiente != null) && (i != p)) {
        i++;
        temp = temp.siguiente;
      }
      if (i < p)
        System.out.println("La posición indicada no existe!");
      else
        insertar(aux, temp);
    }
  }

  private void insertar(NodoLista x, NodoLista p) {
    x.siguiente = p.siguiente;
    p.siguiente = x;
  }
}