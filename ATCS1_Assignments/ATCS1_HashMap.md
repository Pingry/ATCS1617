
*HashMap*

For this project, you will be creating a HashMap. This structure will perform lookups (much like a dictionary in Python) using hashing. First, you will define a Map\<K, V\> interface as follows:

boolean containsKey(Object key)

boolean containsValue(Object value)

V get(Object key)

boolean isEmpty()

Set\<K\> keySet()

V put(K key, V value)

void putAll(Map\<? extends K, ? extends V\> m)

V remove(Object key)

int size()

Vector\<V\> values()

You will then define a HashMap class that implements Map. Your HashMap will use hashing to store information, as we discussed in class. This means that your put and remove methods must run in O(1). Your HashMap project will also need: 

- To handle collisions using one of the conflict resolutions (linear probing, chaining) we went over in class.
- A separate Set\<E\> class that ensures that elements in a list are unique. You can accomplish this simply by extending LinkedList or Vector (explain your choice!) and overriding the add(obj) method. If obj is already in the list, don’t add it. Ideally set would return a boolean that represents whether or not the add actually happened, but that’s not possible based on our implementations of LinkedList and Vector. To fix this, you can change your implementation of LinkedList or Vector so that add(obj) returns a boolean if the list has been changed.
- A way of storing a key-value pairing. I would recommend defining an Entry\<K, V\> class for holding each entry in the map. 
- A constructor that initializes capacity and load factor to default values and a constructor that sets those variables based on parameters.

**Design Decisions** 
1. Did you use chaining or open addressing to handle conflict resolutions? Why? What is the difference? How does your implementation work? (You should probably read the HashTable wikipedia section on collision resolution.)
2.  Take a look at the following on Stack Overflow: [http://stackoverflow.com/questions/857420/what-are-the-reasons-why-map-getobject-key-is-not-fully-generic][1]Why does the HashMap specification sometimes use object and not a generic type?
3. 




[1]:	http://stackoverflow.com/questions/857420/what-are-the-reasons-why-map-getobject-key-is-not-fully-generic