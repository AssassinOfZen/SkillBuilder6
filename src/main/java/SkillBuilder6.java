
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants

    public static String findTYPattern(String s)
    {
        // replace this line with your code
        String subString = "";
        int startIndex = -1;
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) == 'T' || s.charAt(i) == 't') && startIndex ==-1){
                startIndex = i;
            }
            if ((s.charAt(i) == 'Y' || s.charAt(i) == 'y') && startIndex != -1){
                subString = s.substring(startIndex, i +1);
            }
        }
        return subString;
    }
}
