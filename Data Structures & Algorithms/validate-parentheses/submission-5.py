class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2 == 1:
            return False

        close_to_open = {")" : "(", "}" : "{", "]" : "["}
        
        stack = []
        for i in range(len(s)):
            c = s[i]

            if c in close_to_open:
                if len(stack) == 0:
                    return False
                last = stack.pop()
                if close_to_open[c] != last:
                    return False
            
            else:
                stack.append(c)
        if len(stack) != 0:
            return False
        return True