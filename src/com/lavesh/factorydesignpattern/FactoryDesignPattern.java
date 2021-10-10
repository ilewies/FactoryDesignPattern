package com.lavesh.factorydesignpattern;

abstract class ASuper {

	public abstract void m1(int i);

	public void m2(int j) {
		System.out.println("m2 concreate method from ASuper class j=" + j);
	}

	ASuper() {
		// System.out.println("Asuper constructor instantiation");
	}

}

class B extends ASuper {

	@Override
	public void m1(int i) {
		System.out.println("m1 method implemented in B class i=" + i);

	}
}

class C extends ASuper {

	@Override
	public void m1(int i) {

		System.out.println("m1 method implemented in C class i=" + i);
	}

}

class ASuperFactory {
	private static ASuper bInstance = new B();

	public static ASuper getBInstance() {

		return bInstance;
	}

	public static ASuper getCInstance() {
		return new C();
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {

		System.out.println("using Abstarct class ");
		ASuper b = ASuperFactory.getBInstance();
		System.out.println(b);
		ASuper b2 = ASuperFactory.getBInstance();
		System.out.println(b2);
		System.out.println();

		ASuper c = ASuperFactory.getCInstance();
		System.out.println(c.toString());
		ASuper c1 = ASuperFactory.getCInstance();
		System.out.println(c1);

	}

}
