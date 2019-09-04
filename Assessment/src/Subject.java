
public class Subject {
	String name;
	String Marks;
	public Subject(String name, String marks) {
		super();
		this.name = name;
		Marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return Marks;
	}
	public void setMarks(String marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", Marks=" + Marks + "]";
	}
	

}
