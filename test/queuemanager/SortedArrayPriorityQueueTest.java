
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sudhi
 */
public class SortedArrayPriorityQueueTest extends PriorityQueueTest {
    
    public SortedArrayPriorityQueueTest() {
    }
    
  @Before
   @Override
    public void setUp() {
      // to initialise the instance
     q = new SortedArrayPriorityQueue<>(1);  
    }

      /**
     * Test of head method, of class SortedArrayPriorityQueue.
     */
   @Test
    public void testHead() throws Exception {
  Person person = new Person("sam");
                q.add(person, 1);
      String expResult = "[(sam, 1)]";
   
        }

//    /**
//     * Test of add method, of class SortedArrayPriorityQueue.
//     */
    @Test
    public void testAdd() throws Exception {
 System.out.println("add");
 // does not work unless initiate object 
        Person person = new Person("sam");
                q.add(person, 1);
        String expResult = "[(sam, 1)]";
    }

  @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
//        SortedArrayPriorityQueue instance = null;
      
      
       //assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//
//    /**
//     * Test of toString method, of class SortedArrayPriorityQueue.
//     */

 @Test
 public void testToString() {
 
//        System.out.println("toString");
//        SortedArrayPriorityQueue instance = null;
        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
   }
  @Test
  public void testRemove() throws Exception {
       System.out.println("remove");
//        PriorityQueue instance = new PriorityQueueImpl();
           Person person = new Person("sam");
                q.add(person, 1);
                  Person person1 = new Person("san");
                
           q.remove();
         
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
 
 
 
 
}
}


//    