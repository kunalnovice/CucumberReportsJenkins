package com.common;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomData {
	String txn_name;
	String email;
	public String getDefault_user() {
		return default_user;
	}

	public String getDefault_user_password() {
		return default_user_password;
	}
	public static String browser;
	public final   String default_user = "";
	public final String default_user_password = "";
	public final String localhosturl = "";
	public final String doctouploadpath = "";
	private String Doc_name;

	public String getEmail() {
		String first = "Name"
				+ RandomStringUtils.randomAlphabetic(5).toLowerCase();
		String domain = "Domain"
				+ RandomStringUtils.randomAlphabetic(3).toLowerCase();
		String topveleveldomain = "com";
		email = first + "@" + domain + "." + topveleveldomain;
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getrandomDoc_name() {
		Doc_name = "DName" + (RandomStringUtils.randomAlphabetic(8).toLowerCase());
		return Doc_name;

	}

	public void setDoc_name(String doc_name) {
		this.Doc_name = doc_name;
	}
	public String getrandomTxn_name() {
		txn_name = "TXNO" + (RandomStringUtils.randomAlphabetic(8).toLowerCase());
		return txn_name;

	}

	public void setTxn_name(String txn_name) {
		this.txn_name = txn_name;
	}

	public String getrandomMatter_no() {
		matter_no = "MATNO"
				+ RandomStringUtils.randomAlphabetic(8).toLowerCase();
		return matter_no;
	}

	public void setMatter_no(String matter_no) {
		this.matter_no = matter_no;
	}

	public String getrandomDistribution_name() {
		return distribution_name;
	}

	public void setDistribution_name(String distribution_name) {
		this.distribution_name = distribution_name;
	}

	String matter_no;
	String distribution_name;

	public static void main(String args[]) {
		RandomData rd = new RandomData();
		System.out.println(rd.getrandomTxn_name() + "  " + rd.getEmail());
	}
}