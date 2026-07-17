package hw5;

public class HW5_09_04 {
	
	private static class MyRectangle {
		double width, depth;
		
		public MyRectangle() {
			
		}
		
		public MyRectangle(double width, double depth) {
			this.width = width;
			this.depth = depth;
		}
		
		
		void setWidth(double width) {
			this.width = width;
		}
		
		void setDepth(double depth) {
			this.depth = depth;
		}
		
		double getArea() {
			return width * depth;
		}
	}

	public static void main(String[] args) {
		MyRectangle rectangle1 = new MyRectangle();
		rectangle1.setWidth(10);
		rectangle1.setDepth(20);
		System.out.println("Area is: "+ rectangle1.getArea());  
		
		MyRectangle rectangle2 = new MyRectangle(10, 20);
		System.out.println("Area is: "+ rectangle2.getArea());
	}
}
