import java.util.*;

class Main {

    public static void main(String[] args) {

          
        // 1. ARRAYLIST
          

        ArrayList<Integer> arrayList = new ArrayList<>();

        // add()
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(10);       // Duplicate allowed

        System.out.println("ArrayList: " + arrayList);

        // get() - access using index
        System.out.println("Element at index 1: "
                           + arrayList.get(1));

        // set() - modify an element
        arrayList.set(1, 100);

        System.out.println("After set(): "
                           + arrayList);

        // contains()
        System.out.println("Contains 20: "
                           + arrayList.contains(20));

        // size()
        System.out.println("ArrayList size: "
                           + arrayList.size());

        // remove()
        arrayList.remove(Integer.valueOf(10));

        System.out.println("After removing 10: "
                           + arrayList);


          
        // 2. LINKEDLIST
          

        LinkedList<Integer> linkedList = new LinkedList<>();

        // add()
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println("\nLinkedList: "
                           + linkedList);

        // addFirst()
        linkedList.addFirst(10);

        // addLast()
        linkedList.addLast(50);

        System.out.println("After adding at ends: "
                           + linkedList);

        // getFirst()
        System.out.println("First element: "
                           + linkedList.getFirst());

        // getLast()
        System.out.println("Last element: "
                           + linkedList.getLast());

        // removeFirst()
        linkedList.removeFirst();

        // removeLast()
        linkedList.removeLast();

        System.out.println("After removing from ends: "
                           + linkedList);


          
        // 3. HASHSET
          

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);       // Duplicate ignored

        System.out.println("\nHashSet: " + hashSet);

        // contains()
        System.out.println("Contains 20: "
                           + hashSet.contains(20));

        // size()
        System.out.println("HashSet size: "
                           + hashSet.size());

        // remove()
        hashSet.remove(10);

        System.out.println("After removing 10: "
                           + hashSet);

        // add() returns false for duplicate
        System.out.println("Adding 20 again: "
                           + hashSet.add(20));

        System.out.println("Adding 50: "
                           + hashSet.add(50));


          
        // 4. TREESET
          

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);       // Duplicate ignored

        // Automatically sorted
        System.out.println("\nTreeSet: "
                           + treeSet);

        // first()
        System.out.println("First: "
                           + treeSet.first());

        // last()
        System.out.println("Last: "
                           + treeSet.last());

        // lower()
        System.out.println("Lower than 30: "
                           + treeSet.lower(30));

        // higher()
        System.out.println("Higher than 30: "
                           + treeSet.higher(30));

        // floor()
        System.out.println("Floor of 25: "
                           + treeSet.floor(25));

        // ceiling()
        System.out.println("Ceiling of 25: "
                           + treeSet.ceiling(25));


          
        // 5. ITERATING THROUGH ALL COLLECTIONS
          

        System.out.println("\nArrayList elements:");

        for (int x : arrayList) {
            System.out.println(x);
        }

        System.out.println("\nLinkedList elements:");

        for (int x : linkedList) {
            System.out.println(x);
        }

        System.out.println("\nHashSet elements:");

        for (int x : hashSet) {
            System.out.println(x);
        }

        System.out.println("\nTreeSet elements:");

        for (int x : treeSet) {
            System.out.println(x);
        }


          
        // 6. ITERATOR
          

        System.out.println("\nUsing Iterator with ArrayList:");

        Iterator<Integer> iterator =
            arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


          
        // 7. SORTING ARRAYLIST
          

        Collections.sort(arrayList);

        System.out.println("\nSorted ArrayList: "
                           + arrayList);

        Collections.reverse(arrayList);

        System.out.println("Reversed ArrayList: "
                           + arrayList);


          
        // 8. CLEAR COLLECTIONS
          

        arrayList.clear();
        linkedList.clear();
        hashSet.clear();
        treeSet.clear();

        System.out.println("\nAfter clear():");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}


public class CollectionFrameworkQuestions {

