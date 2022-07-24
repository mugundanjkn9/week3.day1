package week3.day1.assignments;

public class Automation extends MultipleLangauge{
	
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Langauage Java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Testing Tool as Selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Language used as Ruby");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation a1 = new Automation();
		a1.Java();
		a1.Selenium();
		a1.python();
		a1.ruby();
	}
}
