public class BuddyInfo {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String name, address, phoneNumber;


    public static void main(String[] args) {
        BuddyInfo homerBuddyInfo = new BuddyInfo();
        homerBuddyInfo.setName("Homer");
        homerBuddyInfo.setAddress("Spring Town");
        homerBuddyInfo.setPhoneNumber("9029999999");

        System.out.println("Hello, " + homerBuddyInfo.getName() + ",\nyour address is: " + homerBuddyInfo.getAddress() + ",\nphone number: " + homerBuddyInfo.getPhoneNumber()+".");
    }

    public BuddyInfo() {
        this.name = "Default Name";
        this.address = "Default Address";
        this.phoneNumber = "0000000000";
    }


    public BuddyInfo(String iName, String iAddress, String iPhoneNumber){
        name = iName;
        address = iAddress;
        phoneNumber = iPhoneNumber;
    }
    public void testGitLab2(){
        System.out.println("Suc 2");
    }
}
