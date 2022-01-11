package com.greedy.level01.basic.extend;

public class Employee extends Person {

	private int salary;		// 급여
	private String dept;	// 부서
	
	/* 기본 생성자 */
	public Employee() {}
	
	/* 이름, 나이, 키, 몸무게, 급여, 부서를 초기화 하는 생성자 */
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		
		super(age, height, weight);
		super.name = name;
		
		this.salary = salary;
		this.dept = dept;
	}
	
	/* setter */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	/* getter */
	public int getSalary() {
		return salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	/* 모든 필드 값을 문자열로 반환하는 메소드 */
	@Override
	public String getInformation() {
		return super.getInformation()
				+ ", salary=" + this.salary
				+ ", dept=" + this.dept;
	}
	
}
