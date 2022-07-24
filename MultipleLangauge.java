package week3.day1.assignments;

public abstract class MultipleLangauge implements Language, TestTool{

	public void python() {
		System.out.println("The language used in python");
	}
	
	public abstract void ruby();
}
