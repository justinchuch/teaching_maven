package cs.cs498;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CounterTester
{
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 { 1, 1, 0 }, { 2, 1, 1 }, { 1, 2, -1 },
           });
    }

    private int input1;
    private int input2;
    private int expectedValue;

    public CounterTester(int input1, int input2, int expectedValue) {
      this.input1 = input1;
      this.input2 = input2;
      this.expectedValue = expectedValue;
    }

    @Test
    public void test() {
        Counter counter = new Counter();
        counter.add(this.input1);
        counter.minus(this.input2);
        Assert.assertEquals(this.expectedValue, counter.getCount());
    }

}
