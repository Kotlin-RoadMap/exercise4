fun main(args: Array<String>) {


    for (i in 5..5000 step 5) {
        println(i)
    }


    for (i in -500..0) {
        println(i)
    }

    // Fibonacci sequence with ranges, why totally removing the classic for, looks kinda bad imo : ((
    var total: Int
    var secondToLast = 0;
    var last = 1

    println(secondToLast)
    println(last)

    for (i in 1..13) {
        total = secondToLast + last;
        println(total)
        secondToLast = last
        last = total
    }




    // To avoid labels pls
    iloop@ for (i in 1..5) {

        println(i)
        if (i == 2) {
            break@iloop
        }

        for (j in 11..20) {
            println(j)

            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }

        }
    }


    // Quite cool this if tbh
    var num = 100
    var dnum = if (num < 100) {
        -234.567
    } else if (num > 100) {
        44444.5555
    } else {
        0
    }

    println(dnum)
}