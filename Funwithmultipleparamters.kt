fun main() {
    println(Ajay("Ajay",12))
    println(Ajay("Vasu",22))
    println(Ajay(name = "Manu", age = 20))//named arguments
}
fun Ajay(name: String,age: Int): String {
    val name = "Happy Birthday,$name"
    val age = "Your $age years old"
    return "name:$name\nage:$age"
}