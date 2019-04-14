package sample;


import java.sql.Date;

public class Customer {

    private String firstName;
    private String familyName;
    private Date entryDate;


    public Customer(String firstName, String familyName, Date entryDate) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.entryDate = entryDate;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", familyName=" + familyName + ", entryDate=" + entryDate + "]";
    }

}
