package ru.geekbrains.seminar.hw3.main;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    /**
     * Добавление пользователя в список подключенных пользователей
     * @param user
     */
    public void addUser(User user) {
       if (user.isAuthenticate) this.data.add(user);
       else throw new RuntimeException("Ошибочный логин или пароль!");
    }

    /**
     * Проверка находится ли пользователь в списке подключенных пользователей
     * @param username имя пользователя
     * @return
     */
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Разлогирование и удаление из подключенных пользователей
     * не являющихся администраторами
     */
    public void logOutExceptAdministrator() {
        data.removeIf(user -> !user.isRoleAdmin());
    }
}