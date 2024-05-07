package orishop.util;

public class InputSanitizer {
	// Method to sanitize input by removing potential CRLF characters
    public static String sanitizeInput(String input) {
        if (input == null) {
            return null;
        }
        // Replace both \r and \n with an empty string
        return input.replaceAll("[\\r\\n]", "");
    }

    // Method to sanitize input by removing non-alphanumeric characters
    public static String sanitizeNonAlphaNumeric(String input) {
        if (input == null) {
            return null;
        }
        // Replace all non-alphanumeric characters with an empty string
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }
    
    // Method to sanitize cookie value to remove potential CRLF characters
    public static String sanitizeCookieValue(String value) {
        if (value == null) {
            return null;
        }
        // Replace both \r and \n with an empty string
        return value.replaceAll("[\\r\\n]", "");
    }
}
