public class BannerApp_uc3 {
    public static void printBanner() {
        System.out.println("=== OOPS BANNER - UC3 ===");
        System.out.println("Using String.join() Method\n");
        
        String line1 = String.join(" ", "O", "O", "P", "P", "S", "S");
        String line2 = String.join(" ", "O", "O", "P", "P", "S");
        String line3 = String.join(" ", "O", "O", "P", "P", "S", "S");
        String line4 = String.join(" ", "O", "", "P", "", "S");
        String line5 = String.join(" ", "O", "", "P", "", "S", "S");
        
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
    
    public static String createBannerLine(String... characters) {
        return String.join(" ", characters);
    }

    public static void demonstrateDifference() {
        System.out.println("\n=== COMPARISON: UC2 vs UC3 ===\n");
        System.out.println("UC2 (Using + operator):");
        String uc2Line = "O" + " " + "O" + " " + "P" + " " + "S";
        System.out.println(uc2Line);
        System.out.println("→ Creates multiple intermediate String objects\n");
        System.out.println("UC3 (Using String.join()):");
        String uc3Line = String.join(" ", "O", "O", "P", "S");
        System.out.println(uc3Line);
        System.out.println("→ Uses StringBuilder internally - more efficient!");
    }
    public static void main(String[] args) {
        printBanner();
        demonstrateDifference();
        
        System.out.println("\n=== USING REUSABLE METHOD ===");
        System.out.println(createBannerLine("O", "O", "P", "P", "S", "S"));
        System.out.println(createBannerLine("O", "O", "P", "P", "S"));
    }
}
