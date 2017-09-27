package cs.cs498;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestApp
{
    @Test
    public void test_instance() {
        App app = new App();
        Assert.assertEquals(true, app!=null);
    }

    @Test
    public void test_main() {
        App.main(new String[] {});
        Assert.assertEquals(true, true);
    }

}
