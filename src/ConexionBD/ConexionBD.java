package ConexionBD;

import java.sql.*;
        
/**
 *
 * @author Desarrollo
 */
public class ConexionBD {
    
    private Connection conexion = null;
    
    public ConexionBD(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatosse","root","password");
            if(conexion != null){
                System.out.println("Conexion Establecida con BD");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de Conexion con BD "+e);
        }
        
    }
    
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    public void terminarConexion(){
        try{
            conexion.close();
            System.out.println("Conexion Terminada con BD");
        }
        catch(SQLException e){
            System.out.println("Error al Terminar Conexion con BD");
        }
    }
    
}
