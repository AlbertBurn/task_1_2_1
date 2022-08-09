
fun main() {
    val percentageForTransfer = 0.75
    val minCommission = 3_500
    val amount = 1500_000

    val totalCommission = if((amount * percentageForTransfer / 100) > minCommission) (amount * percentageForTransfer / 100) else minCommission

    println(totalCommission)
}