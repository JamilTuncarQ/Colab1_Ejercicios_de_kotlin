fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val CaloriesBurnedforEachStep = 0.04
    val TotalCaloriesBurned = numberOfSteps * CaloriesBurnedforEachStep
    return TotalCaloriesBurned
}