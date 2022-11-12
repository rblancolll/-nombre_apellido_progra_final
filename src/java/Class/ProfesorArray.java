/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfesorArray {

       ProfesorModel [] transTable;
    int indexArray;
    
    private DatabasaConnection conectDB;
    private Connection connection;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
 
  
    public void openConnection(){
       conectDB= new DatabasaConnection ();
        connection=conectDB.connection();
    }

    public String saveTrans( ProfesorModel profe){        
        String sql = "INSERT INTO practica.profesor(dpi_profesor, nombre, apellido, clase, table1_id_libro)";
             sql += " VALUES(?,?,?,?,?)"; 
        try{
            openConnection();
            statement = connection.prepareStatement(sql); 
            statement.setInt(1, profe.getDpi());
            statement.setString(2, profe.getName());
            statement.setString(3, profe.getApellido());
            statement.setString(4, profe.getClase());
            statement.setInt(5, profe.getLibro());
         
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
        String sql = "DELETE FROM practica.profesor WHERE dpi_profesor = " + transId;
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
    
    