import java.util.ArrayList;
import java.util.Arrays;

public class Branch {
	String name;
	Subject subject;
	
	public Branch(String name, Subject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Branch [name=" + name + ", subject=" + subject + "]";
	}
	
	
}
