public class BannerApp_uc6 {
    public static void main(String[] args) {
        // UC6: Use static helper methods to populate the array
        String[] banner = new String[7];
        
        for (int i = 0; i < 7; i++) {
            // Invoking methods to build each line
            banner[i] = getO(i) + " " + getO(i) + " " + getP(i) + " " + getS(i);
        }

        // Loop-based rendering system
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static helper methods for character patterns
    public static String getO(int row) {
        String[] pattern = {" * ", "* ", " ", " ", " ", " ", " ** "};
        return pattern[row];
    }

    public static String getP(int row) {
        String[] pattern = {"** ", "* ", " ", "* ", "* ", "* ", "* "};
        return pattern[row];
    }

    public static String getS(int row) {
        String[] pattern = {" ** ", "* ", "* ", " * ", "    * ", "    * ", "** "};
        return pattern[row];
    }
}