import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 words: ");
        for (int i = 0; i < 5; i++) {
            String element = scanner.next();
            listA.add(element);
        }
        System.out.println("List a: "+listA);
        System.out.println("--------------------");
        System.out.println("Write 5 words: ");
        for (int i = 0; i < 5; i++) {
            String element = scanner.next();
            listB.add(element);
        }
        System.out.println("List b: "+ listB);
        System.out.println("--------------------");
        List<String> listC = new ArrayList<>();
        listC.add(listA.get(0));
        listC.add(listB.get(4));
        listC.add(listA.get(1));
        listC.add(listB.get(3));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(1));
        listC.add(listA.get(4));
        listC.add(listB.get(0));
        System.out.println("List c: " + listC);
        Collections.sort(listC, new Comparator<String>() {

            @Override public int compare(String s1, String s2) {

                return s1.length() - s2.length(); } } );
        System.out.println("List c: " + listC);


    }
}