package com.goit.gojavaonline.module10.test;

import com.goit.gojavaonline.module10.Scrambler;
import junit.framework.Assert;
import org.junit.Test;


public class ScramblerTest {

    @Test (timeout = 1000)
    public void testScrambler() throws Exception {

            final String textForEncrypted = "Test text for Encrypted";
            final String waitingResult = "N_mn\u001An_rn\u001A`il\u001A?h]lsjn_^";
            Assert.assertEquals(waitingResult, new Scrambler().scrambler(textForEncrypted));
        }
}
