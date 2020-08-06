fun main() {
    val user = setUser("Michael", 16, hobby= "gaming")
    println(user)
    printUser("Michael")
}

fun setUser(name: String, age: Int, hobby: String) = "My name is $name, I like $hobby, and I'm $age years old"
fun printUser(name: String) {
}
