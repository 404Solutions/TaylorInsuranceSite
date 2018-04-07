
//import Insurance.Driver;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="AccidentBean")
public class AccidentBean {

    //TODO get UserID to pass to manager
    private int secondaryID;
    private int yearOfAccident;
    private Boolean responsible;

    public int getSecondaryID() {
        return secondaryID;
    }

    public void setSecondaryID(int secondaryID) {
        this.secondaryID = secondaryID;
    }

    public int getYearOfAccident() {
        return yearOfAccident;
    }

    public void setYearOfAccident(int yearOfAccident) {
        this.yearOfAccident = yearOfAccident;
    }

    public Boolean getResponsible() {
        return responsible;
    }

    public void setResponsible(Boolean responsible) {
        this.responsible = responsible;
    }

    public String addAccident() {
        //TODO call manager
        return "vehicleQuoteAdditions?faces-redirect=true";
    }

}
