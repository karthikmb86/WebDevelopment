package com.kr.web.model;

public class BusinessPartners {
	private int BPid;
	private String BPName;
	private String Supplier;
	private String BPCategory;
	public int getBPid() {
		return BPid;
	}
	public void setBPid(int bPid) {
		BPid = bPid;
	}
	public String getBPName() {
		return BPName;
	}
	public void setBPName(String bPName) {
		BPName = bPName;
	}
	public String getSupplier() {
		return Supplier;
	}
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}
	public String getBPCategory() {
		return BPCategory;
	}
	public void setBPCategory(String bPCategory) {
		BPCategory = bPCategory;
	}
	@Override
	public String toString() {
		return "BusinessPartners [BPid=" + BPid + ", BPName=" + BPName + ", Supplier=" + Supplier + ", BPCategory="
				+ BPCategory + "]";
	}

	
}
