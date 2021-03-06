/* 
* Created by dan-geabunea on 5/26/2016.
* This code is the property of JLG Consulting. Please
* check the license terms for this product to see under what
* conditions you can use or modify this source code.
*/
package jlg.jade.test.asterix.cat065;

import jlg.jade.asterix.cat065.Cat065Item050;
import jlg.jade.test.utils.MandatoryFixedLengthAsterixTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cat065Item050Test extends MandatoryFixedLengthAsterixTests<Cat065Item050> {
    @Override
    protected int setExpectedItemSizeInBytes() {
        return 1;
    }

    @Override
    protected Cat065Item050 setFixedLengthAsterixDataInstance() {
        return new Cat065Item050();
    }

    @Test
    public void the_decode_method_should_correctly_decode_data(){
        //arrange
        byte[] input = {3};
        int offset = 0;
        Cat065Item050 item050 = new Cat065Item050();

        //act
        item050.decode(input, offset, input.length);

        //assert
        assertEquals("Item not decoded correclty", 3, item050.getReport());
    }
}
