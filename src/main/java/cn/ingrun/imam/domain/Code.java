package cn.ingrun.imam.domain;

/**
 * @Author: IngRun
 * @Date: 2019/8/21 10:17
 * @Description:
 */
public class Code {

    private int id;
    private String title;
    private String url;
    private String username;
    private String password;
    private String hint;
    private int userid;

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hint='" + hint + '\'' +
                ", userid=" + userid +
                '}';
    }

    public Code() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Code(int id, String title, String url, String username, String password, String hint, int userid) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.username = username;
        this.password = password;
        this.hint = hint;
        this.userid = userid;
    }
}
