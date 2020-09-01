package creationalPatterns;

/**
 * Singleton Patter Demo only one instance is created has two types Eagerly and
 * Lazily Loaded.
 * 
 * Static in nature Private Constructor Private Instance Needs to be Thread safe
 * 
 * @author v.marpadge
 *
 */
public class DbSingleton {
	// private constructor
	private DbSingleton() {
	}

	// Eagerly Loaded
	private static DbSingleton instanceEagerly = new DbSingleton();

	public static DbSingleton getInstanceEagerly() {
		return instanceEagerly;
	}

	// Lazily Loaded
	private static DbSingleton instanceLazily = null;

	public static DbSingleton getInstanceLazily() {
		if (instanceLazily == null) {
			instanceLazily = new DbSingleton();
		}
		return instanceLazily;
	}

}