    public static void main(String[] args) {

          
        // Q1. Create an ArrayList and add elements.
          

        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names);


          
        // Q2. Access and modify an ArrayList element.
          

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers.get(1));

        numbers.set(1, 50);

        System.out.println(numbers);


          
        // Q3. Remove an element from ArrayList.
          

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");

        cities.remove("Mumbai");

        System.out.println(cities);


          
        // Q4. Traverse an ArrayList using for-each.
          

        ArrayList<Integer> marks =
            new ArrayList<>();

        marks.add(90);
        marks.add(85);
        marks.add(95);

        for (int mark : marks) {
            System.out.println(mark);
        }


          
        // Q5. Demonstrate that ArrayList allows duplicates.
          

        ArrayList<Integer> list =
            new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);

        System.out.println(list);


          
        // Q6. Create a LinkedList.
          

        LinkedList<String> fruits =
            new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        fruits.addFirst("Orange");
        fruits.addLast("Grapes");

        System.out.println(fruits);


          
        // Q7. Demonstrate LinkedList as a Queue.
          

        Queue<Integer> queue =
            new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println("Removed: " + queue.poll());

        System.out.println(queue);


          
        // Q8. Create a HashSet and remove duplicates.
          

        HashSet<Integer> set =
            new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);


          
        // Q9. Create a LinkedHashSet to maintain insertion order.
          

        LinkedHashSet<String> languages =
            new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println(languages);


          
        // Q10. Create a TreeSet for sorted unique elements.
          

        TreeSet<Integer> sorted =
            new TreeSet<>();

        sorted.add(50);
        sorted.add(10);
        sorted.add(30);
        sorted.add(20);
        sorted.add(10);

        System.out.println(sorted);


          
        // Q11. Find first and last elements using TreeSet.
          

        TreeSet<Integer> numbersSet =
            new TreeSet<>();

        numbersSet.add(40);
        numbersSet.add(10);
        numbersSet.add(70);
        numbersSet.add(20);

        System.out.println(
            "First: " + numbersSet.first()
        );

        System.out.println(
            "Last: " + numbersSet.last()
        );


          
        // Q12. Create a PriorityQueue.
          

        PriorityQueue<Integer> pq =
            new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(
            "Highest priority: " + pq.peek()
        );

        System.out.println(
            "Removed: " + pq.poll()
        );


          
        // Q13. Create a HashMap.
          

        HashMap<Integer, String> students =
            new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println(students);


          
        // Q14. Access and update values in HashMap.
          

        HashMap<String, Integer> marksMap =
            new HashMap<>();

        marksMap.put("Alice", 90);
        marksMap.put("Bob", 85);

        System.out.println(
            marksMap.get("Alice")
        );

        marksMap.put("Alice", 95);

        System.out.println(marksMap);


          
        // Q15. Demonstrate duplicate keys in HashMap.
          

        HashMap<Integer, String> map =
            new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++");

        System.out.println(map);

        // Key 1 now maps to C++.


          
        // Q16. Traverse HashMap using entrySet().
          

        HashMap<String, Integer> scores =
            new HashMap<>();

        scores.put("A", 90);
        scores.put("B", 80);
        scores.put("C", 95);

        for (Map.Entry<String, Integer> entry :
             scores.entrySet()) {

            System.out.println(
                entry.getKey() + " = " +
                entry.getValue()
            );
        }


          
        // Q17. Create a LinkedHashMap.
          

        LinkedHashMap<Integer, String> linkedMap =
            new LinkedHashMap<>();

        linkedMap.put(3, "C");
        linkedMap.put(1, "A");
        linkedMap.put(2, "B");

        System.out.println(linkedMap);

        // Maintains insertion order.


          
        // Q18. Create a TreeMap for sorted keys.
          

        TreeMap<Integer, String> treeMap =
            new TreeMap<>();

        treeMap.put(30, "C");
        treeMap.put(10, "A");
        treeMap.put(20, "B");

        System.out.println(treeMap);

        // Keys are sorted.


          
        // Q19. Sort an ArrayList using Collections.sort().
          

        ArrayList<Integer> values =
            new ArrayList<>();

        values.add(50);
        values.add(10);
        values.add(30);
        values.add(20);

        Collections.sort(values);

        System.out.println(values);


          
        // Q20. Reverse an ArrayList.
          

        ArrayList<Integer> reverseList =
            new ArrayList<>();

        reverseList.add(10);
        reverseList.add(20);
        reverseList.add(30);

        Collections.reverse(reverseList);

        System.out.println(reverseList);
    }
}