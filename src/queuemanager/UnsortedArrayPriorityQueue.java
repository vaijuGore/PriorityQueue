package queuemanager;

/**
 *
 * @author sudhi
 * @param <T>
 */
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    /**
     * Where the data is actually stored.
     */
    private final Object[] storage1;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;
    private int priority;
    private int i;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnsortedArrayPriorityQueue (int size) {
        storage1 = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    @Override
    public T head() throws QueueUnderflowException {
      if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
             int i = tailIndex;
            while (i > 0 && ((PriorityItem<T>) storage1[i - 1]).getPriority() < priority) {
                storage1[i] = storage1[i - 1];
                i = i - 1;
            
            //storage1[i] = new PriorityItem<>(item, priority);
   
            
            tailIndex = tailIndex - 1;
        
            
            }
    }return ((PriorityItem<T>) storage1[0]).getItem();
    } 
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else
           
        
        storage1[tailIndex] = new PriorityItem<>(item, priority);
        }
    

    public boolean isEmpty(){
        return tailIndex < 0;
    }

   
    public void remove() throws QueueUnderflowException {
     if (isEmpty())  {throw new UnsupportedOperationException("Not supported yet.");} //To change body of generated methods, choose Tools | Templates.
     else{
     int i = tailIndex;
            while (i > 0 && ((PriorityItem<T>) storage1[i - 1]).getPriority() < priority) {
                storage1[i] = storage1[i - 1];
                i = i - 1;
            }
            //storage1[i] = new PriorityItem<>(item, priority);
   
            }
            tailIndex = tailIndex - 1;
        }

    public UnsortedArrayPriorityQueue(Object[] storage1, int capacity) {
        this.storage1 = storage1;
        this.capacity = capacity;
    }

    
    



  
    

 @Override
    public String toString() {
        String result = "[";
for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage1[i];
        }
        result = result + "]";
        return result;
    }

   
}

