package com.ipi.nanas;

public class Rujak {
	
	private Nanas nanas;
	
	private Pisang pisang;
	
	private Timun timun;
	
	public String campur(){
		
		return "campur semua jadi rujak";
	}

	public Nanas getNanas() {
		return nanas;
	}

	public void setNanas(Nanas nanas) {
		this.nanas = nanas;
	}

	public Pisang getPisang() {
		return pisang;
	}

	public void setPisang(Pisang pisang) {
		this.pisang = pisang;
	}

	public Timun getTimun() {
		return timun;
	}

	public void setTimun(Timun timun) {
		this.timun = timun;
	}
	
}
