/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calcjenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rthiebaut
 */
public class CalcJenkinsIT {
    public CalcJenkinsIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPlus() {
        int number1 = 2;
        int number2 = 3;
        assertEquals(CalcJenkins.plus(number1,number2), 5);
    }

    @Test
    public void testMinus() {
        int number1 = 2;
        int number2 = 3;
        assertEquals(CalcJenkins.minus(number1,number2), -1);
    }

    @Test
    public void testMultiply() {
        int number1 = 2;
        int number2 = 3;
        assertEquals(CalcJenkins.multiply(number1,number2), 6);
    }


    @Test
    public void testDivideNotZero() {
        int number1 = 6;
        int number2 = 3;
        assertEquals(CalcJenkins.divide(number1,number2), 2);
    }

    @Test
    public void testDivideZero() {
        int number1 = 6;
        int number2 = 0;
    }

}
