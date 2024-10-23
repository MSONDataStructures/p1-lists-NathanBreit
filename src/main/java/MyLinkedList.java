/**
 * The MyLinkedList class is the implementation of a singly-linked list of
 * integers.
 * <p>
 * The data in the list will be stored in <code>Node</code> objects, with
 * each node storing one integer and a link to the next node in the list.
 * Our <code>MyLinkedList</code> will implement many of the same methods
 * as the <code>MyArrayList</code> class, but here the <code>add</code>
 * method with one parameter becomes the <code>addFirst</code> method;
 * instead of adding to the end of the list, it adds to the front.
 * <p>
 * Students should not, again, use the <code>java.util.LinkedList</code>
 * Java library class. Due to the nature of the Java garbage collector,
 * attention must be paid to the order used for certain operations. You
 * need to "hold on" to anything you do not want to lose with an object
 * reference, and only overwrite a reference if you no longer need the
 * object that it is referencing.
 * <p>
 * You may, of course, wish to add additional instance fields and private
 * methods, but please do not modify public interface. Again, remember to
 * avoid the <code>IndexOutOfBoundsException</code> and throw the
 * <code>NullPointerException</code> where noted.
 */
public class MyLinkedList
{
    /**
     * The Node class is a private inner class of the <code>MyLinkedList</code>
     * class. Since none of the methods of <code>MyLinkedList</code> will return
     * a node, it is safe to make the instance fields here public.
     * If you prefer, you may replace this with a separate top-level class.
     * Also, you can build a constructor or use the default constructor.
     */
    private static class Node
    {
        // These fields both default to null.
        public Integer value;
        public Node next;
    }

    private Node first;

    /**
     * Constructs an empty list.
     */
    public MyLinkedList() {
        first = null;
        // TODO: you can add code here
    }

    /**
     * Appends the specified Integer to the beginning of the list.
     * @param item Integer to be appended to this list
     * @throws NullPointerException if item is null
     */
    public void addFirst(Integer item) {
        // TODO: your code goes here
    }

    /**
     * Inserts the specified Integer at the specified position in this list.
     * Shifts the element currently in that position (if any) and any subsequent
     * elements to the right (adding one to their indices).
     * @param index index at which the specified Integer is to be inserted
     * @param item Integer to be inserted
     * @throws NullPointerException if item is null
     */
    public void add(int index, Integer item) {
        // TODO: your code goes here
    }

    /**
     * Removes the Integer at the specified position in this list. Shifts any
     * subsequent Integers to the left (subtracts one from their indices).
     * @param index the index of the Integer to remove
     * @return the Integer that was removed from the list
     */
    public Integer remove(int index) {
        // TODO: modify the code here
        return null;
    }

    /**
     * Returns the Integer at the specified position in this list.
     * @param index index of the element to return
     * @return the Integer at the specified position in this list
     */
    public Integer get(int index) {
        // TODO: modify the code here
        return null;
    }

    /**
     * Replaces the Integer at the specified position in this list with the
     * specified Integer.
     * @param index index of the integer to replace
     * @param item Integer to be stored at the specified position
     * @throws NullPointerException if item is null
     */
    public void set(int index, Integer item) {
        // TODO: your code goes here
    }

    /**
     * Returns the number of Integers in this list.
     * @return the number of Integers in this list
     */
    public int size() {
        // TODO: modify the code here
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified Integer in this list,
     * or -1 if this list does not contain the Integer.
     * @param item Integer to search for
     * @return the index of the first occurrence of the specified Integer in this list,
     * or -1 if this list does not contain the Integer
     * @throws NullPointerException if item is null
     */
    public int indexOf(Integer item) {
        // TODO: modify the code here
        return 0;
    }

    /**
     * Returns <code>true</code> if this list contains the specified Integer.
     * @param item Integer whose presence in this list is to be tested
     * @return true if this list contains the specified Integer
     * @throws NullPointerException if item is null
     */
    public boolean contains(Integer item) {
        // TODO: modify the code here
        return false;
    }

    /**
     * Removes all the elements from this list. The list will be empty after this
     * call returns.
     */
    public void clear() {
        // TODO: your code goes here
    }

    /**
     * Returns <code>true</code> if this list has no elements.
     * @return true if this list is empty
     */
    public boolean isEmpty() {
        // TODO: modify the code here
        return false;
    }

}
