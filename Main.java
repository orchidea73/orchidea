package gsav;

public class Main {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(2.5, 4.7, 6.5);
		System.out.println(triangle1.squareHeron());

		Triangle triangle2 = new Triangle(7.4, 8.2, 7.3);
		System.out.println(triangle2.squareHeron());

		Triangle triangle3 = new Triangle(2.6, 3.6, 1.7);
		System.out.println(triangle3.squareHeron());

	}

}
