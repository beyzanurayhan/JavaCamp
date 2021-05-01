
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java", "Java Temelleri", "Yaz�l�m Geli�tirici Yeti�tirme Kursu", 277.99);
		Course course2 = new Course(2, "C#", "D�ng�ler", "Yaz�l�m Geli�tirici Yeti�tirme Kursu", 399.99);
		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs", "Diziler", "Yaz�l�m Geli�tirici Yeti�tirme Kursu", 29.99);
		
		Course[] courses = {course1, course2, course3}; 
		for(Course course : courses) {
			System.out.println(course.id + "-" + course.name + " " + course.detail + " " + course.kind + " " + course.price);
			
		}
		
		Instructor instructor1 = new Instructor("1234567891", "Engin", "Demirog", 30);
		Instructor instructor2 = new Instructor("1234567892", "Beyza", "Ayhan", 25);
		Instructor[] instructors = {instructor1, instructor2};
		for(Instructor instructor : instructors ) {
			System.out.println("E�itmen: " + instructor.firstName + " " + instructor.lastName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
	}
	

}

