/**
 * Author@11012344
 */
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public abstract class PriorityQueueTest {

    /**
     * This is to instantiate 
    * Person
     */
    public PriorityQueue<Person> q;

    public PriorityQueueTest() {
    }

    @Before
    public abstract void setUp();

    /**
     * This is to say that Priority Queue is empty
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");

        boolean expResult = true;
        boolean result = q.isEmpty();
      assertEquals(expResult, result);
  
    } // end of is empty test 

    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");

        Object expResult = null;
        Object result = q.head();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }//end of head

    /**
     * Test of add method, of class PriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = null;
        int priority = 0;
        // need to cast parameters to Person
        q.add((Person) item, priority);
        String expResult = "[(null,0)]";
        String result = q.toString();
        // To compare actual and expected result.
        assertEquals(expResult, result);
    }//end of add

    /**
     * Test of add 3 priority items, of class PriorityQueue. note the number
     * does not exceed limit Test will pass
     */
    @Test
    public void testAdd3() throws Exception {
        System.out.println("add");
        Object item = null;
        int priority = 0;
        // need to cast parameters to Person
        q.add((Person) item, priority);
        String expResult = "[(null,0)]";
        String result = q.toString();
        // To compare actual and expected result.
        assertEquals(expResult, result);
    }//end of add3

    /**
     * Test to add 4 priority items, of class PriorityQueue. note the number
     * exceeds limit so Test will not pass
     */
    @Test
    public void testAdd4() throws Exception {
        System.out.println("add");
        Object item = null;
        int priority = 0;
        // need to cast parameters to Person
        q.add((Person) item, priority);
        String expResult = "[(null,0)]";
        String result = q.toString();
        // To compare actual and expected result.
        assertEquals(expResult, result);
    }//end of add4

    /**
     * Test of remove method, of class PriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");

        q.remove();
    }//nd of remove

    /**
     * Test of toString method, of class PriorityQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
//        PriorityQueue instance = new PriorityQueueImpl();
        String expResult = "";
        String result = q.toString();
        assertEquals(expResult, result);

    }//end of string

}
