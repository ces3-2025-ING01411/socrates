package co.edu.poli.ces3.socrates.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface ICrud {
    int insert();
    List<?> find() throws SQLException;

    double delete(int id);
    int update();
    Object upgrade(Object obj) throws SQLException;
    Object findById(int id) throws SQLException;
}
