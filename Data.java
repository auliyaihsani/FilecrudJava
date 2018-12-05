package com.CreateRead;

public class Data {
	private String nama;
	private String alamat;
	private String norek;
	
	public Data(String a, String b, String c) {
		this.nama= a;
		this.alamat = b;
		this.norek = c;
	}

	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNorek() {
		return norek;
	}
	public void setNorek(String norek) {
		this.norek = norek;
	}
}
