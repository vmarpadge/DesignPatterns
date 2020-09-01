package creationalPatterns;

public class DbSingletonDemo {
	public static void main(String[] args) {
		// Eagerly Loading
		System.out.println("Instances are called Eagerly");
		DbSingleton singletonInstanceEagerly = DbSingleton.getInstanceEagerly();
		System.out.println(singletonInstanceEagerly);

		DbSingleton testInstanceEagerly = DbSingleton.getInstanceEagerly();
		System.out.println(testInstanceEagerly);

		System.out.println("Instances are called Lazily");
		// Lazily Loading
		DbSingleton singleInstanceLazily = DbSingleton.getInstanceLazily();
		System.out.println(singleInstanceLazily);

		DbSingleton testInstanceLazily = DbSingleton.getInstanceLazily();
		System.out.println(testInstanceLazily);

	}

}
