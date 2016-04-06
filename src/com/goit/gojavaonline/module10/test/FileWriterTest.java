package com.goit.gojavaonline.module10.test;

import com.goit.gojavaonline.module10.FileReader;
import com.goit.gojavaonline.module10.FileWriter;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;



public class FileWriterTest {

    @Test (timeout = 1000)
    public void testFileWriter() throws Exception {
        final String test = "Test message";
        FileWriter writer = new FileWriter();
        FileReader reader = new FileReader();
        File file = writer.fileWriter(test);
        final String result = reader.fileReader(file);

        Assert.assertEquals(test, result);
    }
}