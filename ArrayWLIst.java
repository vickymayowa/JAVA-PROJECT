
/*
 * Implementing an LinkedList in Java using dynamic arrays.
 */
import java.util.LinkedList;
import java.util.Collection;

public class ArrayWLIst {
    public static void main(String[] args) {
        LinkedList<String> name_of_students = new LinkedList<String>();
        name_of_students.add("Vickydev");
        name_of_students.add("JOshua");
        name_of_students.add("Micheal");
        name_of_students.add("Tolulope");
        name_of_students.add("Victor");

        System.out.println(name_of_students.get(3)); // get the value of LinkedList
        name_of_students.set(2, "Mayowa"); // change the value of the LinkedList
        name_of_students.remove(1); // remove the value from LinkedList
        name_of_students.clear(); // empty the value of araylist
        name_of_students.size(); // get the length of LinkedList

        for (int i = 0; i < name_of_students.size(); i++) {
            System.out.println(name_of_students.get(i));
        }
        for (String name : name_of_students) {
            System.out.println(name);
        }

        LinkedList<Integer> age = new LinkedList<Integer>();
        LinkedList<Boolean> status = new LinkedList<Boolean>();
        LinkedList<Character> option = new LinkedList<Character>();
        LinkedList<Double> score = new LinkedList<Double>();

        age.add(20);
        age.add(78);
        age.add(84);
        age.add(23);
        age.add(27);
        age.add(12);

        Collection.sort(age);
        for (int i : age) {
            System.out.println(i);
        }

        Collection.sort(name_of_students);
        for (String name : name_of_students) {
            System.out.println(name);
        }

    }
}
