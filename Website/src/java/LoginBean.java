import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LoginBean")
public class ValidationBean implements Serializable{

    private String email;
    private String password;
    private String secondPassword;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecondPassword() {
        return secondPassword;
    }

    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
    }

}
