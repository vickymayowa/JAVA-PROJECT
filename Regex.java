import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    String comment = "This is a java class";

    public static void main(String[] args) {
        Pattern pat = Pattern.compile("class", Pattern.CASE_INSENSITIVE);

        JavaRegularExpression instance = new JavaRegularExpression(); 
        Matcher mat = pat.matcher(instance.comment);
        boolean find = mat.find();

        if (find) {
            System.out.println("We have a match in the text");
        } else {
            System.out.println("No match found in the text");
        }
    }
}