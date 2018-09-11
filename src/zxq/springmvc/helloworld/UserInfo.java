package zxq.springmvc.helloworld;
public class UserInfo {
    private Integer age;

    private String username;

    private Integer userId;
    private String password;

    private  String cardid;
    private String sex;
    private  String clsize;
    private  String empno;
    private  String     phone;
    private  String runtype;

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

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClsize() {
        return clsize;
    }

    public void setClsize(String clsize) {
        this.clsize = clsize;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRuntype() {
        return runtype;
    }

    public void setRuntype(String runtype) {
        this.runtype = runtype;
    }


    public UserInfo(Integer age, String username, Integer userId, String password, String cardid, String sex, String clsize, String empno, String phone, String runtype) {
        this.age = age;
        this.username = username;
        this.userId = userId;
        this.password = password;
        this.cardid = cardid;
        this.sex = sex;
        this.clsize = clsize;
        this.empno = empno;
        this.phone = phone;
        this.runtype = runtype;
    }
}
