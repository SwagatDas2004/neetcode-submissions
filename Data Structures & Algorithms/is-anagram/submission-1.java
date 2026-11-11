class Solution {
    public boolean isAnagram(String s, String t) {
        //My first solution is to make character arrays of them, sort the arrays
        //make it string again and then compare?
        //Second solution is to make 2 hashmaps with the key being letters
        //and values being the number of times they appear and they 
        //compare the whole pairs of the hashmap to see if they are equal

        //1st solution character Arrays

        char[] chr1 = s.toCharArray();
        Arrays.sort(chr1);
        String str1 = new String(chr1);

        char[] chr2 = t.toCharArray();
        Arrays.sort(chr2);
        String str2 = new String(chr2);

        if(str1.equals(str2)) return true;
        else return false;

    }
}
