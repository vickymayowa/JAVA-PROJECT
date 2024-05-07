import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {

        // System.out.println("Good to go");
        HashMap<String, String> course_instructor = new HashMap<String, String>();
        course_instructor.put("Java", "Yemi");
        course_instructor.put("PM", "Mr Blessing");
        course_instructor.put("HTML", "No man");
        course_instructor.put("Python", "Yemi");
        course_instructor.put("Product Design", "Titilayo");

        // course_instructor.get("Java"); //To get the value be the get method.
        // course_instructor.remove("HTML"); //To remove the value be the remove method.
        // course_instructor.clear(); //To clear
        // course_instructor.size(); //To get the size.

        // To get the keySet.
        for (String course : course_instructor.keySet()) {
            System.out.println(course);
        }

        // To display the values.
        for (String course : course_instructor.values()) {
            System.out.println(course);
        }

        // To display the values and the keySet.
        for (String course : course_instructor.keySet()) {
            System.out.println("Course: " + course + " Instructor: " + course_instructor.get(course));
        }
        // System.out.println(course_instructor);

        HashMap<String, Integer> inst_age = new HashMap<String, Integer>();
        inst_age.put("Yemi", 28);
        inst_age.put("Blessing", 34);
        inst_age.put("Titilayo", 35);

        HashMap<String, Boolean> inst_status = new HashMap<String, Boolean>();
        inst_status.put("Yemi", true);
        inst_status.put("Blessing", false);

    }
}