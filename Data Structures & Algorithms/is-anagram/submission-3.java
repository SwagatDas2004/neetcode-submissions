class Solution {
    public boolean isAnagram(String s, String t) {
        //My first solution is to make character arrays of them, sort the arrays
        //make it string again and then compare?
        //Second solution is to make 2 hashmaps with the key being letters
        //and values being the number of times they appear and they 
        //compare the whole pairs of the hashmap to see if they are equal

        //1st solution character Arrays

        /*
        char[] chr1 = s.toCharArray();
        Arrays.sort(chr1);
        String str1 = new String(chr1);

        char[] chr2 = t.toCharArray();
        Arrays.sort(chr2);
        String str2 = new String(chr2);

        if(str1.equals(str2)) return true;
        else return false;
        */

        //2nd solution

        HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();

        //first check the lengths, if not same auomatically they not same
        if(s.length()!=t.length()) return false;

        //loop
        for(int i=0;i<s.length(); i++){
            hmap1.put(s.charAt(i), hmap1.getOrDefault(s.charAt(i),0)+1);
            hmap2.put(t.charAt(i), hmap2.getOrDefault(t.charAt(i),0)+1);
        }

        //compare if the hashmaps are equal or not and return the ans
        if(hmap1.equals(hmap2)) return true;
        else return false;
    }
}
