package orgUnitTesting.Mocking;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class StudentTest {

    StudentService studentService = Mockito.mock(StudentService.class);

    Student student = new Student(studentService);

@Test
public void testAverage(){
        Mockito.when(studentService.getTotalMarks()).thenReturn(500);
        Mockito.when((studentService.getTotalStudents())).thenReturn(10);

        Assert.assertEquals(50,student.getAverageMarks());
    }

}
