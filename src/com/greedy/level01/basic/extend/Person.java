package com.greedy.level01.basic.extend;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double weight;
	
	/* 기본 생성자 */
	public Person() {}
	
	/* 나이, 키, 몸무게를 초기화 하는 생성자 */
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	/* setter */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/* getter */
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	/* 모든 필드 값을 문자열로 반환하는 메소드 */
	public String getInformation() {
		return "name=" + this.name + ", age=" + this.age + ", height=" + this.height + ", weight=" + this.weight;
	}
	
}
