package com.greedy.level01.basic.extend;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/* 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 */
		Student[] students = new Student[3];
		
		/* 3명의 학생 정보 초기화 */
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		/* 향상된 for문 이용해 학생 정보 모두 출력 */
		for(Student s : students) {
			System.out.println(s.getInformation());
		}
		
		/* 일반for문 이용해 학생 정보 모두 출력 */
//		for(int i = 0; i < students.length; i++) {
//			System.out.println(students[i].getInformation());
//		}
		
		/* 최대 10명의 사원 정보를 기록할 수 있게 배열 할당 */
		Employee[] employees = new Employee[10];
		
		/* while(true) 이용해 사원들의 정보 계속 입력 받기
		 * 계속 추가할 것인지 물어보고 카운트 */
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		while(index < employees.length) {
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			employees[index++] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			char answer = sc.nextLine().charAt(0);
			
			if(answer != 'y' && answer != 'Y') break;
			
		}
		
		/* 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
		 * 현재 기록된 사원들의 정보를 모두 출력 */
		for(int i = 0; i < index; i++) {
			System.out.println(employees[i].getInformation());
		}

	}

}
