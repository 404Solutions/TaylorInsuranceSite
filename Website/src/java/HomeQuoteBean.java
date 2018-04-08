
//import Insurance.Home;
//import Insurance.HomeOwner;
//import Insurance.HomePremium;
//import Managers.HomeManager;
//import Managers.HomeQuoteManager;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "HomeQuoteBean")
public class HomeQuoteBean implements Serializable{

    @ManagedProperty("#{UserBean.homeOwner}")
//    private HomeOwner homeOwner;
//    private Home home;
    private String QuoteID;
    private double value;
    private int homeYear;
    private int homeType;
    private int heatingType;
    private String address;
    private String city;
    private String province;
    private String postalCode;
    private Date startDate;
    private Date endDate;
    private double basePremium;
    private double tax;
    private double total;

//    public HomeOwner getHomeOwner() {
//        return homeOwner;
//    }
//
//    public void setHomeOwner(HomeOwner homeOwner) {
//        this.homeOwner = homeOwner;
//    }
//
//    public Home getHome() {
//        return home;
//    }
//
//    public void setHome(Home home) {
//        this.home = home;
//    }

    public String getQuoteID() {
        return QuoteID;
    }

    public void setQuoteID(String quoteID) {
        QuoteID = quoteID;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getHomeYear() {
        return homeYear;
    }

    public void setHomeYear(int homeYear) {
        this.homeYear = homeYear;
    }

    public int getHomeType() {
        return homeType;
    }

    public void setHomeType(int homeType) {
        this.homeType = homeType;
    }

    public int getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(int heatingType) {
        this.heatingType = heatingType;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(double basePremium) {
        this.basePremium = basePremium;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String createQuote() {

//        HomeManager homeManager = new HomeManager();
//        HomeQuoteManager homeQuoteManager = new HomeQuoteManager();
//
//        home = homeManager.insertHome(this.value, this.homeYear, this.homeType, this.heatingType, this.postalCode,
//                this.address, this.city, this.province);
//
//        basePremium = HomePremium.calcPremium(this.value, this.homeYear, this.homeType, this.heatingType);

        this.tax = basePremium * 0.15;
        this.total = basePremium * 1.15;

        //homeQuoteManager.createNewQuote(basePremium, this.tax, this.total, home, homeOwner);

        //TODO Call HomePremium.calcPremium()
        return "homeQuoteResult?faces-redirect=true";
    }

    public String createPolicy() {
        return "homePolicy?faces-redirect=true";
    }
}
