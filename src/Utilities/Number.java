package Utilities;

import java.util.regex.Pattern;

public class Number {
    private static Pattern numberPattern = Pattern.compile("[-+]?\\d*\\.?\\d+");

    public static boolean isNumeric(String s) {
        return s != null && numberPattern.matcher(s).find();
    }
}
