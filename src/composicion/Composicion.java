package composicion;

import java.util.ArrayList;
import java.util.List;

// hacer dos composiciones, agregación y composición.

public class Composicion {
   public static void main(String[] args) {

   }

}

// clase hotel q va a tener como atributos:
// clase habitacion y clase recepcion, las dos solo tengan sentido dentro de
// hotel habitación.
// clase habitacion atributos medidas.
// clase recepcion atributos medidas.

class Hotel {
   // atributos:
   // tiene una lista de tipo ArrayList de la clase Habitaciones y una Recepcion
   // clase habitación está dentro de Hotel.
   List<Habitacion> misHabitaciones;
   Recepcion miRecepcion;
   // constructor
   public Hotel() {
      this.misHabitaciones= new ArrayList<>();
      this.miRecepcion=new Recepcion();
   }
   // getters y setters.
   public List<Habitacion> getMisHabitaciones() {
      return misHabitaciones;
   }

   public void setMisHabitaciones(List<Habitacion> misHabitaciones) {
      this.misHabitaciones = misHabitaciones;
   }

   public Recepcion getMiRecepcion() {
      return miRecepcion;
   }

   public void setMiRecepcion(Recepcion miRecepcion) {
      this.miRecepcion = miRecepcion;
   }

   class Habitacion {
      private int ancho;
      private int largo;

      // constructor
      public Habitacion() {
         this.ancho=0;
         this.largo=0;
      }

      // setters y getters
      public int getAncho() {
         return ancho;
      }

      public void setAncho(int ancho) {
         this.ancho = ancho;
      }

      public int getLargo() {
         return largo;
      }

      public void setLargo(int largo) {
         this.largo = largo;
      }

   } // fin clase Habitación

   
   

} // fin clase Hotel

// clase recepción está fuera de Hotel.
class Recepcion {
   private int ancho;
   private int largo;

   // constructor
   public Recepcion() {
      this.ancho=0;
      this.largo=0;
   }

   // setters y getters
   public int getAncho() {
      return ancho;
   }

   public void setAncho(int ancho) {
      this.ancho = ancho;
   }

   public int getLargo() {
      return largo;
   }

   public void setLargo(int largo) {
      this.largo = largo;
   }

} // fin clase Recepción