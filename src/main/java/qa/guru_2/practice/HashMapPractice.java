package qa.guru_2.practice;

import java.util.*;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMapPractice hashMapMethods = new HashMapPractice();

        Random rand = new Random();
        HashMap<Integer, Integer> RandomNumbers = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int r = rand.nextInt(10);
            Integer freq = RandomNumbers.get(r);
            RandomNumbers.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(RandomNumbers);

        hashMapMethods.addMethod("First Element", 1);
        hashMapMethods.addMethod("Second Element", 2);
        hashMapMethods.addMethod("Third Element", 3);

        System.out.println(hashMapMethods.getElements());

        hashMapMethods.removeMethod("First Element");

        System.out.println(hashMapMethods.getElements());

        System.out.println(hashMapMethods.getValues("Second Element"));
    }

    private final HashMap<String, Integer> hashMapMethod = new HashMap<>();

    public void addMethod(String element, int value) {
        hashMapMethod.put(element, value);
    }

    public void removeMethod(String element) {
        hashMapMethod.remove(element);
    }

    public Integer getValues(String element) {
        return hashMapMethod.get(element);
    }

    public List<Integer> getElements() {
        return new ArrayList<>(hashMapMethod.values());
    }

}
