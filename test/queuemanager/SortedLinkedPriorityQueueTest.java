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
public class SortedLinkedPriorityQueueTest extends PriorityQueueTest {

    public SortedLinkedPriorityQueueTest() {
    }

    @Before
    @Override
    public void setUp() {
        // to initialise the instance
        q = new SortedLinkedPriorityQueue<>();
    }

    /**
     * Test of head method, of class SortedArrayPriorityQueue.
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
//     * Test of add method, of class SortedArrayPriorityQueue.
//     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        // does not work unless initiate object 
        Person person = new Person("sam");
        q.add(person, 1);
        String expResult = "LinkedList , printing(sam, 1)";
        String result = q.toString();
        assertEquals(expResult, result);
    }//end of add

    /**
     * Test of add method with 4items of class SortedArrayPriorityQueue. It will
     * not add because the list has no size.
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
        String expResult = "LinkedList , printing(sonia, 5), (sara, 4), (sam, 3), (sunny, 2)";

       
    } //end of exceeding size 

    /**
     * Test of add 3 items to method and see if they are sorted according to
     * priority in class SortedArrayPriorityQueue.
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
        String expResult = "LinkedList , printing(sonia, 5),(sam, 3),(sunny,2)";
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
//     * Test of toString method, of class SortedArrayPriorityQueue.
//     */
    @Test
    public void testToString() {
        String expResult = "LinkedList , printing";
        String result = q.toString();
        assertEquals(expResult, result);
    }//end of toString

    /**
     * Test of remove method after adding items , of class
     * SortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
//        PriorityQueue instance = new PriorityQueueImpl();
        Person person = new Person("sam");
        q.add(person, 1);
        q.remove();

    }//end of remove

}//end of test

