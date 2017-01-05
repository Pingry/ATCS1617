# Priority Queues and Huffman Code
For this project, you will build a PriorityQueue data structure that is based on a Heap. Then you will use that PriorityQueue in your implementation of the HuffmanCode compression algorithm.

## Priority Queue
	public interface PriorityQueue<E extends Comparable<E>>
	{
	void enqueue(E value, int priority);
	E dequeue();
	E peek();
	int peekPriority();
	boolean isEmpty();
	int size();
	void clear();
	}
	
	public class PQItem<E extends Comparable> implements Comparable<PQItem>
	{
	private E item;
	private int priority;
	
	//Constructors, Modifiers, Accessors
	
	}

Your class, HeapPriorityQueue, should do the following:
- Implement PriorityQueue.
- Have a single private variable reference to an array of type PQItem\<E\>
- enqueue must run in O(log n)
- dequeue must run in O(log n)


## Huffman Code

### Introduction

In this lab, you will be designing a program that generates Huffman Code. When done properly, Huffman coding finds the minimum length bit string which can be used to encode a string of symbols.

Watch this video to have a clearer understanding of how Huffman Coding works [https://www.youtube.com/watch?v=ZdooBTdW5bM][1]

### General Algorithm
•	Figure out how many times each character occurs in your input string. Store this information somewhere (perhaps a HashMap?).  

•	Create a HuffmanNode for each letter and place it into a Priority Queue (the nodes with the highest priority should be the ones whose characters occur the fewest number of times)  

•	Take the first 2 nodes off the Priority Queue, make a new HuffmanNode with those 2 elements as children, and add the new HuffmanNode to the Priority Queue  

•	Repeat until the Priority Queue contains only one HuffmanNode  

•	Traverse through the HuffmanTree to find the code that represents your original phrase  

### Necessary Classes
*Note: This is not necessarily a complete list.*

HuffmanNode: The HuffmanNode should behave like a normal TreeNode (e.g. have a left and right pointer), except that instead of containing an Object, it will contain both a Character (named value) and an int (named count). Each should have an accessor and a modifier. Since you will be placing these HuffmanNodes into a PriorityQueue, they will also have to be Comparable. This comparison should be based on the value of the int. If the value is the same, the comparison should return equal (0). 

HuffmanTree: This class should contain a root pointer and a constructor that takes in the string value used to generate the tree. 

HuffmanTree should also contain whatever variables and methods are necessary to actually build the tree. Think carefully about your design and break the process into methods whenever possible. You will likely need an encode and a decode method.

You will also need a method to print the tree in some logical way. You may also want to consider coding in an IDE such as BlueJ which will allow you to easily visualize your data structures.

Huffman Runner: This class will contain a main method that tests your Huffman Code implementation. Could have an option for file input where a text file gets passed to the HuffmanTree.

PriorityQueue: Your heap-based implementation of PriorityQueue.  


[1]:	[https://www.youtube.com/watch?v=ZdooBTdW5bM]