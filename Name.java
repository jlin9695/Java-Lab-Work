package labs;

public class Name {
	public static void main(String[] args) {
		System.out.print("My name is... ");
		if (args.length == 0) {
			System.out.println("unlisted. :(");
		}
		else {
			System.out.println(args[0] + ".");
		}
	}
}