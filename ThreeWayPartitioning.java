class ThreeWayPartitioning {
	public static void sort (Comparable[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	public static void sort (Comparable[] arr, int lo, int hi) {
		if (lo >= hi) return;
		int i = lo, j = hi;
		Comparable v = arr[lo];
		int lt = lo, gt = hi;
		while (i <= gt) {
			int cmp = arr[i].compareTo(v);
			if (cmp < 0) exch(arr, lt++, i++);
			else if (cmp > 0) exch(arr, i, gt--);
			else i++;
		}
		sort(arr, lo, lt - 1);
		sort(arr, gt + 1, hi);
		
	}

	public static void exch (Comparable[] arr, int a, int b) {
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}