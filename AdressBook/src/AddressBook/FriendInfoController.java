package AddressBook;

import java.util.Scanner;

class FriendInfoController {
	    //HighFriend[] highFriend;
		//UnivFriend[] univFriend;
		Friend[] friend;
		//int indexHigh;
		//int indexUniv;
		int index;
		
		FriendInfoController() {
			//highFriend = new HighFriend[100];
			//univFriend = new UnivFriend[100];
			friend = new Friend[200];
			//indexHigh = 0;
			//indexUniv = 0;
			index = 0;
		}

		
		public void addFriend(int choice) {
			//System.out.println("addFriend() 호출.");
			//if(indexHigh >= 100 || indexUniv >= 100) {
			if(index >= 200) {
				System.out.println("더 이상 저장할 공간이 없습니다.");
				return;
			}
			
			Scanner input = new Scanner(System.in);
			String name = null, phone = null, address = null, work = null;
			
			System.out.print("이름을 입력하세요 : ");
			name = input.nextLine();
			System.out.print("전화번호를 입력하세요 : ");
			phone = input.nextLine();
			System.out.print("주소를 입력하세요 : ");
			address = input.nextLine();
			
			if(choice == 1) {
				System.out.print("직업을 입력하세요 : ");
				work = input.nextLine();
				
				//System.out.printf("%s, %s, %s, %s\n", 
						                    //name, phone, address, work);
				
				//highFriend[indexHigh] = new HighFriend(name, phone, address, work);
				//indexHigh++;
				friend[index] = new HighFriend(name, phone, address, work);
				index++;
				
			}else {
				System.out.print("전공을 입력하세요 : ");
				work = input.nextLine();
				
				//System.out.printf("%s, %s, %s, %s\n", 
	                                        //name, phone, address, work);
				
				//univFriend[indexUniv] = new UnivFriend(name, phone, address, work);
				//indexUniv++;
				friend[index] = new UnivFriend(name, phone, address, work);
				index++;
			}
		}
		
		public void displayHighInfo(){
			/*
			for(int i = 0; i < indexHigh; i++) {
				highFriend[i].displayHighFriendInfo();
			}
			*/
			for(int i = 0; i < index; i++ ) {
				if(friend[i] instanceof HighFriend) {
					friend[i].displayFriendInfo();
				}
			}
		}
		
		public void displayUnivInfo(){
			/*
			for(int i = 0; i < indexUniv; i++) {
				univFriend[i].displayUnivFriendInfo();
			}
			*/
			for(int i = 0; i < index; i++ ) {
				if(friend[i] instanceof UnivFriend) {
					friend[i].displayFriendInfo();
				}
			}
		}
		
		public void displayFriendInfo() {
			/*
			for(int i = 0; i < indexHigh; i++) {
				highFriend[i].displayHighFriendInfo();
			}
			
			for(int i = 0; i < indexUniv; i++) {
				univFriend[i].displayUnivFriendInfo();
			}
			*/
			
			for(int i = 0; i < index; i++ ) {
				friend[i].displayFriendInfo();
			}
		}

}
