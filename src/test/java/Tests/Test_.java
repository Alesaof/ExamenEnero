package Tests;
//import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import tools.*;
import static org.junit.Assert.assertTrue;


public class Test_ {
    Analyze tryElement = new Analyze();
    int[] res;
    int[] res2;

    @Before
    public void init(){
        res = new int[2];
        res2 = new int[2];
    }

    @Test
    public void testAnalyzeFirstParam_() {
        res = tryElement.analyze(1000, 2000, 3);
        System.out.print("Try analyze First Param: ");
        assertTrue(res[0] == 11);
        System.out.println("OK");
    }

    @Test
    public void testAnalyzeSecondParam_() {
        res2 = tryElement.analyze(1000, 2000, 3);
        System.out.print("Try analyze Second Param: ");
        assertTrue(res2[1] == 12555);
        System.out.println("OK");
    }

    @Test
    public void testAnalyzeFirstParam1_() {
        res = tryElement.analyze(1000, 2000, 4);
        System.out.print("Try analyze First Param1: ");
        assertTrue(res[0] == 21);
        System.out.println("OK");
    }

    @Test
    public void testAnalyzeSecondParam1_() {
        res2 = tryElement.analyze(1000, 2000, 4);
        System.out.print("Try analyze Second Param1: ");
        assertTrue(res2[1] == 23665);
        System.out.println("OK");
    }

}
