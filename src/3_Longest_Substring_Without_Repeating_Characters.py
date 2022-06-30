class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        lst =[]
        for w in s:
            if w in lst:
                lst.clear()
            else:
                lst.append(w)
        return len(lst)
        
