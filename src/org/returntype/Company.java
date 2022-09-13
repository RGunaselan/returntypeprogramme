package org.returntype;

public class Company {
	private int anand(int amount) {
		return 100+amount;
	}
	private int ram(int amount) {
		return 100+amount;
	}
	private String guna(String NextWeek) {
		return "Sorry"+NextWeek;
	}
public static void main(String[] args) {
	Company company=new Company();

	int anand = company.anand(200);
	int ram = company.ram(200);
	String guna = company.guna(" bro");
	System.out.println(anand);
	System.out.println(ram);
	System.out.println(guna);
}
}
