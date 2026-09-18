class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        mapS, mapT = {}, {}
        for i in range(len(s)):
            if not s[i] in mapS:
                mapS[s[i]] = 1
            else:
                mapS[s[i]] += 1
            if not t[i] in mapT:
                mapT[t[i]] = 1
            else:
                mapT[t[i]] += 1

        return mapS == mapT