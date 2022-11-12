
package Class;


public class ProfesorModel {
 private int dpi;
 private String name;
 private String Apellido;
 private String Clase;
 private int libro;
 
 
 public ProfesorModel(int dpi, String name, String apellido, String Clase, int Libro){
     this.dpi=dpi;
     this.name=name;
     this.Apellido=apellido;
     this.Clase=Clase;
     this.libro=Libro;
     
     
     
 }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public int getLibro() {
        return libro;
    }

    public void setLibro(int libro) {
        this.libro = libro;
    }
    
    
    
    
}
