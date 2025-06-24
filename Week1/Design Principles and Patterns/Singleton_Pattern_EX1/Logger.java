public class Logger {

    // Step 2: Private static instance of Logger
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Step 2: Public static method to get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Lazy initialization
        }
        return instance;
    }

    // A sample logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
