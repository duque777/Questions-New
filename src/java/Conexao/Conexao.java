package Conexao;

import domain.Categoria;
import domain.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;


public class Conexao
{
    private static String dbURL = "jdbc:derby://localhost:1527/questions;create=true;user=olivier;password=olivier";
    private static String tableName = "category";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;

    public Conexao() {
        createConnection();
    }
   
    
    private static void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    public void insertCategory(Categoria categoria)
    {
        try
        {
            stmt = conn.createStatement();
            stmt.execute("insert into olivier.category(idCategoria,categoria) values ( (select max(idcategoria)+1 from OLIVIER.CATEGORY),'"+categoria.getCategoria()+"')");
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    public Usuario validateUser(Usuario usuario)
    {
        Usuario user = new Usuario();
        
        try
        {
        stmt = conn.createStatement();
        
            ResultSet results = stmt.executeQuery("select nome,idusuario,usuario from OLIVIER.USUARIO where usuario = '"+usuario.getUsuario()+"' and senha = '"+usuario.getPassword()+"'");
            
            if(results.next())
            {
                user.setNome(results.getString(1));
                user.setIdUsuario(results.getInt(2));
                user.setUsuario(results.getString(3));
            }

            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
        return user;
    }
    
    public ArrayList<Categoria> selectCategory()
    {
        
        ArrayList<Categoria> categorias = new ArrayList<>();
        try
        {
            
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select categoria from OLIVIER.CATEGORY");

            Categoria categoria;
            while(results.next())
            {
                categoria = new Categoria();
                 categoria.setCategoria(results.getString(1));
                 categorias.add(categoria);
            }
            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
        return categorias;
    }
    
    private static void shutdown()
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (conn != null)
            {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
            
        }

    }
}