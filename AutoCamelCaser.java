import java.lang.StringBuilder;

class Solution {

    static String toCamelCase(String s) {
        StringBuilder output = new StringBuilder();
        char ch;
        boolean capitalised = false;
        if (s.length() > 0) {
            String[] sArr = s.split("[-_]");
            for (int i = 0; i < sArr.length; i++) {
                StringBuilder temp = new StringBuilder(sArr[i]);
                capitalised = false;
                ch = temp.charAt(0);
                if (Character.isUpperCase(ch)) {
                    capitalised = true;
                }
                if (capitalised == true || i > 0) {
                    ch = Character.toUpperCase(ch);
                    temp.setCharAt(0, ch);
                    output = output.append(temp);
                } else {
                    output = output.append(temp);
                }
            }
        }
        return output.toString();
    }
}