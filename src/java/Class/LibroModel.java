
package Class;


public class LibroModel {
    private int code;
    private String editorial;
    private String materia;
private String nombre;



public LibroModel (int code,  String editor,  String materia, String nombre){
    this.code=code;
    this.editorial=editor;
    this.materia=materia;
    this.nombre=nombre;   
}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
