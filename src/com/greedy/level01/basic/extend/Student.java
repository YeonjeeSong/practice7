package com.greedy.level01.basic.extend;

public class Student extends Person {

	private int grade;		// 학년
	private String major;	// 전공
	
	/* 기본 생성자 */
	public Student() {}
	
	/* 이름, 나이, 키, 몸무게, 학년, 전공을 초기화 하는 생성자 */
	public Student(String name, int age, double height, double weight, int grade, String major) {
		
		super(age, height, weight);
		super.name = name;
		
		this.grade = grade;
		this.major = major;
	}
	
	/* setter */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	/* getter */
	public int getGrade() {
		return grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	/* 모든 필드 값을 문자열로 반환하는 메소드 */
	@Override
	public String getInformation() {
		return super.getInformation()
				+ ", grade=" + this.grade
				+ ", major=" + this.major;
	}
	
}
