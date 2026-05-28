class Solution:
    def isPalindrome(self, s: str) -> bool:
        x = "".join(char.lower() for char in s if char.isalnum())
        if not x:
            return True
        
        left, right = 0, len(x) - 1
        while left < right:
            if x[left] != x[right]:
                return False
            left += 1
            right -= 1
        
        return True