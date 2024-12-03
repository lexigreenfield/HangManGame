public class Display {
    // come up with the random word, for now I'm going to select one
    // that will be it's own method I think
    // generatePhrase();
    String secretPhrase = "hello world";

    // now find the structure
    private String displayStructure() {
        String structure = "";
        int a = secretPhrase.indexOf(" ");
        if (a != -1) {
            int i;
            for (i=0; i<a; i++) {
                structure = structure + "_ ";
            }
            //no idea what's going on here
            String modifiedPhrase = secretPhrase.substring(a+1);
            a = modifiedPhrase
        } else {
            int b = secretPhrase.length();
            int i;
            for (i=0; i<b; i++) {
                structure = structure + "_ ";
            }
        }
        return structure;
    }

}