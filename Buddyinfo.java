class BuddyInfo {

    private String BuddyName = "Artemis";
    private String BuddyAdd;
    private int phoneNum;

    public String getBuddyName() {
        return BuddyName;
    }

    public String getBuddyAdd() {
        return BuddyAdd;
    }

    public int getphoneNum() {
        return phoneNum;
    }

    public BuddyInfo(String buddyName, String BuddyAdd, int phoneNum) {
        BuddyName = buddyName;
        BuddyAdd = BuddyAdd;
        this.phoneNum = phoneNum;
    }

}