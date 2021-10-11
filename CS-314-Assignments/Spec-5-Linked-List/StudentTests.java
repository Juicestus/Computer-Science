public class StudentTests {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.addFirst(3);
        System.out.println(list.toString());

        list.insert(3, 5);
        System.out.println(list.toString());

        System.out.println(list.set(3, 6));
        System.out.println(list.toString());

        System.out.println(list.get(2));
    }
}
