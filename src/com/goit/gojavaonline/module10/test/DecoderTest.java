package com.goit.gojavaonline.module10.test;

import com.goit.gojavaonline.module10.Decoder;
import junit.framework.Assert;
import org.junit.Test;


public class DecoderTest {

    @Test (timeout = 1000)
    public void testDecoder() throws Exception {
        final String waitingResult = "Test text for Encrypted";
        final String textForDecoder = "N_mn\u001An_rn\u001A`il\u001A?h]lsjn_^";
        Assert.assertEquals(waitingResult, new Decoder().decoder(textForDecoder));
    }
}