fun main() {

//    val n = 1
//    val m = 1000
//    val palindrome = findPalindrome(n, m)
//    println("Palindrome squares in range $n to $m: ")
//    print(palindrome)

    val n = 100
    val divisors = divisors(n)

    println("Prime divisors of $n: $divisors")



}


fun divisors(n: Int): List<Int> {
    val divisors = mutableListOf<Int>()
    var num = n
    var divisor = 2

    while (num > 1 && divisor <= n) {
        if (num % divisor == 0 && isPrime(divisor)) {
            divisors.add(divisor)
            num /= divisor
        } else {
            divisor++
        }
    }
    return divisors
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    if (num <= 3) return false
    if (num % 2 == 0 || num % 3 == 0) return false

    var i = 5
    while (i * i <= num) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return false
        }
        i += 6
    }
    return true
}





fun isPalindrome(num: Int): Boolean {
    val str = num.toString()
    return str == str.reversed()
}


fun findPalindrome(n: Int, m: Int): List<Int> {
    val result = mutableListOf<Int>()

    for (num in n..m) {
        if (isPalindrome(num)) {
            val square = num * num
            if (isPalindrome(square)) {
                result.add(num)
            }
        }
    }
    return result
}






