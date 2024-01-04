/**
 * The StringList interface defines a set of operations
 * for an ordered (indexed) collection of Strings, which
 * in mathematics is known as a sequence.
 */
public interface StringList extends Iterable<String> {

    /**
     * Prepends (inserts) the specified element at the front of the list (at index 0).
     * Shifts the element currently at the front of the list (if any) and any
     * subsequent elements to the right.
     * @param element element to be inserted
     * @throws NullPointerException if the element is null
     */
    void addFront(String element);

    /**
     * Appends (inserts) the specified element at the back of the list (at index size()-1).
     * @param element element to be inserted
     * @throws NullPointerException if the element is null
     */
    void addBack(String element);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right.
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     * @throws NullPointerException if the element is null
     */
    void add(int index, String element);

    /**
     * Removes the element located at the front of the list
     * (at index 0), if it is present.
     * Shifts any subsequent elements to the left.
     */
    void removeFront();

    /**
     * Removes the element located at the back of the list
     * (at index size()-1), if it is present.
     */
    void removeBack();

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left. Returns the element
     * that was removed from the list.
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    String remove(int index);

    /**
     * Returns the element at the specified position in the list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    String get(int index);

    /**
     * Returns true if this list contains the specified element.
     * @param element element whose presence in this list is to be searched for
     * @return true if this list contains the specified element
     * @throws NullPointerException if the element is null
     */
    boolean contains(String element);

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this list
     * or -1 if this list does not contain the element
     * @throws NullPointerException if the element is null
     */
    int indexOf(String element);

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    int size();

    /**
     * Removes all the elements from this list.
     * The list will be empty after this call returns.
     */
    void clear();
}
