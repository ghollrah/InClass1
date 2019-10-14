import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	private static final int INITIAL_RATING = 5;

	@BeforeEach
	void setUp() throws Exception {
	}
	

	@Test
	void testCompareTo() throws NameException {
		Student firstStudent = new Student("x", "y", 2);
		Student secondStudent = new Student("X", "Y", 3);
		
		
		int actual = secondStudent.compareTo(firstStudent);
		int expected = 1;
		
		assertEquals(expected, actual);
		Student student = new Student("X", "Y", 5);
		
		expected = -1;
		actual = secondStudent.compareTo(student);
		assertEquals(expected, actual);
		
	}

	@Test
	public void testStudent() {
		Student s;
		try {
			s = new Student();

			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING;
			assertEquals(expected, rating);
		} catch (NameException e) {
			// TODO Auto-generated catch block
			fail();
		}

	}
	
	@Test
	public void testGet() throws NameException {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
	}

}
