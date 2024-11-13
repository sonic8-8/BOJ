import java.security.SecureRandom;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[32];  // 256비트 키 (32바이트)
        secureRandom.nextBytes(key);
        String secretKey = Base64.getEncoder().encodeToString(key);

        System.out.println("Generated Secret Key: " + secretKey);
    }
}