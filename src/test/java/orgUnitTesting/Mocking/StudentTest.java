package orgUnitTesting.Mocking;

;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentTest {

    StudentService studentService = Mockito.mock(StudentService.class);

    Student student = new Student(studentService);

@Test
@DisplayName("Testing Average of Students")
public void testAverage(){
        Mockito.when(studentService.getTotalMarks()).thenReturn(500);
        Mockito.when((studentService.getTotalStudents())).thenReturn(10);

        Assertions.assertEquals(50,student.getAverageMarks());
    }

}
