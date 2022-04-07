package com.bridgelabz;

/**
 * import file class
 */

import java.io.File;

/**
 * create a class name as FilesUtils
 */
public class FilesUtils {
    /**
     * creating a boolean type method name as deleteFiles, its output is true or false type
     * @param contentToDelete in file
     * @return delete content
     */
    public static boolean deleteFiles(File contentToDelete) {
        File[] allContents = contentToDelete.listFiles();
        if (allContents != null) {
            for (File eachFile : allContents) {
                deleteFiles(eachFile);
            }
        }
        return contentToDelete.delete();
    }
}
