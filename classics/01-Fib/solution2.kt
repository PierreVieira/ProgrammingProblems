fun fib(n: BigDecimal): BigDecimal {
    if (n <= BigDecimal(2)) {
        return BigDecimal.ONE
    }
    return fib(n - BigDecimal.ONE) + fib(n - BigDecimal(2))
}