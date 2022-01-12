package com.greedy.level02.normal.extend;

public class Point {

	private int x;
	private int y;
	
	/* 기본 생성자 */
	public Point() {}
	
	/* 모든 필드를 초기화 하는 생성자 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/* setter */
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	/* getter */
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	/* x,y 좌표 값을 출력하는 메소드 */
	public void draw() {
		System.out.println("(x, y) : (" + this.x + ", " + this.y + ")");
	}
	
}
