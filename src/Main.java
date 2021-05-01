
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java", "Java Temelleri", "Yazýlým Geliþtirici Yetiþtirme Kursu", 277.99);
		Course course2 = new Course(2, "C#", "Döngüler", "Yazýlým Geliþtirici Yetiþtirme Kursu", 399.99);
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", "Diziler", "Yazýlým Geliþtirici Yetiþtirme Kursu", 29.99);
		
		Course[] courses = {course1, course2, course3}; 
		for(Course course : courses) {
			System.out.println(course.id + "-" + course.name + " " + course.detail + " " + course.kind + " " + course.price);
			
		}
		
		Instructor instructor1 = new Instructor("1234567891", "Engin", "Demirog", 30);
		Instructor instructor2 = new Instructor("1234567892", "Beyza", "Ayhan", 25);
		Instructor[] instructors = {instructor1, instructor2};
		for(Instructor instructor : instructors ) {
			System.out.println("Eðitmen: " + instructor.firstName + " " + instructor.lastName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
	}
	

}

