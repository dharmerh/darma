//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Task 1
 /*fun main() {
        println("Hello, Darmah")
    }
*/

//Task 2
/*fun main() {
    print("Enter your name: ")
    val name = readLine()

    print("Enter your age: ")
    val ageInput = readLine()
    val age = ageInput?.toIntOrNull()

    println("Hello $name, you are $age years old!")
}*/

//Task 3
/*fun main() {
    print("Enter a number: ")
    val input = readLine()
    val number = input?.toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("$number is even.")
        } else {
            println("$number is odd.")
        }
    } else {
        println("Invalid input.")
    }
}*/

//Task 4
/*fun main() {
    // Print numbers from 1 to 10
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        println(i)
    }

    // Print even numbers from 1 to 20
    println("\nEven numbers from 1 to 20:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}*/

//Task 5
// Function to add two numbers
/*fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result1 = sum(6, 10)
    val result2 = sum(10, 20)


    println("Sum of 6 and 10 is: $result1")
    println("Sum of 10 and 20 is: $result2")

}*/

//Task 6
/*fun main() {
    val names = arrayOf("Darma", "Ayo", "Abdul", "Master", "Lola")

    for (name in names) {
        println("Hello, $name!")
    }
}*/

//Task 7
// Define the Car class
/*lass Car(val brand: String, val model: String, val year: Int) {

    fun displayDetails() {
        println("Brand: $brand, Model: $model, Year: $year")
    }
}

fun main() {
    // Create car objects
    val car1 = Car("Toyota", "Corolla", 2020)
    val car2 = Car("Honda", "Civic", 2022)

    // Display their details
    car1.displayDetails()
    car2.displayDetails()
}
*/

//Task 8
// Base class
open class Person(val name: String, val age: Int) {
    open fun printDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

// Subclass
/*class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    override fun printDetails() {
        super.printDetails()
        println("Grade: $grade")
    }
}

fun main() {
    val student1 = Student("Zainab", 20, "A")
    val student2 = Student("tijjani", 22, "B")

    student1.printDetails()
    println()
    student2.printDetails()
}*/
//Task 9
/*fun main() {
    // Create the map of student names and scores
    val studentScores = mapOf(
        "Darmah" to 85,
        "Tijjani" to 67,
        "Ibrahim" to 90,
        "Usman" to 72,
        "Ayo" to 65
    )

    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name scored $score")
        }
    }
}*/

//Task 10
fun main() {
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    val result = multiply(4, 5)
    println("The product of 4 and 5 is: $result")
}

