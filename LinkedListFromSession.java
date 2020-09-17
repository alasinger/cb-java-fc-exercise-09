package at.femaletrack.linkedlist;


public class LinkedListFromSession {
    private StringElement head; // head of list

    public LinkedList() {
        //TODO
    }

    public LinkedList(StringElement head) {
        this.head = head;
    }

    /**
     * Inserts a node at a given position
     *
     * @param index (starts with 0)
     */
    public void add(int index, String val) {
        //TODO index = 0 (new head)
        StringElement current = head;
        int currentIndex = 0;
        while (current.getNext() != null && currentIndex < (index - 1)) {
            current = current.getNext();
            currentIndex++;
        }
        StringElement elementToAdd = new StringElement(val);
        elementToAdd.setNext(current.getNext());
        current.setNext(elementToAdd);
    }

    /**
     * Inserts a node at the end of the list
     *
     * @param val
     */
    public void append(String val) {
        //TODO add element if head is still empty
        StringElement current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        StringElement toAppend = new StringElement(val);
        current.setNext(toAppend);
    }

    public void printAll() {
        StringElement current = head;
        do {
            System.out.println(current.getValue());
            current = current.getNext();
        } while (current != null);
    }


    /**
     * Removes all nodes from the list with given String val
     *
     * @param val
     * @return Returns true (at least one node deleted) or false (no node deleted).
     */
    public boolean remove(String val) {
        StringElement current = head;
        StringElement beforeCurrent = null;
        boolean found = false;
        do {
            if (val.equals(current.getValue())) { //match found

                //add new link
                if (beforeCurrent == null) {
                    //head
                    this.head = current.getNext();
                } else {
                    //any other node than head
                    beforeCurrent.setNext(current.getNext());
                }
                found = true;
            } else { //no match found
                beforeCurrent = current;
            }
            current = current.getNext();
        } while (current != null);
        return found;
    }


    /**
     * Removes a node at position index from the list
     *
     * @param index
     * @return Returns true (at least one node deleted) or false (no node deleted).
     */
//    public boolean remove(int index) {
//        //TODO
//    }

    /**
     * Returns the size of the Linked List
     *
     * @return The size of the list
     */
    public int size() {
        StringElement current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }

    /**
     * Returns the String at position index
     *
     * @param index
     * @return The String or null if out of bounds
     */
    public String get(int index) {
        if (index >= size()) {
            return null;
        }
        StringElement current = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            currentIndex++;
            current = current.getNext();
        }
        return current.getValue();
    }

    /**
     * Returns the first occurence of val in the list
     *
     * @param val
     * @return The index or -1 if string cannot be found
     */
//    public int indexOf(String val) {
//        //TODO
//    }
}
