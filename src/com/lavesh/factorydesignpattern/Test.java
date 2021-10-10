package com.lavesh.factorydesignpattern;

interface AA {
	public abstract void m1(int i);

	public abstract void m2(int j);

	public abstract void m3(int k);
}

class BB implements AA {

	@Override
	public void m1(int i) {
		System.out.println("B class impl m1 i=" + i);
	}

	@Override
	public void m2(int j) {
		System.out.println("B class impl m2 j=" + j);
	}

	@Override
	public void m3(int k) {
		System.out.println("B class impl m3 k=" + k);
	}

}

class CC implements AA {

	@Override
	public void m1(int i) {
		System.out.println("CC class impls m1 i=" + i);
	}

	@Override
	public void m2(int j) {
		System.out.println("CC class impls m2 j=" + j);
	}

	@Override
	public void m3(int k) {
		System.out.println("CC class impls m3 k=" + k);
	}

}

class AAFactory {
	private static AA ainstance = new BB();

	public static AA getBBInstance() {
		return ainstance;
	}

	public static AA getCCInstance() {
		return new BB();
	}
}

public class Test {

	public static void main(String[] args) {
		System.out.println("using Interface");
		AA aaObj = AAFactory.getBBInstance();
		System.out.println(aaObj);

		AA aaObj2 = AAFactory.getBBInstance();
		System.out.println(aaObj2);

		System.out.println();
		AA bbb = AAFactory.getCCInstance();
		AA bbb2 = AAFactory.getCCInstance();
		System.out.println(bbb);
		System.out.println(bbb2);

	}

}
