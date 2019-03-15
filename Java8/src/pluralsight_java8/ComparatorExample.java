package pluralsight_java8;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args){

        Comparator<String> oldComp = getComparatorOldWay();
        System.out.println("By old way");
        listValuePrinter(oldComp);

        Comparator<String> newComp = getComparatorJava8Way();
        System.out.println("By Java8 lambda way");
        listValuePrinter(newComp);
    }

    private static Comparator<String> getComparatorJava8Way(){
        return (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
    }

    private static Comparator<String> getComparatorOldWay() {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        return comp;
    }

    private static void listValuePrinter(Comparator<String> comp) {
        List<String> list = Arrays.asList("***", "****", "*", "**");
        Collections.sort(list, comp);

        for(String s: list){
            System.out.println(s);
        }
    }
}
