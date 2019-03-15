package pluralsight_java8;

import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {

    public static void main(String[] arg){
        FileFilter oldFileFilter = getOldFileFilter();
        System.out.println("Using OldWay");
        filterFiles(oldFileFilter);

        FileFilter newFileFilter = getNewFileFilter();
        System.out.println("Using Java8 lambda Way");
        filterFiles(newFileFilter);
    }

    private static FileFilter getOldFileFilter() {
        return new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };
    }

    private static FileFilter getNewFileFilter() {
        return (File pathName) -> pathName.getName().endsWith(".java");
    }

    private static void filterFiles(FileFilter fileFilter) {
        File dir = new File("D:/tmp");
        File[] files = dir.listFiles(fileFilter);

        for (File f: files){
            System.out.println(f);
        }
    }
}
