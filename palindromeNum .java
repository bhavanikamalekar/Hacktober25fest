class palindromeNum {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;

        int originalNum = x;
        int reverseNum = 0;

        while(x!=0){
            int lastDigit = x % 10;

            // Check for overflow before updating reverseNum
            if (reverseNum > INT_MAX / 10 || (reverseNum == INT_MAX / 10 && lastDigit > 7)) {
                return 0;  // Overflow occurred
            }
            if (reverseNum < INT_MIN / 10 || (reverseNum == INT_MIN / 10 && lastDigit < -8)) {
                return 0;  // Underflow occurred
            }
            reverseNum = (reverseNum*10) + lastDigit;
            x/=10;
        }
        return originalNum == reverseNum;
    }
};
