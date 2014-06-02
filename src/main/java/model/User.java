package model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author: john
 * @version: 1.0 2014-06-01 0:17
 */
@Entity(name="t_user")
public class User {
    @Id
    @GenericGenerator(name="uuid", strategy="uuid", parameters = {@Parameter(name = "separator", value = "-")}) //这个是hibernate的注解
    @GeneratedValue(generator = "uuid")
    private String id;
    private String name;
    private String loginno;
    private String loginpwd;
    private String email;
    private int status;
    private String telephone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginno() {
        return loginno;
    }

    public void setLoginno(String loginno) {
        this.loginno = loginno;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", loginno='" + loginno + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
