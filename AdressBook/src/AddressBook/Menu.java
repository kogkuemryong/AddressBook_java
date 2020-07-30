package AddressBook;

import java.util.Scanner;

class Menu {
	// field
		FriendInfoController controller;
		
		// 생성자
		Menu(){
			controller = new FriendInfoController();
		}
		
		// 메서드
		public void displayMenu() {
			
			while(true) {
				System.out.println("*** 메뉴 선택 ***");
				System.out.println("0. 프로그램 종료");
				System.out.println("1. 고교 친구 정보 입력.");
				System.out.println("2. 대학교 친구 정보 입력.");
				System.out.println("3. 고교 친구 정보 출력.");
				System.out.println("4. 대학교 친구 정보 출력.");
				System.out.println("5. 고교/대학교 친구 정보 출력.");
				
				System.out.print("원하는 항목 번호를 선택하세요>>");
				
				Scanner input = new Scanner(System.in);
				
				int choice = input.nextInt();
				
				switch(choice) {
					case 0:
						System.out.println("프로그램을 종료합니다.");
						return;
					case 1: case 2:
						controller.addFriend(choice);
						break;
					case 3:
						controller.displayHighInfo();
						break;
					case 4:
						controller.displayUnivInfo();
						break;
					case 5:
						controller.displayFriendInfo();
						break;
					default:
						System.out.println("잘못된 입력을 하셨습니다.");
						System.out.println("번호를 확인하세요.");
						break;
				}
				
			}
		}

}
