package q01_basic.question07;

import java.util.List;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		ConsoleReader reader = new ConsoleReader();
		try {
			limit = reader.inputNumber();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する
		numberList.addFromOneTo(limit);
		List<Integer> numbers = numberList.getNumbers();
		System.out.println(numbers);
		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する
		numberList.doubleListEachValue();
		System.out.println(numbers);

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する

		numberList.removeIndexOfFirstHalf();
		System.out.println(numbers);
	}

}
