fun fib(n: Int): Int { // O(n)
    if (n <= 2) {
        return 1
    }
    // [1, 1, 2, 3, 5, 8, 13 ...]
    var first = 1
    var second = 1
    var sum = first + second
    for (i in 3 until n) {
        first = second
        second = sum
        sum = first + second
    }
    return sum
}