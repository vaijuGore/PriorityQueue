package queuemanager;
/**
 *
 * @author 11012344
 */
/**
 * Implementation of the PriorityQueue ADT using a unsorted linked list
 * for storage.
  * @param <T> The type of things being stored.
 */
public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /**
     * The bundled priority item object.
     */
    private ListNode<T> top;
    /**
     * Initialise the first item with a null pointer.
     */
    public UnsortedLinkedPriorityQueue() {
        top = null;
    }

     /**
     * Add a new item to the queue.
     *
     * @param item
     * @param priority
     */
    @Override
   //items are added as entered.
    public void add(T item, int priority) throws QueueOverflowException {
       PriorityItem newPriority = new PriorityItem(item, priority);
       top = new ListNode<>(newPriority,top);
 }
 
    /**This is to display the first item , 
     * item with the highest priority from unsorted list.*/
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }   
        ListNode<T> newPriority = top;
        //Now for loop is used to sort according to priorities.
        for (ListNode<T> node1= top; node1 != null; node1 = node1.getNext()) {
            int currentnodePriority =node1.getNode().getPriority();
                    int newPriorityPriority= newPriority.getNode().getPriority();
            if (currentnodePriority>newPriorityPriority) {
             newPriority = node1;
            }
          
        }return newPriority.getNode().getItem();
    }
 
   //https://stackoverflow.com/questions/10117739/removing-an-item-from-a-priority-queue-based-on-a-linked-list
    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        ListNode<T> current = top;
        ListNode<T> previous = top.next;
        ListNode<T> highestPriority = top;
        if (current.getNode().getItem() == head()) {
            top = top.next;
            return;
        } else {
            while (current != null && current.getNode().getItem() != head()) {
                previous = current;
                current = current.next;
            }
            previous.setNext(current.getNext());
            return;
        }// end of else
    }//end of remove
        
    
  /**
     * Check if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }// end of is empty 

   
    /**
     * Return the contents of the queue.
     * 
     * @return result
     */
    @Override
    public String toString() {
        String result = "LinkedList: size = " ;
        result += ", contents = [";
        for (ListNode<T> newPriority = top; newPriority != null; newPriority = newPriority.getNext()) {
            if (newPriority != top) {
                result += ", ";
            }
            result += newPriority.getNode();
        }
      /**  result += "], isEmpty() = " + isEmpty();
        if (!isEmpty()) {
            result += ", top() = " + top;
        }*/
        return result;
    }
}//end of unsorted list.