package studio3;

import java.util.LinkedList;
import java.util.List;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public LinkedList<T> list;
	
	public UnorderedList() {
		list = new LinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		//
		// FIXME
		//
		return list.size() == 0;
	}

	@Override
	public void insert(T thing) {
		//
		// FIXME
		//
		list.add(thing);
	}

	@Override
	public T extractMin() {
		//
		// FIXME
		//
		T min = list.get(0);
		for(int i=0; i < list.size(); i++) {
			if(min.compareTo(list.get(i))> 0){
				min = list.get(i);
			}
			
		}
		list.remove(min);
		return min;
	}

}
