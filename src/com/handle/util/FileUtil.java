package com.handle.util;

import java.io.File;

public class FileUtil {
    public static boolean isExist(String file) {
        return isExist(new File(file));
    }

    public static boolean isExist(File file) {
        return file.exists();
    }
}
