import java.util.NoSuchElementException;

public class ch_16_07
{
    /* Write a method called deleteBack that deletes the last value (the value at the back of the list) and returns the
    deleted value. If the list is empty, throw a NoSuchElementException. */

    public static void main(String[] args)
    {
        LinkedIntList LL = new LinkedIntList();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);

        deleteBack(LL);
    }
    public static int deleteBack(LinkedIntList list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        int container = 0;
        container = list.get(list.size() - 1);
        list.remove(list.size()-1);
        System.out.println(container);
        return container;

    }
}
