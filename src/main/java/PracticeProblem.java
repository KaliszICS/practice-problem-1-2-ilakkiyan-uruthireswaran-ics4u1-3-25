public class PracticeProblem {

	public static boolean validIndex(int[] arr, int num) {
		int x = num;
			try {
				if (arr[x] == arr[x]) {			
					return true;
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Number is not in the array");
			}
			return false;
		}
		
	public static int divide(int x, int y) {
		try {
			return x / y;
		}
		catch (ArithmeticException e) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch (Exception e) {
			return 0;
		}

		
	}
	

	public static void main(String args[]) {
		int[] listNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		boolean result = validIndex(listNum, 100);
		System.out.println(result);

		int result2 = divide(2, 2);
		System.out.println(result2);

		int resul3 = safeConvertStringtoInt("d");
		System.out.println(resul3);
	}

	

}
