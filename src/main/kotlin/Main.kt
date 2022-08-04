fun main() {

    val purchase = 15_000  // вводимая величина
    val userMeloman = "yes"  // вводиться либо yes - постоянный клиент либо no - непостоянный
    val discount1 = 100
    val discount2 = 95
    val discount3 = 1
    val discountStart1 = 1_001
    val discountStart2 = 10_001
    var totalPrace = purchase
    val result = if (purchase > discountStart1 && purchase < discountStart2 && userMeloman != "yes") {
        totalPrace = purchase - discount1
    } else if (purchase > discountStart1 && purchase < discountStart2 && userMeloman == "yes") {
        totalPrace = purchase - discount1 - purchase * discount3 / 100
    } else if (purchase > discountStart2 && userMeloman != "yes") {
        totalPrace = purchase * discount2 / 100
    } else {
        totalPrace = purchase * discount2 / 100 - purchase * discount3 / 100
    }
    println()
    println(totalPrace)
}