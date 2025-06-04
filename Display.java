//redo of display class because mine stopped working after four of the same letter

public class Display {
    private static String secretPhrase = "hello world im lexi";
    private static String[] currentStructure;

    public static void initStructure() {
        currentStructure = new String[secretPhrase.length()];
        for (int i = 0; i < secretPhrase.length(); i++) {
            if (secretPhrase.substring(i, i + 1).equals(" ")) {
                currentStructure[i] = " ";
            } else {
                currentStructure[i] = "_";
            }
        }
    }

    public static String getSecretPhrase() {
        return secretPhrase;
    }

    public static String getCurrentStructure() {
        String display = "";
        for (int i = 0; i < currentStructure.length; i++) {
            display += currentStructure[i] + " ";
        }
        return display;
    }

    public static boolean modifyStructure(String guess) {
        boolean found = false;

        for (int i = 0; i < secretPhrase.length(); i++) {
            if (secretPhrase.substring(i, i + 1).equals(guess)) {
                currentStructure[i] = guess;
                found = true;
            }
        }

        return found;
    }

    public static boolean isComplete() {
        for (int i = 0; i < currentStructure.length; i++) {
            if (currentStructure[i].equals("_")) {
                return false;
            }
        }

        return true;
    }
}

/*
 * public class Display {
 * // generatePhrase();
 * private static String secretPhrase = "hello world im lexi";
 * private static String currentStructure;
 * 
 * public static String getSecretPhrase() {
 * return secretPhrase;
 * }
 * 
 * public static String displayStructure() {
 * String structure = "";
 * int a = secretPhrase.indexOf(" ");
 * if (a != -1) {
 * int i;
 * for (i = 0; i < a; i++) {
 * structure = structure + "_ ";
 * }
 * // no idea what's going on here
 * String modifiedPhrase = secretPhrase;
 * while (a != -1) {
 * structure = structure + "  ";
 * modifiedPhrase = modifiedPhrase.substring(a + 1);
 * a = modifiedPhrase.indexOf(" ");
 * if (a != -1) {
 * int j;
 * for (j = 0; j < a; j++) {
 * structure = structure + "_ ";
 * }
 * } else {
 * int b = modifiedPhrase.length();
 * for (i = 0; i < b; i++) {
 * structure = structure + "_ ";
 * }
 * }
 * }
 * } else {
 * int b = secretPhrase.length();
 * int i;
 * for (i = 0; i < b; i++) {
 * structure = structure + "_ ";
 * }
 * }
 * System.out.println(structure);
 * currentStructure = structure;
 * return structure;
 * }
 * 
 * public static String modifyStructure(int index, String guess) {
 * int structureIndex = index * 2;
 * String structure = currentStructure;
 * String a = structure.substring(0, structureIndex);
 * String b = structure.substring(structureIndex + 1);
 * String c = a + guess + b;
 * System.out.println(c);
 * 
 * if (secretPhrase.substring(index + 1).indexOf(guess) != -1) {
 * int newIndex = secretPhrase.substring(index + 1).indexOf(guess) + index + 1;
 * int newStructureIndex = newIndex * 2;
 * a = c.substring(0, newStructureIndex);
 * b = c.substring(newStructureIndex + 1);
 * c = a + guess + b;
 * System.out.println(c);
 * 
 * if (secretPhrase.substring(index + 2 + newIndex).indexOf(guess) != -1) {
 * int newIndex2 = secretPhrase.substring(index + 2 + newIndex).indexOf(guess) +
 * index + 2 + newIndex;
 * int newStructureIndex2 = newIndex2 * 2;
 * a = c.substring(0, newStructureIndex2);
 * b = c.substring(newStructureIndex2 + 1);
 * c = a + guess + b;
 * System.out.println(c);
 * 
 * if (secretPhrase.substring(index + 3 + newIndex + newIndex2).indexOf(guess)
 * != -1) {
 * int newIndex3 = secretPhrase.substring(index + 3 + newIndex +
 * newIndex2).indexOf(guess) + index + 3
 * + newIndex + newIndex2;
 * int newStructureIndex3 = newIndex3 * 2;
 * a = c.substring(0, newStructureIndex3);
 * b = c.substring(newStructureIndex3 + 1);
 * c = a + guess + b;
 * System.out.println(c);
 * }
 * }
 * }
 * 
 * currentStructure = c;
 * 
 * return "hello";
 * // for when we get letters correct
 * }
 * 
 * }
 * 
 */