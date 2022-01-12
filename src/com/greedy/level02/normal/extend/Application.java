package com.greedy.level02.normal.extend;

public class Application {

	public static void main(String[] args) {
		
		/* 크기가 2인 Circle, Rectangle 각각 객체 배열 할당 */
		Circle[] circles = new Circle[2];
		
		Rectangle[] rectangles = new Rectangle[2];
		
		/* 각각 초기화 */
		circles[0] = new Circle(1, 2, 3);
		circles[1] = new Circle(3, 3, 4);
		
		rectangles[0] = new Rectangle(-1, -2, 5, 2);
		rectangles[1] = new Rectangle(-2, 5, 2, 8);
		
		/* 향상된 for문 이용해 각 도형의 draw 메소드 실행 */
		System.out.println("====== circle ======");
		for(Circle c : circles) {
			c.draw();
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle r : rectangles) {
			r.draw();
		}

	}

}
