package com.handle.util;

public class StringUil {

    public static boolean isNull(String str) {
        if (str == null || str.matches("^\\s.*$")) {
            return true;
        }
        return false;
    }

}
