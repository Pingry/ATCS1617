# Vector Assignment

A Vector is a data structure that manages an array and has a dynamic size. Build a Vector class that contains the following variables and methods:

	//Storage array
	private Object [] data;
	
	//How many items the vector can currently hold (OPTIONAL)
	private int capacity;
	
	//How many items are in the vector
	private int size;
	
	//Default length 10
	public Vector()
	
	public Vector(int initCapacity)
	
	//Copy constructor [O (n)]
	public Vector(Vector<E> other)
	
	//Add item to the first available space in the Vector (ie, the end) //[O(1)]
	public void add(E toAdd)
	
	//Add item to the specified spot and shift the other items down
	//Precondition: index <= size
	//[O(n)]
	public void add(int index, E toAdd)
	
	//Double the capacity of the vector [O(n)]
	private void increaseCapacity()
	
	//Return item at specified index [O(1)]
	public E get(int index)
	
	//Remove and return item at specified index
	//Shift the other items down [O(n)]
	public E remove(int index)
	
	//Remove first instance of specified object [O(n)]
	public boolean remove(E obj)
	
	//Place object at specified location [O(1)]
	//Precondition: index < size`
	public E set(int index, E obj)
	
	//Return the number of items in the vector [O(1)]
	public int size()
	
	//Remove all items from the vector
	//[O(1) or O[n] depending on implementation
	public void clear()
	
	//Return whether or not the vector is empty [O(1)]
	public boolean isEmpty()
	
	//Return whether or not the vector contains specified object [O(n)]
	public boolean contains(E obj)
	
	//Return index of the first instance of specified object [O(n)]
	public int indexOf(E obj)
	
	//How the vector will be displayed once printed [O(n)]
	public String toString()
	
	//Create and return an iterator
	public Iterator<E> iterator()

*For those methods that require a type cast from type Object to type E, you can use @SuppressWarnings("unchecked") before the method to ignore the unsafe operations warning.

Note - You will probably need a private method called grow to facilitate the increase in capacity.
## Generics
Your Vector should have a generic type, E. You can read more about generics here: [https://docs.oracle.com/javase/tutorial/java/generics/why.html][1]

## Iterable and Iterator
Your Vector needs to implement the Iterable interface. To do that, you’ll need to not only look at the Iterable API, but also understand how Iterators work: [http://www.tutorialspoint.com/java/java\_using\_iterator.htm][2]
You will need to build a VectorIterator class.  

## Error Handling
For each method, you need to determine any pre and post conditions. From there, you need to make sure your program acts properly. This will require using Error and Exception handling. 

[http://www.tutorialspoint.com/java/java\_exceptions.htm][3]

## Questions to Consider
1. Why can you not have an array of type E?
2. Explain the difference between Errors and Exceptions. 
3. What’s the value in having a copy contractor?
4. What would the run-times of your various methods be? How does initial capacity impact run time?

[1]:	https://docs.oracle.com/javase/tutorial/java/generics/why.html
[2]:	http://www.tutorialspoint.com/java/java_using_iterator.htm
[3]:	http://www.tutorialspoint.com/java/java_exceptions.htm