package isp;

public class person extends calculateIncrement implements pacientAge{
	private String name;
	private int age;
	
	public person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
