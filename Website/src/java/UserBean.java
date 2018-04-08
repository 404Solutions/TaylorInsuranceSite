//import Insurance.HomeOwner;

import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.validation.Validation;

@SessionScoped
//@RequestScoped
@ManagedBean(name = "UserBean")
public class UserBean implements Serializable {


    @ManagedProperty("#{AccountBean}")
    private AccountBean accountBean;
//    private HomeOwner homeOwner;
    private int userId;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String province;
    private String postalCode;
    private String licenseNumber;
    private String licenseDate;
    private int location;

    public AccountBean getAccountBean() {
        return accountBean;
    }

    public void setAccountBean(AccountBean accountBean) {
        this.accountBean = accountBean;
    }

    public int getUserId() {
        return userId;
    }

//    public HomeOwner getHomeOwner() {
//        return homeOwner;
//    }
//
//    public void setHomeOwner(HomeOwner homeOwner) {
//        this.homeOwner = homeOwner;
//    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String createHomeOwner() {

        this.setUserId(accountBean.getUserId());

        //Managers.HomeOwnerManager manager = new Managers.HomeOwnerManager();

        //this.homeOwner = manager.insertHomeOwner(this.userId, this.firstName,
                //this.lastName, this.dob, this.address, this.city, this.province,
                //this.postalCode, this.phone, this.email, this.gender);

        return "homeQuote?faces-redirect=true";
    }

    public String createPrimaryDriver() {

        this.setUserId(accountBean.getUserId());

        //Managers.DriversManager manager = new Managers.DriversManager();

        //Insurance.PrimaryDriver driver = manager.insertPrimaryDriver(this.userId, this.firstName,
               //this.lastName, this.dob, this.address, this.city, this.province,
                //this.postalCode, this.phone, this.email, this.gender, this.licenseNumber,
                //this.licenseDate, this.location);

        //System.out.printf("Id: %d", driver.getUserId());

        //TODO redirect to vehicleQuote page.
        //return "vehicleQuote?faces-redirect=true";
        return "viewUserProfile?faces-redirect=true";
    }

    public String updateUserAccount() {
        return "viewUserProfile?faces-redirect=true";
    }

}
