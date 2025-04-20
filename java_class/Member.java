package java_class;

public class Member {
    private static int nextID = 2547;
    private int ID;
    private static int nextLockerID = 610;
    private int LockerID;
    private String name;
    private String email;
    private String phone;
    private String location;
    private String Mem_pac;
    private String membership;
    private int totalPrice;
    
    // Constructor
    public Member(String name, String email, String phone, String location, String Mem_pac, String membership, int totalPrice) {
        this.ID = nextID++;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.LockerID = nextLockerID++;
        this.Mem_pac = Mem_pac;
        this.membership = membership;
        this.totalPrice = totalPrice;  // Corrected assignment
    }

    public void setID(int ID) {this.ID = ID;}
    public void setLockerID(int LockerID) {this.LockerID = LockerID;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setLocation(String location) {this.location = location;}
    public void setPackage(String Mem_pac) {this.Mem_pac = Mem_pac;}
    public void setMembership(String membership) {this.membership = membership;}
    public void setTotalPrice(int totalPrice) {this.totalPrice = totalPrice;}
    
    public int getID() { return ID; }
    public int getLockerID() {return LockerID;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public String getLocation() {return location;}
    public String getPackage() {return Mem_pac;}
    public String getMembership() {return membership;}
    public int getTotalPrice() {return totalPrice;}
}
