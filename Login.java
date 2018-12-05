package com.CreateRead;

import java.util.Scanner;

public class Login {

Scanner sc = new Scanner(System.in);
Menu m = new Menu();
public void loginMenu() {
	System.out.println("Login");
	System.out.print("Username = ");
	String username = sc.next();
	System.out.print("Password = ");
	String pwd = sc.next();
	
if(username.equals("admin") && pwd.equals("root")) {
	System.out.println("login berhasil");
	m.menu();
}else {
	System.exit(0);
}
}
	
	
}
