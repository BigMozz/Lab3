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
        if(newBud != null){
            buds.add(newBud);
        }

    }

    public BuddyInfo removeBuddy(int index)
    {
        if(index >= 0 && index < buds.size()){
            return buds.remove(index);
        }
        return null;
    }

    public static void main(String[] args)
    {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
