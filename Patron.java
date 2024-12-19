public class Patron {
    private String fullName;
    private String id;
    private String residenceStatus;
    private String phoneNumber;

    public Patron(String fullName, String id, String residenceStatus, String phoneNumber) {
        this.fullName = fullName;
        this.id = id;
        this.residenceStatus = residenceStatus;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }
    public String getId() {
        return id;
    }
    public String getResidenceStatus() {
        return residenceStatus;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
}
