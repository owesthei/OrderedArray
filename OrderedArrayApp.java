public class OrderedArrayApp {
    public static void main(String[] args) {
        System.out.println("Ordered Array App");

        OrderedArray<Integer> orderedArray = new OrderedArray<>();

        orderedArray.add(11);
        orderedArray.add(7);
        orderedArray.add(3);
        orderedArray.add(21);
        orderedArray.add(5);

        orderedArray.remove(7);
        orderedArray.remove(9);

        System.out.println(orderedArray.find(11));
        System.out.println(orderedArray.find(15));

        System.out.println(orderedArray);
    }
}