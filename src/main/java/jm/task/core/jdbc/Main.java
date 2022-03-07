package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao dao = new UserDaoJDBCImpl();
        dao.createUsersTable();
        dao.saveUser("Maria", "Sergeeva", (byte) 68);
        dao.saveUser("Ivan", "Dorofeev", (byte) 24);
        dao.saveUser("Semen", "Alexseev", (byte) 17);
        dao.saveUser("Mike", "Pence", (byte) 46);
        dao.getAllUsers();
        dao.cleanUsersTable();
        dao.dropUsersTable();
    }
}
