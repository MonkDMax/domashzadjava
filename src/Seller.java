import java.util.Locale;

public class Seller extends TelephoneChar{
    public void modify() {
        char[] manufacturerChars = this.manufacturer.toCharArray();

        for (int i = 0; i < manufacturerChars.length; i++ ) {
            if(manufacturerChars[i] == 'o'){
                manufacturerChars[i] = 'a';
            }
            if(manufacturerChars[i] == 'O'){
                manufacturerChars[i] = 'A';
            }
        }

        this.manufacturer = String.copyValueOf(manufacturerChars);

        if(manufacturerChars[0] != 'N' && manufacturerChars[0] != 'n'){
            this.manufacturer = this.manufacturer.toLowerCase();
        }
    }
}
