package com.ipi.entity;

import java.util.List;

public class Dosen {
	
	private String nama;
	
	private List<MataKuliah> lisMataKuliah;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<MataKuliah> getLisMataKuliah() {
		return lisMataKuliah;
	}

	public void setLisMataKuliah(List<MataKuliah> lisMataKuliah) {
		this.lisMataKuliah = lisMataKuliah;
	}
	
}
