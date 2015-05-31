import org.apache.commons.codec.digest.DigestUtils;
 
public class Auth {
	public static void main(String[] args) {
		System.out.println("SHA-256 = " + DigestUtils.sha256Hex("abc"));
	}
}
