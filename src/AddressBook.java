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
        System.out.println("Address Book");
    }
}
