public class OrderedArray<T extends Comparable<T>> {
    public final static int CAPACITY = 100;

    private T[] orderedArray;
    private int nElems;

    @SuppressWarnings({"unchecked"})
    public OrderedArray() {
        orderedArray = (T[])new Comparable[CAPACITY];
    }

    public void add(T value) {
        int j;

        for (j = 0; j < nElems; j++) {
            if (orderedArray[j].compareTo(value) > 0) {
                break;
            }
        }

        if (j < nElems) {
            for (int k = nElems; k > j; k--) {
                orderedArray[k] = orderedArray[k - 1];
            }
        }

        orderedArray[j] = value;

        nElems++;
    }

    public T remove(T value) {
        int j;

        for (j = 0; j < nElems; j++) {
            if (orderedArray[j].compareTo(value) == 0) {
                break;
            }
        }

        if (j < nElems) {
            T tmp = orderedArray[j];

            for (int k = j; k < (nElems - 1); k++) {
                orderedArray[k] = orderedArray[k + 1];
            }

            nElems--;

            return tmp;
        }
        else {
            return null;
        }
    }

    public T find(T value) {
        int j;

        for (j = 0; j < nElems; j++) {
            if (orderedArray[j].compareTo(value) == 0) {
                break;
            }
        }

        return (j < nElems) ? orderedArray[j] : null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nElems; i++){
            sb.append(String.format("%d ", orderedArray[i]));
        }

        return sb.toString();
    }
}