package com.goit.gojavaonline.module10.test;

import com.goit.gojavaonline.module10.FileReader;
import junit.framework.Assert;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;





public class FileReaderTest {

    @Test (timeout = 1000) //(expected = FileNotFoundException.class)
    public void testFileReader() throws Exception {
        final String test = "Test message";
        File file = new File("test.txt");

        try {

            String result = new FileReader().fileReader(file);
            Assert.assertEquals(test, result);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found" + e);
        }
    }

    @Test (expected = Exception.class)
    public void testFileReaderException() throws FileNotFoundException {
        File file = new File("te.txt");

        new FileReader().fileReader(file);

    }
}