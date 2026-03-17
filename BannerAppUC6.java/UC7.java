
public class UC7 {

    static class CharacterPatternMap {

        // Instance variables
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

       
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

   
    public static CharacterPatternMap getCharacterPattern(char ch) {

        switch (ch) {

            case 'O':
                return new CharacterPatternMap('O', new String[]{
                        " *** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " *** "
                });

            case 'P':
                return new CharacterPatternMap('P', new String[]{
                        "** ",
                        "*     *",
                        "*     *",
                        "** ",
                        "*      ",
                        "*      ",
                        "*      "
                });

            case 'S':
                return new CharacterPatternMap('S', new String[]{
                        " *** ",
                        "*     *",
                        "*      ",
                        " *** ",
                        "      *",
                        "*     *",
                        " *** "
                });

            default:
                return null;
        }
    }

    /**
     * Method to display banner text
     * @param text Word to print in banner format
     */
    public static void printBanner(String text) {

        CharacterPatternMap[] patterns = new CharacterPatternMap[text.length()];

        // Populate array with pattern objects
        for (int i = 0; i < text.length(); i++) {
            patterns[i] = getCharacterPattern(text.charAt(i));
        }

        // Print banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                sb.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(sb);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC7");
        System.out.println();

        printBanner("OOPS");
    }
}