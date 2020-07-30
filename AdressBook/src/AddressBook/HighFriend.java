package AddressBook;

class HighFriend extends Friend{
	private String work; // 직업

	HighFriend(String name, String phoneNum, String address, String work){
		super(name, phoneNum, address);
		this.work = work;
	}
	
	// Method(멤버메서드)
	//public void displayHighFriendInfo() {
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("직업 : " + work);
	}

}
