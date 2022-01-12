package com.greedy.level02.normal.extend;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	/* 기본 생성자 */
	public Rectangle() {}
	
	/* x, y, 너비, 높이를 초기화 하는 생성자 */
	public Rectangle(int x, int y, int width, int height) {
		
		super(x, y);
		
		this.width = width;
		this.height = height;
	}
	
	/* setter */
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	/* getter */
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	/* 부모클래스의 draw() 메소드 호출을 통해 x, y 좌표 값 출력 후
	 * 사각형 면적, 둘레 값을 출력하는 메소드 */
	@Override
	public void draw() {
		
		super.draw();
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (2 * (width + height)));
	}
	
}
