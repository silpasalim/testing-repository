package practicePackage;

public class PracticeClass {
	static PracticeClass t1 = new PracticeClass();
	static PracticeClass2 t2 = new PracticeClass2();
	public static void main(String[] args) {
		System.out.println("Hello World");
		t1.apple();
		orange();
		PracticeClass2.testing1();
		t2.testing2();
	}

	public void apple() {
		System.out.println("Apple Method");

	}
	public static void orange() {
		System.out.println("Orange");
	}
}
