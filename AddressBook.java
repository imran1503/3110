import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo>myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null ){
            myBuddies.add(buddy);
        }
    }

    public void removeBuddy(int index){
       if(index >=0 && index < myBuddies.size()){
           myBuddies.remove(index);
       }
    }

    public static void main(String[] args){
        BuddyInfo buddy  = new BuddyInfo("Tom", "Carleton",613 );
        System.out.println( "Address Book");
        AddressBook addressBook = new AddressBook();
        //addressBook
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);






    }
}

