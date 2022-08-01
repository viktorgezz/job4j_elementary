package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.codePointAt(0) < 97 || name.codePointAt(0) > 127) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if ((code < 97 || code > 127) && (code < 47 || code > 57) && (code != 36) && (code != 95)) {
                return false;
            }
        }
        return true;
    }
}
