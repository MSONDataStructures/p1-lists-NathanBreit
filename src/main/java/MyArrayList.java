import java.util.Arrays;
/**
 * The MyArrayList class is the implementation of an array list of integers.
 * <p>
 * The data in the list will be stored in an array, and the basic
 * <code>ArrayList</code> methods <code>add</code>, <code>remove</code>,
 * <code>set</code>, <code>get</code>, and <code>size</code> will be
 * implemented, as well as the additional methods <code>indexOf</code>,
 * <code>contains</code>, <code>clear</code>, and <code>isEmpty</code>.
 * <p>
 * Students should not, obviously, use the <code>java.util.ArrayList</code>
 * Java library class. The choices that you make regarding the management
 * of the list array will influence how the methods are implemented. You
 * may add any additional instance fields as desired. The choice that has
 * been made for you is that the default constructor should give an initial
 * capacity of ten elements. Be sure to avoid the <code>IndexOutOfBoundsException</code>,
 * and you will need to throw the <code>NullPointerException</code> in places
 * as specified in the Javadoc and the JUnit <code>MyArrayListTest</code> class.
 */
public class MyArrayList {
    private Integer[] list;
    private int size = 0;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        list = new Integer[10];
        // TODO: you can add code here
    }

    /**
     * Appends the specified Integer to the <b>end</b> of the list.
     *
     * @param item Integer to be appended to this list
     * @throws NullPointerException if item is null
     */
    public void addLast(Integer item) {
        /*if (item == null) {
            throw NullPointerException;
        }*/
        // sizeIncrease increases list length if necessary
        list = sizeIncrease();
        // appends item to list
        list[size] = item;
        size += 1;
    }

    /**
     * Inserts the specified Integer at the specified position in this list.
     * Shifts the element currently in that position (if any) and any subsequent
     * elements to the right (adding one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param item  Integer to be inserted
     * @throws NullPointerException if item is null
     */
    public void add(int index, Integer item) {
        // TODO: your code goes here
    }

    /**
     * Removes the Integer at the specified position in this list. Shifts any
     * subsequent Integers to the left (subtracts one from their indices).
     *
     * @param index the index of the element to remove
     * @return the element that was removed from the list
     */
    public Integer remove(int index) {
        // TODO: modify the code here
        return null;
    }

    /**
     * Returns the Integer at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the Integer at the specified position in this list
     */
    public Integer get(int index) {
        // TODO: modify the code here
        if (index < 0 && index >= size) return null;
        return list[index];
    }

    /**
     * Replaces the Integer at the specified position in this list with the
     * specified Integer.
     *
     * @param index index of the integer to replace
     * @param item  Integer to be stored at the specified position
     * @throws NullPointerException if item is null
     */
    public void set(int index, Integer item) {
        // TODO: your code goes here
    }

    /**
     * Returns the number of Integers in this list.
     *
     * @return the number of Integers in this list
     */
    public int size() {
        // TODO: modify the code here
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified Integer
     * in this list, or -1 if this list does not contain the Integer.
     *
     * @param item Integer to search for
     * @return the index of the first occurrence of the specified Integer
     * in this list, or -1 if this list does not contain the Integer
     * @throws NullPointerException if item is null
     */
    public int indexOf(Integer item) {
        // TODO: modify the code here
        return 0;
    }

    /**
     * Returns <code>true</code> if this list contains the specified Integer.
     *
     * @param item Integer whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * @throws NullPointerException if item is null
     */
    public boolean contains(Integer item) {
        // TODO: modify the code here
        return false;
    }

    /**
     * Removes all the elements from this list.
     *
     * @post the capacity of the array should not change
     */
    public void clear() {
        // TODO: your code goes here
    }

    /**
     * Returns <code>true</code> if this list has no elements.
     *
     * @return true if this list is empty
     */
    public boolean isEmpty() {
        // TODO: modify the code here
        return false;
    }

    private Integer[] sizeIncrease() {
        if (size != list.length) return list;

        Integer[] ret = new Integer[list.length * 2];
        for (int i = 0; i < list.length; i++) {
            ret[i] = list[i];
        }
        return ret;
    }
    private void printList() {
        System.out.printf("printing... ");
        int i = 0;
        while (list[i] != null) {
            System.out.printf("%d, ", list[i]);
            i++;
        }
        System.out.println();
    }
}
