public class Palindrome {
    public Deque<Character> wordToDeque(String word) {
        if (word.length() == 0) {
            return null;
        }
        Deque<Character> dequeChar = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            dequeChar.addLast(word.charAt(i));
        }
        return dequeChar;
    }

    public boolean isPalindrome(String word) {
        if (word.length() == 1 || word.length() == 0) {
            return true;
        }
        Deque<Character> dequeChar = wordToDeque(word);
        while (dequeChar.size() >= 2) {
            char first = dequeChar.removeFirst();
            char last = dequeChar.removeLast();
            if (first != last) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        if (word.length() == 1 || word.length() == 0) {
            return true;
        }
        Deque<Character> dequeChar = wordToDeque(word);
        while (dequeChar.size() >= 2) {
            char first = dequeChar.removeFirst();
            char last = dequeChar.removeLast();
            boolean charEqual = cc.equalChars(first, last);
            if (!charEqual) {
                return false;
            }
        }
        return true;
    }
}
