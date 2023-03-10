package ch7.objects.and.classes.sec2.creating.classes

class Car(val yearOfMake: Int, theColor: String) {

	var fuelLevel = 100

    var color = theColor
		set(value) {
            if (value.isBlank()) {
                throw RuntimeException("no empty, please")
            }
            field = value
        }
}

fun main(args: Array<String>) {
    val car = Car(2019, "Red")
    car.color = "Green"
    car.fuelLevel--
	car.yearOfMake

    println(car.fuelLevel) //99

    try {
        car.color = ""
    } catch (ex: Exception) {
        println(ex.message) //no empty, please
    }

    println(car.color) //Green

}
