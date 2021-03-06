/* 
* Created by dan-geabunea on 5/13/2016.
* This code is the property of JLG Consulting. Please
* check the license terms for this product to see under what
* conditions you can use or modify this source code.
*/
package jlg.jade.test.asterix.cat062.item500;

import jlg.jade.asterix.cat062.item500.Cat062Item500Subfield5;
import jlg.jade.test.utils.MandatoryFixedLengthAsterixTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cat062Item500Subfield5Test extends MandatoryFixedLengthAsterixTests<Cat062Item500Subfield5> {
    @Override
    protected int setExpectedItemSizeInBytes() {
        return 1;
    }

    @Override
    protected Cat062Item500Subfield5 setFixedLengthAsterixDataInstance() {
        return new Cat062Item500Subfield5();
    }

    @Test
    public void the_decode_method_should_correctly_decpode_data(){
        //arrange
        byte[] input = {1};
        int offset = 0;
        Cat062Item500Subfield5 subfield5 = new Cat062Item500Subfield5();

        //act
        subfield5.decode(input, offset, input.length);

        //assert
        assertEquals("Subfield not decoded correctly", 1, subfield5.getAccuracyForBarometricAltitude());
    }
}
