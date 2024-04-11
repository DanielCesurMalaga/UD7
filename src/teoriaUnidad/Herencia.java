package teoriaUnidad;

import java.io.Serializable;

public class Herencia {
   public static void main(String[] args) {
      // crear un objeto AAA.
      AAA aaa = new AAA();
   }
}

// creamos tres clases: A, AA, AAA, AA hereda de A, AAA hereda de AA.
// cada clase tiene un constructor sin parámetros y saca por pantalla el nombre de la clase.

class A implements Serializable, Comparable{
   public A(int numero){
      System.out.println("A");
   }
   public A(){}
   @Override
   public int compareTo(Object o) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
   };
}

class AA extends A  {
   public AA() {
      super();
      System.out.println("AA");
   }
}

class AAA extends AA {
   public AAA(){
      System.out.println("AAA");
   }
}


