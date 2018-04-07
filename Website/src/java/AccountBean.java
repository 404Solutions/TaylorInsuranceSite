//import Insurance.Account;
//import Managers.AccountManager;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "AccountBean")
public class AccountBean implements Serializable{

    private int userId;
    private String email;
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String createAccount() {
        //Managers.AccountManager manager = new AccountManager();
        //manager.createNewAccount(this.getEmail(), this.getPassword());

        return "login?faces-redirect=true";
    }

    public String login() {
        //Managers.AccountManager manager = new AccountManager();
        //ArrayList<Object> list = manager.accountLogin(this.getEmail(), this.getPassword());

        //if (list.get(0).equals(true)) {
            //Account account = (Account) list.get(1);
            //this.setUserId(account.getUserId());

            //return "viewUserProfile?faces-redirect=true";
        //} else {
            return "login?faces-redirect=true";
        //}

    }
}
