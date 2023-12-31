package ie.setu.classes

fun main(args: Array<String>){

    val person1 = Person("Mark", "Roche")
    val person2 = person1.copy(firstName = "Clare")
    val person3 = person1.copy()
    println(person1)
    println(person2.toString())

    println("person1 hashcode = ${person1.hashCode()}")
    println("person2 hashcode = ${person2.hashCode()}")
    println("person3 hashcode = ${person3.hashCode()}")

    if (person1.equals(person2))
        println("person1 is equal to person2.")
    else
        println("person1 is not equal to person2.")

    if (person1.equals(person3))
        println("person1 is equal to person3.")
    else
        println("person1 is not equal to person3.")
}