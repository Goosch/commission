package ru.netology

fun main() {
    val amount: Int = 10_999
    val commissionInPercent: Double = 0.75
    val minCommissionValue: Int = 35

    val sizeCommission: Double =
        if ((amount / 100 * commissionInPercent) < minCommissionValue) minCommissionValue.toDouble()
        else (amount / 100 * commissionInPercent)
    println("Total commission $sizeCommission")
}