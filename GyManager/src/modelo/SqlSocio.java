package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SqlSocio extends Conexion {

    public DefaultTableModel mostrarClientes(){
        String []  nombresColumnas = {"Numero de Socio","Nombre","Primer Apellido", "Segundo Apellido", "Tipo de Membresia", "Fecha de inscripcio"};
        String [] registros = new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM socios";
        
        try
        {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("numeroSocio");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidoP");
                registros[3] = rs.getString("apellidoM");
                registros[4] = rs.getString("tipoMembresia");
                registros[5] = rs.getString("fechaInscripcion");
                
                modelo.addRow(registros);
                
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");  
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
    
    public boolean registrarSocio(NewSocio scio, User usr) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "INSERT INTO socios (numeroSocio, nombre, apellidoP, apellidoM, tipoMembresia, fechaInscripcion) VALUES (?,?,?,?,?,?)";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, scio.getNumeroSocio());
            ps.setString(2, scio.getNombre());
            ps.setString(3, scio.getApellidoP());
            ps.setString(4, scio.getApellidoM());
            ps.setString(5, scio.getTipoMembresia());
            ps.setString(6, scio.getFechaInscripcion());
            ps.execute();

            scio.setId(idSocio(scio.getNumeroSocio()));
            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    private int idSocio(String num){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT id_socio FROM socios WHERE numeroSocio = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setString(1, num);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public int existeSocio(NewSocio scio) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT count(id_socio) FROM socios WHERE nombre = ? AND apellidoP = ? AND apellidoM = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setString(1, scio.getNombre());
            ps.setString(2, scio.getApellidoP());
            ps.setString(3, scio.getApellidoM());

            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

}
