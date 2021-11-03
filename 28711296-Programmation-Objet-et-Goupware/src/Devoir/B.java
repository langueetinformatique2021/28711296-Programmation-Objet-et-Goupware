package Devoir;

/**
 * @author moses
 * @param val
 * @return n/2 divisible par 13, n+2 indivisible
 */

public class B {

	public static int divise(int n) {
		if ((n%13) == 0) return n/2;
		else return n+2;
}
}

