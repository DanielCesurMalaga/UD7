package libros;

public class Libro {
   // attributes
   private String titulo;
   private boolean prestado;
   private static int numLibro=0;

   // constructor
   public Libro(String titulo) {
      super();
      this.titulo = titulo;
      prestado = false;
      numLibro++;
   }

   // getters y setters
   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo, int nombre) {
      this.titulo = titulo;
   }

   public boolean isPrestado() {
      return prestado;
   }

   public void setPrestado(boolean prestado) {
      this.prestado = prestado;
   }

   public boolean prestarLibro() {
      if (!prestado) {
         prestado = true;
         return true;
      } else {
         return false;
      }
   }

   public boolean devolverLibro() {
      if (prestado) {
         prestado = false;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean equals(Object obj) {
      return (this.titulo.equals(((Libro)obj).getTitulo()));
   }



} // end of Libro
