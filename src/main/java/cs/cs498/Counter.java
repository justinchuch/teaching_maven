package cs.cs498;

/**
 * Counter
 *
 */
public class Counter
{
    private int count;

    public Counter() {
      this.count = 0;
    }

    public void add(int num) {
      this.count = this.count + num;
    }

    public void minus(int num) {
      this.count = this.count - num;
    }

    public int getCount() {
      return this.count;
    }

}
