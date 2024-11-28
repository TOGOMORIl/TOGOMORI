package Exe_1_QA_2024_1.Exe_1_QA_2024_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



/**
 * Unit test for simple App.
 */
public class AppTest {
	question4 tester=new question4();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_1() {
        String Expected_result="A";
        int a=28,b=5;
        String mod="regular";
      String actual_result=tester.compare(a, b,mod);
      assertEquals(Expected_result,actual_result);
    }
    @Test
    public void test_2() {
        String Expected_result="A";
        int a=28, b =24;
        String mod="regular";
      String actual_result=tester.compare(a, b,mod);
      assertEquals(Expected_result,actual_result);
    }
    @Test
    public void test_3() {
        String Expected_result="B";
        int a=-28, b =-38;
        String mod="negative";
      String actual_result=tester.compare(a, b,mod);
      assertEquals(Expected_result,actual_result);
    }
    
    
   
}
