fun main(){
    var timeSpentToday: Int
    var timeSpentYesterday: Int

    val valor1: Boolean
    val valor2: Boolean
    val valor3: Boolean

    valor1 = comparar(timeSpentToday = 300, timeSpentYesterday = 200)
    valor2 = comparar(timeSpentToday = 200, timeSpentYesterday = 200)
    valor3 = comparar(timeSpentToday = 200, timeSpentYesterday = 300)
	println(valor1)
    println(valor2)
    println(valor3)
}

fun comparar(timeSpentToday: Int, timeSpentYesterday: Int): Boolean{
    return timeSpentToday > timeSpentYesterday
}