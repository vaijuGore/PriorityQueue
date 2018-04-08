package queuemanager;
/**
 *
 * @author 11012344
 */
/**
 * Implementation of the PriorityQueue ADT using a sorted linked list
 * for storage.
 * @param <T> The type of things being stored.
 */
public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /**
     * The bundled priority item object.
     */
    private ListNode<T> top;
   
    /**
     * Initialise the first item with a null pointer.
     */
    public SortedLinkedPriorityQueue() {
        top = null;
    }

   
    /**
     * Add a new item to the queue.
     *
     * @param item
     * @param priority
     */
     @Override
  /** This is a sorted list , it is important to add items 
   * with highest priority at the top*/
    public void add(T item, int priority) throws QueueOverflowException {
       PriorityItem newPriority = new PriorityItem(item, priority);      
      //declare and initialise a node to store temporarily.
      ListNode<T> current = null ;
       //check and sort priorities depending upon values.
     if (top == null || top.getNode().getPriority() < new ListNode<T>(newPriority,top).getNode().getPriority()) {
        top= new ListNode<>(newPriority,top);
    
      // now if top is not null , top becomes current 
      }  else {   
     
      current =top;
    while (current.next !=null && current.getNode().getPriority() < new ListNode<>(newPriority,top).getNode().getPriority() ){
         current=  current.next;
    }
       current.next =   new ListNode<>(newPriority,current.next);  
   
    }// end of else
    }//end of add method
   
       /**Now the highest priority is at the head 
       * so it is easy to display*/
      @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
          //  return new ListNode<>(newPriority,top).getItem();
            
                return top.getNode().getItem();
            }
        }// end of head
   

    /**
     * Remove the first item with 
     * highest priority from the queue.
     */
    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            top = top.getNext();
        }
    }// end of remove

    /**
     * Check if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }// end of check

    /**
     * Return the contents of the queue.
     * 
     * @return result
     */
    @Override
    public String toString() {
        String result = "LinkedList " ;
        result += ", printing";
        for (ListNode<T> newPriority = top; newPriority != null; newPriority = newPriority.getNext()) {
            if (newPriority != top) {
                result += ", ";
            }
            result += newPriority.getNode();
        }
     /** result += "], isEmpty() = " + isEmpty();
        if (!isEmpty()) {
            result += ", top() = " + top;
        }*/
        return result;
    }// end of tostring
}// end of sorted link