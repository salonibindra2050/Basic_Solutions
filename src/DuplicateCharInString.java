import java.util.Arrays;

/**
 * Created by salonibindra on 1/14/17.
 */
public class DuplicateCharInString {
    public static void main(String[] args) {
        DuplicateCharInString ob = new DuplicateCharInString();
        String s = "rtgfdcv";
        boolean b = ob.Unique_Char(s);
        System.out.println(b);
    }

    public boolean Unique_Char ( String s)
    {
        if(s.length()>256){
            System.out.println("legth");
            return false;}

            boolean[] check_char = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
              int h = s.charAt(i);
            if (check_char[h])
            {
                System.out.println("at char "+s.charAt(i)); return false;}
            else {
                check_char[h] = true;
            }
        }
        return true;

    }

    public boolean Uniq_char__Sort(String s)
    {   char[] x = s.toCharArray();
        Arrays.sort(x);
        System.out.println(x);
        return true;
    }


}
