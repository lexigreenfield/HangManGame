public class Display {
    // come up with the random word, for now I'm going to select one
    // that will be it's own method I think
    // generatePhrase();
    String secretPhrase = "hello world im lexi";

    // now find the structure
    public String displayStructure() {
        String structure = "";
        int a = secretPhrase.indexOf(" ");
        if (a != -1) {
            int i;
            for (i = 0; i < a; i++) {
                structure = structure + "_ ";
            }
            // no idea what's going on here
            String modifiedPhrase = secretPhrase;
            while (a != -1) {
                structure = structure + "   ";
                modifiedPhrase = modifiedPhrase.substring(a + 1);
                a = modifiedPhrase.indexOf(" ");
                if (a != -1) {
                    int j;
                    for (j = 0; j < a; j++) {
                        structure = structure + "_ ";
                    }
                } else {
                    int b = modifiedPhrase.length();
                    for (i = 0; i < b; i++) {
                        structure = structure + "_ ";
                    }
                }
            }
        } else {
            int b = secretPhrase.length();
            int i;
            for (i = 0; i < b; i++) {
                structure = structure + "_ ";
            }
        }
        System.out.println(structure);
        return structure;
    }

    public String modifyStructure() {
        return "hello";
    }

}