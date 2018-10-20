
package Connection;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Klasa zawierająca metody z zapytaniami do bazy danych
 * @author mibdbz
 */
public class Queries {
    private List<String> list = new ArrayList<>();
    private SqlImplementation sql= new SqlImplementation();
    
    
    /**
     * Metoda z zapytaniem do bazy danych o podana zbitke liter
     * pobiera zbitke, a zwraca liste ze slowami ktore ja zawieraja
     * @param cluster przyjmowana zbitka liter
     * @return zwracana lista z nazwami produktow zawieajacymi zbitke
     */
    public List<String> query(String cluster){
        String query = "SELECT productname FROM products WHERE productname LIKE '%" + cluster + "%'";
        
        try {
            list = sql.execute(false, query);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
        return list;
    }
    
    /**
     * Metoda z zapytaniem do pobrania produktu o podanej nazwie
     * @param name nazwa produktu w bazie
     * @return zwraca zapytanie wraz z podaną nazwą produktu
     */
    public String modelQuery(String name){
        String query = "SELECT * FROM products WHERE productname = '"+ name + "'";
        return query;
    }
    
    
}
