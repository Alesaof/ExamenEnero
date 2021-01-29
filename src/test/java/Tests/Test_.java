package Tests;
//import org.junit.Before;
import org.junit.Test;
import tools.*;
import static org.junit.Assert.assertTrue;


public class Test_ {


    @Test
    public void testAnalyze() {
        int[] res;
        res = Analyze.analyze(1000, 2000, 3);
        System.out.print("Try analyze: ");
        System.out.println(res[0]);
        assertTrue(res[0] == 11);
    }
}
