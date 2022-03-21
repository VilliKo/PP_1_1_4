package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Maria", "Sergeeva", (byte) 68);
        userService.saveUser("Ivan", "Dorofeev", (byte) 24);
        userService.saveUser("Semen", "Alexeev", (byte) 17);
        userService.saveUser("Mike", "Pence", (byte) 46);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
