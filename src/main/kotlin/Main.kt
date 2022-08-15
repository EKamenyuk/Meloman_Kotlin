fun main() {
    val discountStart1 = 1_001_00
    val discountStart2 = 10_001_00
    val discount1 = 100_00
    val discount2 = 0.05
    val discount3 = 0.01

    var purchaseValue = 320_00            // сумма покупки
    val amountPreviousPurchase = 1850_00  // предыдущая сумма покупки в копейках
    val userMeloman = true

    val intermediateDiscount: Int
    if (amountPreviousPurchase > discountStart1 && amountPreviousPurchase <= discountStart2) {
        intermediateDiscount = purchaseValue - discount1
    } else if (amountPreviousPurchase > discountStart2) {
        intermediateDiscount = (purchaseValue * (1 - discount2)).toInt()
    } else intermediateDiscount = purchaseValue

    val finalDiscount: Int
    if (userMeloman) {
        finalDiscount = (intermediateDiscount * (1 - discount3)).toInt()
    } else {
        finalDiscount = intermediateDiscount
    }
    println("покупка - " + purchaseValue / 100 + "." + purchaseValue % 100)
    println("после применения скидки - " + intermediateDiscount / 100 + "." + intermediateDiscount % 100)
    println("после применения 1% скидки - " + finalDiscount / 100 + "." + finalDiscount % 100)
}