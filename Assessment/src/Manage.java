
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Manage {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		List<Branch> fsd = new ArrayList<Branch>();
		List<Branch> sap = new ArrayList<Branch>();
		
		student.add(new Student("1", "Tom",new Branch("FSD", new Subject("JAVA", "70"))));
		student.add(new Student("1", "Tom",new Branch("FSD", new Subject("RDBMS", "84"))));
		student.add(new Student("1", "Tom",new Branch("FSD", new Subject("CSS", "56"))));
		
		student.add(new Student("2", "veer",new Branch("FSD", new Subject("JAVA", "65"))));
		student.add(new Student("2", "veer",new Branch("FSD", new Subject("RDBMS", "46"))));
		student.add(new Student("2", "veer",new Branch("FSD", new Subject("CSS", "66"))));
		
		student.add(new Student("3", "Mani",new Branch("SAP", new Subject("ABAB", "78"))));
		student.add(new Student("3", "Mani",new Branch("SAP", new Subject("HANA", "57"))));
		student.add(new Student("3", "Mani",new Branch("SAP", new Subject("BASIS", "65"))));
		
		student.add(new Student("4", "aksh",new Branch("SAP", new Subject("ABAB", "90"))));
		student.add(new Student("4", "aksh",new Branch("SAP", new Subject("HANA", "86"))));
		student.add(new Student("4", "aksh",new Branch("SAP", new Subject("BASIS", "60"))));		
		Collections.sort(student, (a, b) -> {
			return b.getBranch().getSubject().getMarks().compareTo(a.getBranch().getSubject().getMarks());
		});
		//student.forEach(e -> System.out.println(e));
		Student[] st = student.toArray(new Student[0]);
		
		System.out.println("Highest marks in class " + st[0]);
		
		List<Branch> branch = new ArrayList<Branch>();
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getBranch().getName().equals("FSD")) {
			branch.add(student.get(i).getBranch());
			}
		}
		//System.out.println(branch);
		Collections.sort(branch, (a, b) -> {
			return b.getSubject().getMarks().compareTo(a.getSubject().getMarks());
		});
		
		
        Branch[] br = branch.toArray(new Branch[0]);
        
        
		
		System.out.println("Highest marks in fsd domain: " + br[0]);
			
	
	List<String> sub = new ArrayList<String>();
	for(int i=0;i<student.size();i++) {
		if(student.get(i).getBranch().getSubject().getName().equals("JAVA")) {
		sub.add(student.get(i).getBranch().getSubject().getMarks());
		}
		}
	Collections.sort(sub, (a, b) -> {
		return b.compareToIgnoreCase(a);
	});
	System.out.println("Highest marks in java: " + sub);
	
	
	List<Student> fail = new ArrayList<Student>();
	for(int i=0;i<student.size();i++) {
		String k=(student.get(i).getBranch().getSubject().getMarks());
		int x=Integer.parseInt(k);
		if(x<60) {
			fail.add(student.get(i));
		}
	
	}
	
	System.out.println("Failures: " + fail);
	
	List<Student> fsdfail = new ArrayList<Student>();
	for(int i=0;i<fail.size();i++) {
		if(fail.get(i).getBranch().getName().equals("FSD")) {
			fsdfail.add(fail.get(i));
		}
	}
	System.out.println("fsd fail: " + fsdfail);
}

	
	}



