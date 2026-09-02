import java.util.*;

class Main {

    public static void main(String[] args) {

        // ==========================================
        // 1. ARRAYLIST
        // ==========================================

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


        // ==========================================
        // 2. LINKEDLIST
        // ==========================================

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


        // ==========================================
        // 3. HASHSET
        // ==========================================

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


        // ==========================================
        // 4. TREESET
        // ==========================================

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


        // ==========================================
        // 5. ITERATING THROUGH ALL COLLECTIONS
        // ==========================================

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


        // ==========================================
        // 6. ITERATOR
        // ==========================================

        System.out.println("\nUsing Iterator with ArrayList:");

        Iterator<Integer> iterator =
            arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // ==========================================
        // 7. SORTING ARRAYLIST
        // ==========================================

        Collections.sort(arrayList);

        System.out.println("\nSorted ArrayList: "
                           + arrayList);

        Collections.reverse(arrayList);

        System.out.println("Reversed ArrayList: "
                           + arrayList);


        // ==========================================
        // 8. CLEAR COLLECTIONS
        // ==========================================

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