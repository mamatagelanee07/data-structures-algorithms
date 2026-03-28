package data.structures

/**
 * Problem Template (copy above each solve function)
 *
 * Problem:
 * Description:
 *
 * Input:
 * Output:
 *
 * Constraints:
 * -
 *
 * Examples:
 * 1) Input:
 *    Output:
 *
 * Edge Cases:
 * -
 *
 * Expected Complexity:
 * - Time: O(...)
 * - Space: O(...)
 */

class StringOperations{
    fun addAtIndex(){
        val s = "Hello World"
        val index = 5
        val additionS = " Beautiful "
        val final = s.substring(0, index) + additionS + s.substring(index)
        println(final)
    }
    fun frequencyOfCharacters(){
        val s = "MAMATA"
        val frequencyMap = mutableMapOf<Char, Int>()
        for(char in s){
            frequencyMap[char] = frequencyMap.getOrElse(char, {0}) + 1
        }
        println(frequencyMap)
    }
    fun frequencyOfASCIICharacters(){
        val s = "MAMATA"
        val list = IntArray(128)
        for(char in s){
            list[char.code]++
        }
        println(list['A'.code])
    }
    fun isPalindrome(message : String) : Boolean{
        var start = 0
        var end = message.length -1 
        if(start >= end) return true
        while(start < end){
            if(message[start] != message[end]) return false
            else {
                start++
                end--
            }
        }
        return true
    }
}