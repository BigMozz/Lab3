public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        name = "Zak";
        address = "1834 Tweakdale drive";
        phoneNumber = "613-555-6789";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo("Phil",
                "1234 Mat crescent", "613-678-9823");
        System.out.print("Hello " + bud.getName());
    }
    public String getName() {
        return name;
    }
}
