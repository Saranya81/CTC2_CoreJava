package com.cg.day3;

public class ConstrutorMain {
	public static void main(String[] args) {
		int id = 42;
		String name = "Yazhini";
		ConstructorMethod m = new ConstructorMethod(name,id);
		m.display();
		ConstructorMethod mv = new ConstructorMethod();
		mv.display();

	}


}
