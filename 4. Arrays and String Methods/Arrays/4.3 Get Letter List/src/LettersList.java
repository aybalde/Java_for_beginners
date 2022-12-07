public class LettersList
{
    public static String[] getLettersList(String word){

        String[] letters = new String[word.length()];
        for (int i = 0; i < word.length(); i++){
            letters[i] = word.substring(i,i+1);
        }
        return letters;
    }
}