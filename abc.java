class Output {

	static int s;

	public static void main(String[] args) {

		Output p = new Output();

		p.start();

		System.out.println(s);

	}

	void start() {

		int x = 8;

		twice(x);

		System.out.print(x + " ");

	}

	void twice(int x) {

		x = x * 2;

		s = x;

	}

}