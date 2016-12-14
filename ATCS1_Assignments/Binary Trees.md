# Binary Trees

A Binary Tree is a data structure that contains some piece of generic data as well as a pointer to a left Binary Tree and a right Binary Tree. For this project, you will be building a Binary Tree class, and then testing it by building a simple game and another structure, both of which utilize Binary Tree. First, build a BinaryTree class that contains the following variables and methods:

	protected E value;
	protected BinaryTree<E> left;
	protected BinaryTree<E> right;
	
	public BinaryTree(E v, BinaryTree<E> l, BinaryTree<E> r)
	
	//Set value equal to v, left and right are null
	public BinaryTree(E v)
	
	//Value, left, and right are all null
	public BinaryTree()
	
	Accessors:
	public BinaryTree<E> left()
	public BinaryTree<E> right()
	public E value()
	
	Modifiers:
	public void setLeft(BinaryTree<E> node)
	public void setRight(BinaryTree<E> node)
	public void setValue(E val)
	
	//Return true if node does not have any children
	public boolean isLeaf()
	
	//Return number of descendants of node, including current node
	public int size()
	
	Iterators:
	public Iterator<E> iterator()
	public Iterator<E> preorderIterator()
	public Iterator<E> inorderIterator()
	public Iterator<E> postorderIterator()
	
	public String toString()
	
	//Return the maximum path length to a descendent
	public int height()
	
	//Return true if adding a node to tree would increase its height
	public boolean isFull()
	
	//Return true if tree has minimal height and any holes in the tree //appear in the last level to the right
	public boolean isComplete()
	
	//Return true if the difference of heights of subtrees at every node //is no greater than one
	public boolean isBalanced()

Some questions you will need to be able to answer:
1. What is the difference between pre, post, and in - order iteration of a Binary Tree?
2. What is a full tree? Complete? Balanced?
3. What is the difference between the height and the depth of a Binary Tree? The implementation above only includes height. How might you implement depth? What challenges do you face?

## Test 1: The 20-questions Game

### Introduction
The game of 20 questions is pretty simple: you keep asking yes or no questions about an item and try to eventually guess what it is. By the rules of the game, you get to ask 20 questions to try and narrow down your guess.
 
For this lab, you will be making your own version of this game using Binary Trees. Your implementation will have a couple important differences though: it will handle more than 20 questions and it will learn as it goes.
 
### What to Do
The process works like this: you will need a Binary Tree where the value of each node contains a question and the branches represent the answer to that question. For example: if the question is “Is it a plant?” then all the nodes to the right represent the line of questioning if it is indeed a plant, while all the nodes to the left represent the questions for if it is not a plant.
 
Your algorithm to code the game should look like this:
1. Look at the current node (which will be the root node to start)

2. If the current node is not a leaf node

3. Output the question

4. Get an answer from the user

5. If the answer is yes, move to the current node’s right branch

6. If the answer is no, move to the current node’s left branch

7. If the current node is a leaf node

8. Use that node as your guess

9. If you’re wrong, ask the user to tell you what they were thinking and to enter a question that you could have asked that would have differentiated your guess from the actual answer. Update the tree accordingly.

10. If you’re correct, taunt the user

11. Repeat!


### Optional Add-Ons
- A reset option to clear all data from the game.
- A way for the game to remember what data it has even after it has been closed. To do this you’re probably going to need to use file input and output. Use a helper .txt file to store and retrieve your information. (Hint – you might want to consider traversals when deciding how to store your information.)
- A way for the tree to self-balance. (Note - this can get pretty complicated. Take a look at Red-Black trees, for example.)

## Test 2: Binary Search Tree

Design a BinarySearchTree\<E extends Comparable\> class that maintains the rules of a Binary Search Tree, as discussed in class. (An internet search will give you plenty of information if you need a quick refresher.) You could make your BST extend a BinaryTree, or simply contain a single BinaryTree reference called root. You should be able to add items to your binary tree and output it in using all 3 Binary Tree traversals.

Methods:

- Constructor

- [Optional] Copy Constructor //Great way to test your code

- boolean add(E item)

- [Optional] boolean remove(E item)

- //Returns reference to item in tree. Null if not in tree.
	E find(E item) 


