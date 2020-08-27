package datastructures.linear;

public class ArrayList {

	int[] al;
	int capacity = 0;

	public ArrayList() {
		al = new int[1];
	}

	public ArrayList(int val) {
		al = new int[val];
	}

	public void add(int val) {
		if (capacity == al.length) {

			int[] localArray = new int[2 * al.length];
			for (int i = 0; i < al.length; i++) {
				localArray[i] = al[i];
			}
			localArray[al.length] = val;
			al = localArray;
			capacity++;
		}

		else {
			
			al[capacity] = val;
			capacity++;

		}

	}

	public int get(int index) {
		if (index < 0 || index > al.length - 1) {
			throw new IndexOutOfBoundsException();
		}
		return al[index];
	}

	public void printArray(ArrayList ref) {
		int k = 0;
		while (k < capacity) {
			System.out.println(ref.get(k));
			k++;
		}
	}

	public static void main(String[] args) {
		// add remove get set
		ArrayList myAl = new ArrayList(4);
		myAl.add(6);
		myAl.add(3);
		myAl.add(2);
		myAl.add(6);
		myAl.add(3);
		myAl.add(2);
		myAl.add(6);
		myAl.add(3);
		myAl.add(2);
		myAl.add(6);
		myAl.add(3);
		myAl.add(2);
		myAl.printArray(myAl);
	}

}
