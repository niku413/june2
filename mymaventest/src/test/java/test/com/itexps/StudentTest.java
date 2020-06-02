/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.itexps.sales.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ishvar
 */
public class StudentTest {
    Student stu;
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        stu = new Student();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testName() {
         stu.setFirst("tom");
         assertEquals("tom", stu.getFirst());
     }
     @Test
     public void testId() {
         stu.setId(1);
         assertEquals(1, stu.getId());
     }
      @Test
     public void testLast() {
         stu.setLast("Smith");
         assertEquals("Smith", stu.getLast());
     }
}
