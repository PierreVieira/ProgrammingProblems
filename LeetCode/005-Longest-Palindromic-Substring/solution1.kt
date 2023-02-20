/**
 * Author: Pierre Vieira
 * Date: 20/02/2023
 * Time complexity: O(n³) - It doesn't pass
 * */
class Solution {
    private fun String.isPalindrome(): Boolean = this == reversed()

    fun longestPalindrome(s: String): String {
        val size = s.length
        if (size == 1) return s
        var longestPalindrome: String = s.first().toString()
        var currentWord: String
        var biggestSize = longestPalindrome.length
        for (i in 0 until size) {
            currentWord = s[i].toString()
            for (j in i + 1 until size) {
                currentWord += s[j]
                if (currentWord.isPalindrome()) {
                    if (currentWord.length > biggestSize) {
                        longestPalindrome = currentWord
                        biggestSize = currentWord.length
                    }
                }
            }
        }
        return longestPalindrome
    }
}