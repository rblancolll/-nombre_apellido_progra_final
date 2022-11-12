
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibroArray {
    
      LibroModel[] transTable;
    int indexArray;
    
    private DatabasaConnection conectDB;
    private Connection connection;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
 
  
    public void openConnection(){
       conectDB= new DatabasaConnection ();
        connection=conectDB.connection();
    }

    public String saveTrans(LibroModel libro){        
        String sql = "INSERT INTO practica.libro(id_libro, editorial, materia, nombre_del_libro)";
             sql += " VALUES(?,?,?,?)"; 
        try{
            openConnection();
            statement = connection.prepareStatement(sql); 
            statement.setInt(1, libro.getCode());
            statement.setString(2, libro.getEditorial());
            statement.setString(3, libro.getMateria());
            statement.setString(4, libro.getNombre());
         
            int resultado = statement.executeUpdate(); 
            
                if(resultado > 0){
                    return String.valueOf(resultado);
                }else{
                    return String.valueOf(resultado);
                }
        }catch(SQLException e){
            return e.getMessage();
        }    
    }
    
    
    
  public String deleteTrans(int transId){
        String sql = "DELETE FROM practica.libro WHERE id_libro = " + transId;
        try{
            openConnection();
            statement = connection.prepareStatement(sql);
            int resultado = statement.executeUpdate();
            if(resultado > 0){
                return String.valueOf(resultado);
            }else{
                return String.valueOf(resultado);
            }
        }catch(SQLException e){
                    return e.getMessage();
                    }
    }
    
}
    
    
    
    
    

