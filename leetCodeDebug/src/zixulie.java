import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;

import java.util.*;

public class zixulie {

    public static void main(String[] args) {
        lengthOfLongestSubstring("au");
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()){
            return 0;
        }
        Map<Character,Integer> map =new HashMap<>();
        int left =0;
        int max =Integer.MIN_VALUE;

        char[] chars = s.toCharArray();

        for (int right = 0; right < chars.length; right++) {
            if (map.containsKey(chars[right])){
                    int num =  map.get(chars[right]);
                    map.put(chars[right],right);
                max= Math.max(max,right-left);
                    left=Math.max(num+1,left);
            }
            else {
                map.put(chars[right],right);

            }


        }
        return max ==Integer.MIN_VALUE?1:max;
    }
}
