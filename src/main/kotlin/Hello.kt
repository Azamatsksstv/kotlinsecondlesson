import java.util.*    // required import



val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
fun main() {
//    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//
//    // eager, creates a new list
//    val eager = decorations.filter { it [0] == 'p' }
//    println("eager: $eager")
//
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println("filtered: $filtered")
//
//    // force evaluation of the lazy list
//    val newList = filtered.toList()
//    println("new list: $newList")

//    val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }

//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")
//    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${lazyMap2.toList()}")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
}



fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}
//
//fun main(args: Array<String>) {
//    feedTheFish()
//}


fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"








//var dirty = 16
//var dirty =  updateDirty(dirty)  : (Int) -> Int = { dirty -> dirty / 2 }
//print(dirty)
//
//
//fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//    dirty = dirty/2
//}