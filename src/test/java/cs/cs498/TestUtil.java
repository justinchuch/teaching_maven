package cs.cs498;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Util.
 */
public class TestUtil
{
    @Test
    public void test_instance() {
        Util util = new Util();
        Assert.assertEquals(true, util!=null);
    }

    @Test
    public void test_isStringNull() {
        String str = "abc";
        boolean isStrNull = Util.isStringNull(str);
        Assert.assertEquals(isStrNull, false);

        String str2 = null;
        boolean isStr2Null = Util.isStringNull(str2);
        Assert.assertEquals(isStr2Null, true);
    }

    @Test
    public void test_isEvenNumber() {
        boolean isEven = Util.isEvenNumber(10);
        Assert.assertEquals(true, isEven);

        boolean isEven2 = Util.isEvenNumber(7);
        Assert.assertEquals(false, isEven2);
    }

}
