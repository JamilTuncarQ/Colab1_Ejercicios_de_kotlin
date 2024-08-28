fun main() {
    clima("Ankara", 27, 31, 82)
    clima("Tokyo", 32, 36, 10)
    clima("Cape Town", 59, 64, 2)
    clima("Guatemala City", 50, 55, 7)

}
fun clima(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int){
    print("City: $city\nLow temperature: $lowTemperature, High temperature: $highTemperature\nChance of rain: $chanceOfRain%\n")
}