import java.util.ArrayList;

public class AddressBook
{
    private ArrayList<BuddyInfo> buds;

    public AddressBook()
    {
        buds = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo newBud)
    {
        buds.add(newBud);
    }

    public void removeBuddy(BuddyInfo loseBud)
    {
        buds.remove(loseBud);
    }

    public static void main(String[] args)
    {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Address Book");
    }
}
