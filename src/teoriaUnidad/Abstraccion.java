package teoriaUnidad;

public class Abstraccion {
   
}

// creamos una clase abstracta llamada primera.
 abstract class Primera {
   // atributos dos: nombre:String, numero:int
   private String nombre;
   private int numero;
// constructor sin parámetros.
   public Primera(){
   }
// getter y setters
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }
   // un metodo abstracto: incrementaUno q no devuelve nada (incrementa numero en uno);
   public abstract void incrementaUno();

   // un metodo normal: incrementa q toma como parámetro un int e incrementa número con el parametro
   public void incrementa(int num){
      this.numero = this.numero + num;
   }
}

// una clase normal llamada segunda que hereda de primera.

class Segunda extends Primera {
   public void incrementaUno(){
      setNumero(getNumero()+1);
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      String papa = super.toString();
      String yo = papa + "ahora yo";
      return yo;
   }
}
