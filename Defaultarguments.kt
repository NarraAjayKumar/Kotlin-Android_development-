fun main() {
    println(Ajay(age = 12))//default
}
fun Ajay(name: String = "Ajay",age: Int): String {
    val name = "Happy Birthday,$name"
    val age = "Your $age years old"
    return "name:$name\nage:$age"
}