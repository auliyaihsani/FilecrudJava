package com.CreateRead;

import java.util.Scanner;


public class View {
	
String nama,alamat,norek;
public void tampil() {
	Scanner sc = new Scanner(System.in);
	System.out.println("### Account Numberr ###");
	System.out.println("Nama Nasabah :"+nama);
	nama = sc.next();
	System.out.println("Alamat :"+alamat);
	alamat = sc.next();
	System.out.println("Nomor Rekening :"+norek);
	norek = sc.next();

	}
}
