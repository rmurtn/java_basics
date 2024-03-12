package qa.guru_2.practice;

import java.util.ArrayList;

public class ArrayListPractice {
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String value) {
        list.add(value);
    }

    public void deleteElement(String value) {
        list.remove(value);
    }

    public ArrayList<String> returnElements() {
        return list;
    }

    public String getElement(int value) {
        return list.get(value);
    }

    public static void main(String[] args) {

        ArrayListPractice arrayListObject = new ArrayListPractice();

        arrayListObject.addElement("Horse");
        arrayListObject.addElement("Cat");
        arrayListObject.addElement("Camel");
        arrayListObject.addElement("Mice");

        System.out.println(arrayListObject.returnElements());

        arrayListObject.deleteElement("Horse");
        System.out.println(arrayListObject.returnElements());

        while (arrayListObject.getElement(2).equals("Camel")) {
            System.out.println("All good");
            return;
        }
        System.out.println("Wrong");
    }
}
