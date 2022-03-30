package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Maria", "Sergeeva", (byte) 68);
        userService.saveUser("Ivan", "Dorofeev", (byte) 24);
        userService.saveUser("Semen", "Alexeev", (byte) 17);
        userService.saveUser("Mike", "Pence", (byte) 46);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();
    }
}
