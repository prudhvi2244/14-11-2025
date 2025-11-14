/*

Date:12-11-2025
===================
Topics:
=============
1)Variables
2)Array
3)Collection Framework

Variable:
================
1)A variable is a container that holds data values during the execution of a program.
2)In Java, there are two types of variables: primitive types and reference types.
3)Primitive types include int, char, float, double, boolean, byte, short, and long.
4)Reference variables holds objects
5)Multiple values cannot be stored in a single  variable.

long accountNumber = 1234567890L; // Primitive variable
String customerName = "John Doe"; // Reference variable
Customer customer = new Customer(); // Reference variable holding an object

Array:
================
1)An array is a data structure that can hold multiple values of the same type in a single variable.
2)Array uses index to store and  access its elements.
3)Index starts from 0 to n-1, where n is the size of the array.

Advatages of Array:
======================
1)Arrays allow you to store multiple values in a single variable, making it easier to manage and
 manipulate related data.
2)Arrays provide fast access to elements using their index, allowing for efficient retrieval and
 modification of data. O(1) time complexity for access.
3)Arrays can be used to implement other data structures, such as lists, stacks, and queues,
 providing a foundation for more complex data management.


Disadvantages of Array:
=======================
1)Arrays have a fixed size, meaning that once they are created, their size cannot be changed. This
 can lead to wasted memory if the array is not fully utilized or insufficient space if more 
 elements need to be added.
2)Arrays can only store elements of the same data type, which can limit flexibility when dealing
 with heterogeneous data.
3)Inserting or deleting elements in an array can be inefficient, as it may require shifting
 elements to maintain the array's structure, leading to O(n) time complexity for these operations.


 Collection Framework:
========================
1)The Java Collections Framework is a unified architecture that provides a set of classes and
 interfaces for storing and manipulating groups of objects.
2)It includes various data structures such as lists, sets, maps, and queues, each designed for
 specific use cases and performance characteristics.
3)If we want to represent multiple values of different objects, we can use Collection Framework.
4)Collection framework provides dynamic data structures that can grow and shrink as needed,
 unlike arrays which have a fixed size.

Collection(I):
====================
1)Collection is a root interface in the Java Collections Framework that defines the basic operations
 for working with groups of objects.
2)It is presented in java.util package.
3)Collection interface provides methods for adding, removing, and querying elements in a collection.

Key Interfaces in Collection Framework:
=========================================
1)List
2)Set
3)Map
4)Queue
5)Deque
6)SortedSet
7)SortedMap

List:
====================
1)List is an child interface of Collection
2)List is an ordered collection (also known as a sequence). It maintains the insertion order of
 elements.
3)List allows duplicate elements.
4)null elements are allowed in List.

Implementations of List:
=============================
1)ArrayList
2)LinkedList
3)Vector
4)Stack

ArrayList:
=========================
1)ArrayList is a resizable array implementation of the List interface.
2)child class of List interface.
3)It allows duplicate elements and maintains the insertion order.
4)ArrayList provides fast random access to elements using their index. O(1) time complexity for
  access.
5)ArrayList is not synchronized, which means it is not thread-safe. If multiple threads access
  an ArrayList concurrently, and at least one of the threads modifies the list structurally, it 
  must be synchronized externally.
  
Import MEthods of Collection(I):
=================================
1)public abstract int size(); // returns the number of elements in the collection
2)public abstract boolean isEmpty(); // checks if the collection is empty,returns true if empty
3)public abstract boolean contains(java.lang.Object); // checks if the collection contains the
 specified element, returns true if found
4)public abstract boolean add(E) : Adds the specified element to the end of the collection.
5)public abstract boolean remove(java.lang.Object) // removes the specified element from the
 collection,  returns true if the element was found and removed
6)public abstract void clear(); // removes all elements from the collection


Important Methods of List(I):
=================================
1)public abstract E get(int) : Returns the element at the specified position in the list, if not
 found throws IndexOutOfBoundsException.
2)public abstract E remove(int) : Removes the element at the specified position in the list
 and returns the removed element.
3)public abstract int indexOf(java.lang.Object) : Returns the index of the first occurrence of the
 specified element in the list, or -1 if the element is not found.
4)public abstract int lastIndexOf(java.lang.Object): Returns the index of the last occurrence of the
 specified element in the list, or -1 if the element is not found.
5)public abstract E get(int) : Returns the element at the specified position in the list, if not
 found throws IndexOutOfBoundsException.
6) public abstract E set(int, E) : Replaces the element at the specified position in the list
 with the specified element and returns the element previously at the specified position.
7)public abstract void add(int, E) : Inserts the specified element at the specified position in
 the list. Shifts the element currently at that position (if any) and any subsequent elements to
 the right (adds one to their indices).



Constructors of ArrayList:
==========================
1)public java.util.ArrayList(int) : Creates an empty list with the specified initial capacity.
2)public java.util.ArrayList(): Creates an empty list with an initial capacity of ten.
3)public java.util.ArrayList(java.util.Collection<? extends E>) : Creates a list containing the
 elements of the specified collection, in the order they are returned by the collection's iterator.

* Once ArrayList reaches its capacity, it automatically increases its size by 50% of the current 
  capacity.

  formula:  new capacity = old capacity + (old capacity / 2)

  =>ArrayList is best suited for scenarios where frequent access to elements is required, and the 
  number of  elements is relatively stable.


LinkedList:
=========================
1)It is the child interface of List.
2)LinkedList is a doubly linked list implementation of the List and Deque interfaces.
3)It allows duplicate elements and maintains the insertion order.
4)LinkedList provides better performance for insertions and deletions compared to ArrayList,
 as it does not require shifting elements.
5)LinkedList can be used as a list, stack, or queue due to its implementation of the Deque
 interface.

 constructors of LinkedList:
===========================
1)public java.util.LinkedList(): Creates an empty LinkedList.
2)public java.util.LinkedList(java.util.Collection<? extends E>) : Creates a LinkedList containing the
 elements of the specified collection, in the order they are returned by the collection's iterator.

Important methods of LinkedList:
=================================
1)public E getFirst() : Returns the first element in the list.
2)public E getLast() :  Returns the last element in the list.
3)public E removeFirst(): : Removes and returns the first element from the list.
4)public E removeLast() : Removes and returns the last element from the list.
5)public void addFirst(E):  Inserts the specified element at the beginning of the list.
6)public void addLast(E) :  Appends the specified element to the end of the list.

=>LinkedList is best suited for scenarios where frequent insertions and deletions are required,
 especially at the beginning or end of the list.

 
Vector:
=========================
1)It is the child class of List interface.
2)Vector is a synchronized, resizable array implementation of the List interface.
3)It allows duplicate elements and maintains the insertion order.
4)Vector provides fast random access to elements using their index. O(1) time complexity for
 access.
5)Since Vector is synchronized, it is thread-safe and can be used in multi-threaded environments
 without external synchronization.

constructors of Vector:
===========================
1)public java.util.Vector(): Creates an empty vector with an initial capacity of ten.
2)public java.util.Vector(int) : Creates an empty vector with the specified initial capacity.
3)public java.util.Vector(int, int) : Creates an empty vector with the specified initial capacity
 and capacity increment.
4)public java.util.Vector(java.util.Collection<? extends E>) : Creates a vector containing the
 elements of the specified collection, in the order they are returned by the collection's iterator.

Difference Between ArrayList and Vector:
=============================================
1)ArrayList is introduced in Java 1.2, Vector introduced in java 1.0v
2)ArrayList is not synchronized, whereas Vector is Synchronized


Stack(C):
=================
1)It is the child class of Vector
2)Stack follows LIFO ( Last In First Out Pattern)
3)Stack Implements methods of Vector class.
4))Insertion Order: Bottom [1, 2, 3, 4, 5] Top
5))Removal Order: Top [5, 4, 3, 2, 1] Bottom
6))Insertion Order is Preserved in Stack.
7))Duplicates are allowed in Stack.
8)null elements are allowed in Stack.
9)HEterogeneous objects are allowed in Stack.

Important Methods of Stack:
=========================
1)public E push(E) : Pushes an item onto the top of this stack.
2)public E pop() : Removes and returns the item at the top of this stack.
3)public E peek() : Returns the item at the top of this stack without removing it.
4)public boolean empty() : Checks if the stack is empty, returns true if empty.
5)public int search(java.lang.Object) : Returns the 1-based position of the object from the top
 of the stack, or -1 if the object is not found.


 =>Best suited for scenarios where LIFO behavior is required, such as function call management, 
 expression  evaluation, and backtracking algorithms.


*/
