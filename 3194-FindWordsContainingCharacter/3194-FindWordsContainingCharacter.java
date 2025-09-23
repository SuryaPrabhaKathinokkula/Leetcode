// Last updated: 9/23/2025, 6:49:34 PM
class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x)
     {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
         if(words[i].contains(""+x))
         res.add(i);
        }
        return res;
     }
}