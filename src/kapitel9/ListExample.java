package kapitel9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {

        List<String> studentList = new ArrayList<String>();


        studentList.add("Karl");
        studentList.add("Gabi");
        studentList.add("Fritz");

        System.out.println("Anzahl Studierende: " + studentList.size());

        studentList.remove(2);

        studentList.add("Michael");
        studentList.add("Claudia");
        studentList.add("Franz");
        studentList.add("Gabi");
        //studentList.add(5); // Autoboxing von int zu Integer

        //Integer number = new Integer(5);

        System.out.println("Anzahl Studierende: " + studentList.size());

        studentList.add(2, "Heide");

        System.out.println("Index von Gabi: " + studentList.indexOf("Gabi"));
        studentList.remove("Gabi");
        System.out.println("Index von Gabi: " + studentList.indexOf("Gabi"));

        System.out.println("Ausgabe - for");
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        System.out.println("Ausgabe - for-each");
        for(String student : studentList) {
            System.out.println(student);
        }


        System.out.println("Ausgabe - iterator");
        Iterator<String> i = studentList.iterator();
        while(i.hasNext()) {
            String student = i.next();
            System.out.println(student);
        }

    }
}
