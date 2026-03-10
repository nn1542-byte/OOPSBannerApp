public class BannerApp_uc5 {
    public static void main(String[] args) {
        // UC5 Approach: Array Initialization with String.join
        String[] banner = {
            String.join("", "**", "**"),
            String.join(" ", "", " ", " ", ""),
            String.join(" ", "", " ", " ", ""),
            String.join("", "**", "**"),
            String.join(" ", "", " ", " ", ""),
            String.join(" ", "", " ", " ", ""),
            String.join("", "**", "**")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}