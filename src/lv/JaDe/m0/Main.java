package lv.JaDe.m0;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//
//        int x = 6;
//
//        Search fi = new Search();
//
//        System.out.println("Atgutais rezultats: "+fi.find(x,a));

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int x = 10;

        SearchTest st = new SearchTest();

        st.testbinarySearch(x,a);



    }
}
