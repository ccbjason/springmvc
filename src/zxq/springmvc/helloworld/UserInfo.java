package zxq.springmvc.helloworld;
public class UserInfo {
    private Integer age;
    private String username;

    private Integer userId;
    private String password;

    public UserInfo() {

    }

    public UserInfo(Integer age, String username, Integer userId, String password) {
        this.age = age;
        this.username = username;
        this.userId = userId;
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }








}
