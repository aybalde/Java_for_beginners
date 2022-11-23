import java.util.Random;

public class GetShortestWord
{
    public String word1;
    public String word2;
    public GetShortestWord(String wor1, String wor2){
        word1 = wor1;
        word2 = wor2;
    }
   public static String getShortestWord(String word1, String word2){
       if (word1.length() < word2.length()){
           return word1;
       }
       else if(word1.length() > word2.length()) {
           return word2;
       }
       else
           return word1;
   }
}