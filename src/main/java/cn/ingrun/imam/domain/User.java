package cn.ingrun.imam.domain;

/**
 * @Author: IngRun
 * @Date: 2019/8/2 9:44
 * @Description:
 */
public class User {

    private int id;
    private String username;
    private String password;
    private Boolean rememberme;

    public User() {
    }

    public User(int id, String username, String password, Boolean rememberme) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rememberme = rememberme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRememberme() {
        return rememberme;
    }

    public void setRememberme(Boolean rememberme) {
        this.rememberme = rememberme;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rememberme=" + rememberme +
                '}';
    }
}
