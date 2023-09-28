import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> allBuddyInfo = new ArrayList<>();

    public void addBuddy(BuddyInfo buddyInfo){
        allBuddyInfo.add(buddyInfo);
    }
    public void removeBuddy(BuddyInfo buddyInfo){
        allBuddyInfo.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void testGitLab1(){
        System.out.println("Suc 1");
    }
    //testFromGit1
    //testNewBranchRuangfafa1
}


