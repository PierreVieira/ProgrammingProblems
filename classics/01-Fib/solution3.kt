fun fib(n: BigDecimal, cache: MutableMap<BigDecimal, BigDecimal> = mutableMapOf()): BigDecimal {
    if (n < BigDecimal.ZERO) {
        throw IllegalArgumentException("n must be a positive number")
    }
    if (cache.containsKey(n)) return cache.getValue(n)
    if (n <= BigDecimal(2)) return BigDecimal.ONE
    val value = fib(
        n = n - BigDecimal.ONE,
        cache = cache
    ) + fib(
        n = n - BigDecimal(2),
        cache = cache
    )
    cache[n] = value
    return value
}