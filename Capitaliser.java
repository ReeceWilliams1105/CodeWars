import java.lang.StringBuilder;

public class JadenCase {

    public String toJadenCase(String phrase) {
        StringBuilder output = new StringBuilder();
        if (phrase != null && phrase.length() > 0) {
            String[] input = phrase.split(" ");
            for (int i = 0; i < input.length; i++) {
                StringBuilder temp = new StringBuilder(input[i]);
                char ch = temp.charAt(0);
                ch = Character.toUpperCase(ch);
                temp.setCharAt(0, ch);
                if (i > 0) {
                    output.append(" ");
                }
                output.append(temp);
            }
            return output.toString();
        }
        return null;
    }

}