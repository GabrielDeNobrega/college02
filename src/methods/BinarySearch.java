package methods;

public class BinarySearch {

	public int binarySearch(int v[], int goalNumber) {

		int size = v.length;
		int vStarts = 0;
		int vEnds = size;
		int middle;

		while (vStarts <= vEnds) {

			middle = (vStarts + vEnds) / 2;

			if (goalNumber == v[middle]) {

				return middle;

			} else if (goalNumber < v[middle]) {

				vEnds = middle - 1;

			} else {

				vStarts = middle + 1;
			}

		}

		return -1;

	}

}
