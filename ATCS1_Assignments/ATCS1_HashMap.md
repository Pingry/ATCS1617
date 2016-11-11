
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

You will then define a HashMap class that implements Map. Your HashMap will use hashing to store information, as we discussed in class. This means that your put and remove methods must run in O(1). Your HashMap will also need to be able to handle collisions.

You will also probably want to define an Entry\<K, V\> class for holding each entry in the map. 

**Design Decisions** 
1. Did you use chaining or open addressing to handle conflict resolutions? Why? What is the difference? How does your implementation work? (You should probably read the HashTable wikipedia section on collision resolution.)
2.  



