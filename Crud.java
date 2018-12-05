package com.CreateRead;

import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
Scanner in = new Scanner(System.in);
String nama,alamat,norek;
//ArrayList<object> nama_varibel = new ArrayList<Object>();
ArrayList<Data> dataString = new ArrayList<Data>();

public void tambahdata() {
	
	System.out.println("Masukan NAma Nasabah");
	nama = in.nextLine();
	
	System.out.println("Masukan Alamat");
	alamat = in.nextLine();
	
	System.out.println("Masukan No rekening");
	norek = in.nextLine();
	
	dataString.add(new Data(nama,alamat,norek));
	
}


}
