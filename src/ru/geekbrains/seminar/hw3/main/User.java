package ru.geekbrains.seminar.hw3.main;

public class User {

    String name;
    String password;
    Role userRole;

    boolean isAuthenticate = false;

    public User(String name, String password, Role userRole) {
        this.name = name;
        this.password = password;
        this.userRole = userRole;
    }

    /**
     * Аутентификация пользователя
     * @param name имя пользователя
     * @param password пароль пользователя
     * @return проверка валидности имени и пароля
     */
    public boolean authenticate(String name, String password) {
        this.isAuthenticate = (this.name.equals(name) && this.password.equals(password));
        return this.isAuthenticate;
    }

    /**
     * Проверка роли пользователя
     * @return true если админ, false если пользователь
     */
    public boolean isRoleAdmin() {
        return this.userRole.equals(Role.ADMIN);
    }
}