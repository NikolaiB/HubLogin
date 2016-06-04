package od.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.lang.reflect.UndeclaredThrowableException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Random;

import static ch.lambdaj.Lambda.convert;

public class AuthorizationPage extends PageObject {

    /************************    Generation Time Base Code for Login, used generateTOTP(KeyIn) ************************/

    private static final int PASS_CODE_LENGTH = 6;
    private static final String CRYPTO = "HmacSHA1";
    private static final int SECRET_SIZE = 10;
    private static final Random RAND = new Random();
    private String tbc = "JBSWY3DPEHPK3PXP";

    public String generateTOTP(String keyIn)
    {
        String key = base32toHex( keyIn );
        byte[] msg = hexStr2Bytes(getCurrentTimeInterval(0));
        byte[] k = hexStr2Bytes(key);
        byte[] hash = hmacSha( CRYPTO, k, msg );
        int offset = hash[hash.length - 1] & 0xf;

        int binary =
                ((hash[offset] & 0x7f) << 24) |
                        ((hash[offset + 1] & 0xff) << 16) |
                        ((hash[offset + 2] & 0xff) << 8) |
                        (hash[offset + 3] & 0xff);

        int otp = binary % 1000000;
        String result = Integer.toString(otp);
        while (result.length() < PASS_CODE_LENGTH)
        {
            result = "0" + result;
        }
        return result;
    }
    public boolean checkCode(String secret, String code)
    {
        try
        {
            String secretKeyInHex = base32toHex( secret );
            for (int i = -3; i <= 3; ++i)
            {
                String currentInterval = getCurrentTimeInterval(i);
                String hash = generateTOTP(secretKeyInHex);
                if (hash.equals(code))
                {
                    return true;
                }
            }
        }
        catch (Exception e)
        {
//            LOGGER.error( "Exception on CheckCode", e );
        }
        return false;
    }
    private static byte[] hmacSha( String crypto, byte[] keyBytes, byte[] text )
    {
        try
        {
            Mac hmac;
            hmac = Mac.getInstance(crypto);
            SecretKeySpec macKey = new SecretKeySpec(keyBytes, "RAW");
            hmac.init(macKey);
            return hmac.doFinal(text);
        }
        catch (GeneralSecurityException gse)
        {
            throw new UndeclaredThrowableException(gse);
        }
    }
    private static byte[] hexStr2Bytes(String hex)
    {
        byte[] bArray = new BigInteger("10" + hex, 16).toByteArray();
        byte[] ret = new byte[bArray.length - 1];
        System.arraycopy( bArray, 1, ret, 0, ret.length );
        return ret;
    }
    public String base32toHex( String base32 )
    {
        String base32chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567";
        StringBuilder stringBuffer = new StringBuilder();
        String hex = "";

        for (int i = 0; i < base32.length(); i++)
        {
            int val = base32chars.indexOf(base32.charAt(i));
            stringBuffer.append( leftpad(Integer.toBinaryString(val)) );
        }
        String bits = stringBuffer.toString();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i+4 <= bits.length(); i+=4)
        {
            String chunk = bits.substring(i, i+4);
            int parsed = Integer.parseInt(chunk, 2);
            String hexString=Integer.toHexString(parsed);
            builder.append( hexString );
        }
        hex = String.valueOf( builder );
        return hex;
    }
    private String leftpad(String str)
    {
        int length = str.length();
        String strLocal = str;

        for (int i=0; i<5-length; i++)
        {
            strLocal="0"+strLocal;
        }
        return strLocal;
    }
    public String getCurrentTimeInterval(int t0)
    {
        long currentTimeSeconds = System.currentTimeMillis() / 1000;

        long x = 30;
        String timeSteps = "0";
        try
        {
            long t = (currentTimeSeconds + (t0*x))/x;
            timeSteps = Long.toHexString(t).toUpperCase();
            while (timeSteps.length() < 16)
            {
                timeSteps = "0" + timeSteps;
            }
        }
        catch (final Exception e)
        {
//            LOGGER.error( "Exception on getCurrentTimeInterval", e );
        }

        return timeSteps;
    }

    /************************ END CLASS Generation Time Base Code use generateTOTP(KeyIn) ************************/

    @FindBy(name = "email")
    public WebElementFacade pageLoginFieldEmail;

    @FindBy(name = "password")
    public WebElementFacade pageLoginFieldPassword;

    @FindBy(name = "timeBaseCode")
    public WebElementFacade pageLoginFieldTimeBaseCode;

    @FindBy(xpath = "*//input[@class=\"b-btn b-btn_blue b-btn_full-width\"]")
    public WebElementFacade pageLoginButtonSignIn;

    @FindBy(name = "rememberMe")
    public WebElementFacade pageLoginCheckboxRememberMe;

    @FindBy(linkText = "Register")
    public WebElementFacade pageLoginLinkRegister;

    @FindBy(linkText = "Account Recovery")
    public WebElementFacade pageLoginLinkAccountRecovery;

    public void checkRememberMe(){
        pageLoginCheckboxRememberMe.click();
    }

    public void fillFieldEmail(String email) {
        pageLoginFieldEmail.type(email);
    }

    public void fillFieldPassword(String password) {
        pageLoginFieldPassword.type(password);
    }

    public void generateFieldTimeBaseCode() {
        pageLoginFieldTimeBaseCode.type(generateTOTP(tbc));
    }

    public void fillFieldTimeBaseCode(String timeBaseCode) {
        pageLoginFieldTimeBaseCode.type(timeBaseCode);
    }

    public void clickLogin() {
        pageLoginButtonSignIn.click();
    }

    public void loginInTheHub(String email, String password){
        pageLoginFieldEmail.type(email);
        pageLoginFieldPassword.type(password);
        clickLogin();
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }

    public List<String> getHeaders() {
        WebElementFacade HeadersList = find(By.tagName("div"));
        List<WebElement> results = HeadersList.findElements(By.tagName("h3"));
        return convert(results, toStrings());
    }

    public List<String> getLinks() {
        WebElementFacade LinksList = find(By.tagName("div"));
        List<WebElement> results = LinksList.findElements(By.tagName("a"));
        return convert(results, toStrings());
    }

    public List<String> getLabels(){
        WebElementFacade LabelsList = find(By.tagName("div"));
        List<WebElement> results = LabelsList.findElements(By.tagName("label"));
        return convert(results, toStrings());
    }
}
