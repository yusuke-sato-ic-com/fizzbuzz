package fizzBuzz;

public class FizzBuzz {

	/**
	 * 整数が3の倍数の時にFizz、5の倍数の時にBuzz、
	 * 両倍数の時にFizzBuzzの文字列を出力する。
	 *
	 * @param value 整数
	 * @return 文字列
	 */

	public static void main(String[] args){
//	public static void printer(){

		for(int value = 1; value < 101; value++) {

			if("FizzBuzz".equals(toFizzBuzz(value))){
				System.out.println(toFizzBuzz(value));

			}else if("Fizz".equals(toFizz(value))){
				System.out.println(toFizz(value));

			}else if("Buzz".equals(toBuzz(value))){
				System.out.println(toBuzz(value));

			}else {
				System.out.println(value);

			}
		}
	}

	// 整数が3の倍数の時にFizz返す
	public static String toFizzBuzz(int value){
		if(value % 3 == 0 && value % 5 == 0){
			return "FizzBuzz";
		}else{
			return Integer.toString(value);
		}
	}

	// 5の倍数の時にBuzzを返す
	public static String toFizz(int value){
		if(value % 3 == 0){
			return "Fizz";
		}else{
			return Integer.toString(value);
		}
	}

	// 3,5の両倍数の時にFizzBuzzの文字列を返す
	public static String toBuzz(int value){
		if(value % 5 == 0){
			return "Buzz";
		}else{
			return Integer.toString(value);
		}
	}

}
