package com.rythm.test;

class Animal {
	void eat() {
		System.out.println("animal : eat");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog : eat");
	}

	void eatTest() {
		this.eat(); // this 调用自己的方法
		super.eat(); // super 调用父类方法
	}
}

public class Test_animal {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eatTest();
	}
}