package logical.statement;

public class Compare {

	public static void main(String[] args) {
		int value1 = 20;
		int value2 = 20;
		int value3 = 200;
		if(value1>value2) {
			System.out.println(value1 + " is bigger than " + value2);
		}else if(value1<value2){
			System.out.println(value2 + " is bigger than " + value1);
		}else if(value1==value2){
			System.out.println(value2 + " is equals to " + value1);
		}

	}

}
