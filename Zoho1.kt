fun main() {
    val n = 3  // Number of rows for the upper half

    // Upper half of the diamond (including the middle row)
    for (i in 1..n) {
        for (j in 1..(n - i)) {
            print("  ")
        }
        if (i == 1 || i == n) {
            print("1")
            for (j in 1..(2 * i - 2)) {
                print("  ")
            }
            println("5")
        } else {
            print("2")
            for (j in 1..(2 * i - 3)) {
                print("  ")
            }
            println("4")
        }
    }

    // Lower half of the diamond
    for (i in (n - 1) downTo 1) {
        for (j in 1..(n - i)) {
            print("  ")
        }
        if (i == 1) {
            print("1")
            for (j in 1..(2 * i - 2)) {
                print("  ")
            }
            println("5")
        } else {
            print("2")
            for (j in 1..(2 * i - 3)) {
                print("  ")
            }
            println("4")
        }
    }
}
