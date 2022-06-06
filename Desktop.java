package week4.day3;

public class Desktop extends Computer {
	public void DesktopSize() {
		System.out.println("42 Inches");
	}
	
	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		desktop.ComputerModel();
		desktop.DesktopSize();
	}
	

}
