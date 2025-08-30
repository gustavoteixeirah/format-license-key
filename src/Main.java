//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(formatLicenseKey("5F3Z-2e-9-w", 4)); // 5F3Z-2E9W - OK
        System.out.println(formatLicenseKey("2-5g-3-J", 2));    // 2-5G-3J NOT OK
        System.out.println(formatLicenseKey("--a-a-a-a--", 2)); // AA-AA OK
        System.out.println(formatLicenseKey("--", 3));
    }

    static String formatLicenseKey(final String S, final int K) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c == '-') continue;

            if (count == K) {
                sb.append('-');
                count = 0;
            }

            sb.append(Character.toUpperCase(c));
            count++;
        }

        return sb.reverse().toString();
    }

}
