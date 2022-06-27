package com.samer.test;

import java.util.Arrays;
import java.util.List;

public class DemoUtils {

	private String academy = "Luv2Code academy";
	private String academyDuplicate = academy;
	private String[] firstThreeLettersOfAlphabet = { "A", "B", "C" };
	private List<String> academyInList = Arrays.asList("Luv", "2", "Code");

	public List<String> getAcademyInList() {
		return academyInList;
	}

	public String[] getFirstThreeLettersOfAlphabet() {
		return firstThreeLettersOfAlphabet;
	}

	public String getAcademy() {
		return academy;
	}

	public String getAcademyDuplicate() {
		return academyDuplicate;
	}

	public int add(int i, int j) {

		return i + j;
	}

	public Object isNull(Object o) {
		if (o != null)
			return o;
		return null;
	}

	public boolean isGreater(int n1, int n2) {
		return n1 > n2;
	}

	public String throwException(int n) throws Exception {
		if (n < 0)
			throw new Exception("value should be greater than 0");
		return "value is greater than 0";

	}

	public void checkTimeOut() throws InterruptedException {
		System.out.println("I a going to sleep");
		Thread.sleep(2000);
		System.out.println("Sleeping over");
	}

}
