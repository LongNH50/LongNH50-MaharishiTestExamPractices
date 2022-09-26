import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagram(new char[]{'s', 'i', 't'},new char[]{'i', 't', 's'} ));
        System.out.println(areAnagram(new char[]{'s', 'i', 't'},new char[]{'i', 'd', 's'} ));
        System.out.println(areAnagram(new char[]{'b', 'i', 'g'},new char[]{'b', 'i', 't'} ));
        System.out.println(areAnagram(new char[]{'b', 'o', 'g'},new char[]{'b', 'o', 'o'} ));
        System.out.println(areAnagram(new char[]{},new char[]{} ));
        System.out.println(areAnagram(new char[]{'b', 'i', 'g'},new char[] {'b', 'i', 'g'}));

    }

    static int areAnagram(char[] array1,char[] array2){
        List<Character> listResult = new ArrayList<>();
        for(Character i : array1){
            listResult.add(i);
        }
        for(Character i : array2){
            if(listResult.contains(i)){
                listResult.remove(i);
            }
        }

        if(listResult.size() == 0)
            return 1;
        return 0;
    }
}
