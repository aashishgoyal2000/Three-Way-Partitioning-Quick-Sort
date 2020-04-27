class Client{
	public static void main(String[] args) {
		Integer[] temp1 = {new Integer(1), new Integer(1), new Integer(8), new Integer(8),new Integer(100), new Integer(1), new Integer(100), new Integer(100)};
		ThreeWayPartitioning.sort(temp1);
		for (int i = 0; i < temp1.length; i++) {
			System.out.println(Integer.parseInt(temp1[i]));
		}
	}
}