package lv.JaDe.m0;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by marcis on 25.09.2015.
 */
public class SearchTest {



    @Test
    public void testbinarySearch(int x, int[] a){

        try {
            Search fi = new Search();

            int rez = fi.find(x, a);

            assertEquals(x, rez);

            System.out.println("Tests: OK, Rez:"+rez);

        }catch (AssertionError e){
            System.out.println("Tests: FAIL");

            throw e;
        }


    }


}
