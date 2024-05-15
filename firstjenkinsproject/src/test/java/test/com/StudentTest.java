/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.firstjenkinsproject.Student;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Shouvik
 */
public class StudentTest {
    Student stu;
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        stu = new Student("tom", 1, "tom@abc");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testEmail()throws Exception {
        assertEquals(stu.getEmail(),"tom@abc");
        
    }
    @Test
    public void testFirstname()throws Exception {
        assertEquals(stu.getFirstname(),"tom");
    }
    @Test
    public void testid()throws Exception {
        assertEquals(stu.getId(),1);
    }
}
