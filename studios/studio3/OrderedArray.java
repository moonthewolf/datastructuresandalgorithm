package studio3;

public class OrderedArray<T extends Comparable<T>> implements PriorityQueue<T> {

	public T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
	public OrderedArray(int maxSize) {
		array = (T[]) new Comparable[maxSize];
		size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		//
		// FIXME
		//
		return array.length == 0;
	}

	@Override
	public void insert(T thing) {
		//
		// FIXME
		//
		int i=0;
		while((i < size) && (thing.compareTo(array[i]) > 0)) {
		i++;
		}

			swap(i);
			array[i] = thing;
			size++;
		
	}
	
	public void swap(int i) {
		for (int j = size; j > i; j--) {
			array[j] = array[j-1];
		}
	}
	
	public void swap2 (int i) {
		for (int j = 0; j < size; j++) {
			array[j] = array[j+1];
		}
	}
	
	
	@Override
	public T extractMin() {
		//
		// FIXME
		//
		T min = array[0];
		swap2(0);
		size--;
		return min;	
	}

}
