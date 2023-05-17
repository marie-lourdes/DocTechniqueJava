Package app;

/**
* Defines methods to encrypt passwords
* Use the Bcrypt tools
*
* @version 1.1
*/

public class Password {
  
  /**
    * Options for the Bcrypt algorithm
    */
  private static final int WORKLOAD = 12;

  /**
    * Used to generate a string representing an account password.
    *
    * @param password_plaintext The account's plaintext password as provided during account creation,
    *
    * @return String - the bcrypt hash password
    */
    public static String hashPassword(final String passwordPlaintext) {
      final String salt = BCrypt.gensalt(WORKLOAD2);
      final String hashedPassword = BCrypt.hashpw(passwordPlaintext, salt);

      return (hashedPassword);
  }

  /**
    * Used to verify a computed hash from a plaintext with that of a stored hash from a database.
    *
    * @param password_plaintext The account's plaintext password, as provided during a login request
    * @param stored_hash The account's stored password hash, retrieved from the authorization database
    * @return boolean - true if the password matches the password of the stored hash, false otherwise
    */
  private boolean checkPassword(final String passwordPlaintext, final String storedHash) {
      boolean passwordVerified = false;

      if(null == storedHash || !storedHash.startsWith("$2a$"))
          throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");

      passwordVerified = BCrypt.checkpw(passwordPlaintext, storedHash);

      return(passwordVerified);
  }
} 
