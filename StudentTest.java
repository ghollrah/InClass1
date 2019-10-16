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
		
		// should be bigger than zero
		int actual = secondStudent.compareTo(firstStudent);
		boolean result = false;
		if (actual > 0) 
			result = true;
		assertTrue(result);
		
		//should be smaller than zero
		Student student = new Student("X", "Y", 5);
		result = false;
		actual = secondStudent.compareTo(student);
		if (actual < 0)
			result = true;
		assertTrue(result);
		
		//should be the same
		Student studentSame = new Student("x", "y", 5);
		result = false;
		actual = secondStudent.compareTo(studentSame);
		int expected = 0;
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
	
	@Test
	void testCompareTo() throws NameException {
		Student firstStudent = new Student("A", "B", 2);
		Student secondStudent = new Student("A", "C", 3);
		Student student = new Student("A", "A", 5);
		Student empty = new Student("Z", "", 3);
		Student secondEmpty = new Student ("x", "", 3);
		
		boolean result = false;
		
		CompareLastFirstName clfn = new CompareLastFirstName();
		
		clfn.compare(firstStudent, secondStudent);
		
		int actual = secondStudent.compareTo(firstStudent);
		
		if (actual > 0) 
			result = true;
		assertTrue(result);
		
		//should be smaller than zero
		Student student = new Student("X", "Y", 5);
		result = false;
		actual = secondStudent.compareTo(student);
		if (actual < 0)
			result = true;
		assertTrue(result);
		
		//should be the same
		Student studentSame = new Student("x", "y", 5);
		result = false;
		actual = secondStudent.compareTo(studentSame);
		int expected = 0;
		assertEquals(expected, actual);
		
	}

}
