package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaEndOffileTest {

    public static void main(String[] args) {
        //ArrayList
        ArrayList<String>arrayList = new ArrayList<String>();
        
        arrayList.add("Eng");
        arrayList.add("Lot");

        Iterator<String> iterator = arrayList.iterator();

        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.hasNext());

        
        
    }
}
