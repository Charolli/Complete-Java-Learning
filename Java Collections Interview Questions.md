**Java Collections Interview Questions**

**Q. What is Java Collections Framework? List out some benefits of Collections framework?**
![image](https://user-images.githubusercontent.com/52098865/192204912-b0af9744-1dec-4bc3-bfd1-5c76df62dfa7.png)

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. Java Collections can achieve all the operations that we perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

**1. Collection Interface**

Collection interface is at the root of the hierarchy. Collection interface provides all general purpose methods which all collections classes must support (or throw UnsupportedOperationException). It extends Iterable interface which adds support for iterating over collection elements using the “for-each loop” statement.

**2. List**

Lists represents an ordered collection of elements. Using lists, we can access elements by their integer index (position in the list), and search for elements in the list. index start with 0, just like an array.

Some useful classes which implement List interface are – ArrayList, CopyOnWriteArrayList, LinkedList, Stack and Vector.

**3. Set**

Sets represents a collection of sorted elements. Sets do not allow the duplicate elements. Set interface does not provides no guarantee to return the elements in any predictable order; though some Set implementations store elements in their natural ordering and guarantee this order.

Some useful classes which implement Set interface are – ConcurrentSkipListSet, CopyOnWriteArraySet, EnumSet, HashSet, LinkedHashSet and TreeSet.

**4. Map**

The Map interface enable us to store data in key-value pairs (keys should be immutable). A map cannot contain duplicate keys; each key can map to at most one value.

The Map interface provides three collection views, which allow a map’s contents to be viewed as a set of keys, collection of values, or set of key-value mappings. Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not.

Some useful classes which implement Map interface are – ConcurrentHashMap, ConcurrentSkipListMap, EnumMap, HashMap, Hashtable, IdentityHashMap, LinkedHashMap, Properties, TreeMap and WeakHashMap.

**5. Stack**

The Java Stack interface represents a classical stack data structure, where elements can be pushed to last-in-first-out (LIFO) stack of objects. In Stack we push an element to the top of the stack, and popped off from the top of the stack again later.

**6. Queue
**
A queue data structure is intended to hold the elements (put by producer threads) prior to processing by consumer thread(s). Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.

Some useful classes which implement Map interface are – ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedDeque, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, LinkedList, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue and SynchronousQueue.

**7. Deque**

A double ended queue (pronounced “deck“) that supports element insertion and removal at both ends. When a deque is used as a queue, FIFO (First-In-First-Out) behavior results. When a deque is used as a stack, LIFO (Last-In-First-Out) behavior results.

**Q. What is difference between Array and ArrayList?**
**1. Size**: Array in Java is fixed in size. We can not change the size of array after creating it. ArrayList is dynamic in size. When we add elements to an ArrayList, its capacity increases automatically.

**2. Performance**: In Java Array and ArrayList give different performance for different operations.

add() or get(): Adding an element to or retrieving an element from an array or ArrayList object has similar performance. These are constant time operations.

resize(): Automatic resize of ArrayList slows down the performance. ArrayList is internally backed by an Array. In resize() a temporary array is used to copy elements from old array to new array.

**3. Primitives**: Array can contain both primitive data types as well as objects. But ArrayList can not contain primitive data types. It contains only objects.

**4. Iterator**: In an ArrayList we use an Iterator object to traverse the elements. We use for loop for iterating elements in an array.

**5. Type Safety**: Java helps in ensuring Type Safety of elements in an ArrayList by using Generics. An Array can contain objects of same type of classe. If we try to store a different data type object in an Array then it throws ArrayStoreException.

**6. Length**: Size of ArrayList can be obtained by using size() method. Every array object has length variable that is same as the length/size of the array.

**7. Adding elements**: In an ArrayList we can use add() method to add objects. In an Array assignment operator is used for adding elements.

**8. Multi-dimension**: An Array can be multi-dimensional. An ArrayList is always of single dimension

// A Java program to demonstrate differences between array 
// and ArrayList 
import java.util.ArrayList; 
import java.util.Arrays; 
  
class Test 
{ 
    public static void main(String args[]) { 
        /* ........... Normal Array............. */
        int[] arr = new int[2]; 
        arr[0] = 10; 
        arr[1] = 20; 
        System.out.println(arr[0]); 
  
        /*............ArrayList..............*/
        // Create an arrayList with initial capacity 2 
        ArrayList<Integer> arrL = new ArrayList<Integer>(2); 
  
        // Add elements to ArrayList 
        arrL.add(30); 
        arrL.add(40); 
  
        // Access elements of ArrayList 
        System.out.println(arrL.get(0)); 
    } 
} 
Output

10
30

