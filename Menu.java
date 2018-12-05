package com.CreateRead;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	String nama,alamat,norek;
	View v = new View();
	Scanner sc = new Scanner(System.in);
//	static ArrayList<String> array = new ArrayList<String>();
	int tanya;
	Crud go = new Crud();
	
	public void menu() {
		System.out.println("MAIN MENU");
		System.out.println("1. Account Number");
		System.out.println("2. Exit");
		System.out.println("Pilih Nomer : ");
		
	
		tanya = sc.nextInt();
	switch (tanya) {
	case 1:		
		subMenu();
		 System.out.println("###Show Data Nasabah###");
		 System.out.println("Nama Nasabah :+nama" );
		 System.out.println("Alamat :" +alamat);
		 System.out.println("Nomor Rekening :" +norek); 

		break;
	case 2:
		System.out.println("you exit");
		System.exit(0);		
}
	}
	
	
	public void subMenu() {
		System.out.println("1. Input Data");
		System.out.println("2.View Data");
		System.out.println("3. Inquery Data");
		System.out.println("4. Keluar");
		
		System.out.println("Masukan Pilihan : ");
		tanya = sc.nextInt();
		switch (tanya) {
		case 1:
			v.tampil();
			subMenu();
			break;

		default:
			break;
		}
	}
}




	
	
	

