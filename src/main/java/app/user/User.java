package app.user;

public class User {

    private final String name;
    private String password;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


}
