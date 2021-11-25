package com.javaex.ex07;

import java.util.Scanner;

import org.w3c.dom.Node;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        String name, hp, school;
        
        for(int i=0;i< friendArray.length;i++) {
        	System.out.print("이름: ");
        	name=sc.nextLine();
        	System.out.print("핸드폰: ");
        	hp=sc.nextLine();
        	System.out.print("학교: ");
        	school=sc.nextLine();
        	
        	friendArray[i] = new Friend();
        	friendArray[i].setName(name);
        	friendArray[i].setHp(hp);
        	friendArray[i].setSchool(school);
        	System.out.println("---------------------------");
        }
        

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
