package com.greedy.level02.normal.extend;

public class Circle extends Point {

	private int radius;
	
	/* 기본 생성자 */
	public Circle() {}
	
	/* x, y, radius를 초기화 하는 생성자 */
	public Circle(int x, int y, int radius) {
		
		super(x, y);
		
		this.radius = radius;
	}
	
	/* 부모클래스의 draw() 메소드 호출을 통해 x, y 좌표 값 출력 후
	 * 원의 면적, 둘레 값을 출력하는 메소드 */
	@Override
	public void draw() {
		
		super.draw();
		
		System.out.printf("면적 : %.1f\n", (Math.PI * this.radius * this.radius));
		System.out.printf("둘레 : %.1f\n", (Math.PI * this.radius * 2));
		/* System.out.printf(); : format에 맞춰서 출력한다. 개행이 되지 않는다.
		 * printf(String format, Object... args) : (출력하고자 하는 format, 가변 인자 만큼 넘길 수 있다.)
		 * printf는 개행이 되지 않으므로 \n 입력
		 * %d : 정수 값에 대한 format, %f : 실수 값에 대한 format
		 * %와 자료형 사이에 숫자를 입력해 자리 맞춤, 소수점 자르기가 가능하다.
		 * %.1f : 소수점 첫 번째 자리까지만
		 * 
		 * Math.round(a) : 반올림 가능하지만 소수점 지정은 불가능 */
								
		System.out.println("면적 : " + (Math.PI * this.radius * this.radius));
		System.out.println("둘레 : " + (Math.PI * this.radius * 2));
	}
	
}
