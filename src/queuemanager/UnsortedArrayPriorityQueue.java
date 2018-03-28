package queuemanager;

/**
 *
 * @author 11012344
 */
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {

    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored. This is equal to the item count minus
     * one.
     */
    private int tailIndex;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size Size of the queue.
     */
    UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    /**
     * Searches the queue for the highest priority item and returns it.
     *
     * @return The item with the highest priority.
     * @throws QueueUnderflowException When queue is empty.
     */
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
// highestPriority is set to minimum integer value, because priority can be set to negative values

        int head = 0;
        int headIndex = 0;

        for (int i = 0; i <= tailIndex; i++) {
            //This is to move the highest priority to the top or head

            if (((PriorityItem<T>) storage[i]).getPriority() > head) {
                head = ((PriorityItem<T>) storage[i]).getPriority();
                headIndex = i;
            }//end of if loop
        }//end of for loop

        return ((PriorityItem<T>) storage[headIndex]).getItem();
    }//end of head.

    /**
     * Items are added in order of arrival.This is unsorted array.
     *
     * @param item Name of the person to be added.
     * @param priority Priority of the person in the queue.
     * @throws QueueOverflowException When queue is too small.
     */
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            //no need to look for insertion point, added to the end of the queue.
            storage[tailIndex] = new PriorityItem<>(item, priority);

        }//end of else
    }//end of add

    /**
     * Removes the highest priority item from the queue. If there are two
     * identical highest priority items only the first one added will be
     * removed.
     *
     * @throws QueueUnderflowException When queue is too small.
     */
    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        /**
         * we move the highest priority item to the head before it could be removed.
         */

        for (int i = 0; i <= tailIndex; i++) {
            //This is to move the highest priority to the top or head

            if (((PriorityItem<T>) storage[i]).getItem() == head()) {

                //parameters used (source array,src position,dest,destPos)
                System.arraycopy(storage, i + 1, storage, i, tailIndex - 1);
                tailIndex--;

                //This is required to avoid repetition of removal.
                break;

            }//end of if loop 
        }//end of for loop
    }//endof remove

    /**
     * Checks whether the queue is empty.
     *
     * @return Returns true when queue is empty.
     */
    @Override
    //no change from sorted
    public boolean isEmpty() {
        return tailIndex < 0;
    }//end of empty

    /**
     * Creates a string with the contents of the queue.
     *
     * @return A string with the contents of the queue.
     */
    @Override
    //no change from sorted array
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }//end of toString
}//end of unsorted arrays.

