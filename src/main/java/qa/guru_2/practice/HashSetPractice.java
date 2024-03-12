package qa.guru_2.practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        System.out.println(set);

        addMethod(set, "Sixth through method");
        addMethod(set, "Seventh through method");
        getSet(set);

        removeMethod(set, "Sixth through method");
        getSet(set);

        findMethod(set, "Four");
    }

    public static void addMethod(Set<String> set, String element) {
        set.add(element);
    }

    public static void removeMethod(Set<String> set, String element) {
        set.remove(element);
    }

    public static void findMethod(Set<String> set, String value) {
        for (String element : set) {
            if (element.equals(value)) {
                System.out.println(value);
            }
        }
    }

    private static void getSet(Set<String> set) {
        System.out.println(set);
    }
}
