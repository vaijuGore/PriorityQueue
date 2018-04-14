package queuemanager;

import static java.awt.geom.Path2D.contains;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11012344
 */
public class UnsortedArrayPriorityQueueTest extends PriorityQueueTest {

    public UnsortedArrayPriorityQueueTest() {
    }

    @Before
    @Override
    public void setUp() {
        // to initialise the instance
        q = new  UnsortedArrayPriorityQueue<>(3);
    }

    /**
     * Test of head method, of class unSortedArrayPriorityQueue.
     * Move the highest priority item to the head
     */
    @Test
    public void testHead() throws Exception {
        Person person = new Person("sam");
        q.add(person, 1);
        String expResult = "sam";
        String result = q.head().getName();
        assertEquals(expResult, result);
    }//end of head

//    /**
//     * Test of add method, of class unSortedArrayPriorityQueue.
//     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        // does not work unless initiate object 
        Person person = new Person("sam");
        q.add(person, 1);
        String expResult = "[(sam, 1)]";
        String result = q.toString();
        assertEquals(expResult, result);
    }//end of add

    /**
     * Test of add method with 4items of class SortedArrayPriorityQueue. It will
     * not add more than specified size and will fail.
     */
    @Test
    public void testAdd4() throws Exception {
        System.out.println("add");
        // does not work unless initiate object 
        Person person = new Person("sam");
        q.add(person, 3);
        Person person1 = new Person("sunny");
        q.add(person1, 2);
        Person person2 = new Person("sonia");
        q.add(person, 5);
        Person person3 = new Person("sara");
        q.add(person3, 4);
        String result = q.toString();
        System.out.println("add4" + result);
        String expResult = "[(sonia, 5), (sara, 4), (sam, 3), (sunny, 2)]";

        assertEquals(expResult, result);
    } //end of exceeding size 

    /**
     * Test of add 3 items to method , they are unsorted according to
     * priority in class unSortedArrayPriorityQueue.
     */
    @Test
    public void testAdd3() throws Exception {
        System.out.println("add");
        // does not work unless initiate object 
        Person person = new Person("sam");
        q.add(person, 3);
        Person person1 = new Person("sunny");
        q.add(person1, 2);
        Person person2 = new Person("sonia");
        q.add(person, 5);
        String result = q.toString();
        System.out.println("Sorted in priority order" + result);
        String expResult = "[(sonia, 5), (sara, 4), (sam, 3)]";
    } //end of add 3

    /**
     * Test of isEmpty method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");

        boolean expResult = true;
        boolean result = q.isEmpty();
        assertEquals(expResult, result);

    }//end of test is empty

//
//    /**
//     * Test of toString method, of class unSortedArrayPriorityQueue.
//     */
    @Test
    public void testToString() {
        String expResult = "[]";
        String result = q.toString();
        assertEquals(expResult, result);
    }//end of toString

    /**
     * Test of remove method after moving highest priority items , of class
     * unSortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");

        Person person = new Person("sam");
        q.add(person, 1);
        q.head().toString();
       
       // q =(PriorityItem<T>) storage[i]).getItem();
         q.remove();
      
       
        
      

    }//end of remove

}//end of test

