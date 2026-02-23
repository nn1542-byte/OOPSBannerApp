public class BannerApp {
    public static void main(String[] args) {
        // 1. Define the banner lines in an array
        String[] banner = {
            "#######################",
            "#                     #",
            "#  WELCOME TO OOPS    #",
            "#     BANNER APP      #",
            "#                     #",
            "#######################"
        };

        // 2. Use an ENHANCED FOR-LOOP to print each line
        // This makes the code scalable—if the array grows, the loop stays the same.
        for (String line : banner) {
            System.out.println(line);
        }
        
        // Optional: Using String.join() as mentioned in your assignment docs
        // String fullBanner = String.join("\n", banner);
        // System.out.println(fullBanner);
    }
}