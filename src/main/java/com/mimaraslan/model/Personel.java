package com.mimaraslan.model;

public class Personel {
	int id;
	String adi;
	public Personel() {
		id=1;
		adi="personel";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public Personel(int id, String adi) {
	
		this.id = id;
		this.adi = adi;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", adi=" + adi + "]";
	}

}
