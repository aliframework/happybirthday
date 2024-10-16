fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Mencetak nama dan usia
        println("Name: $name")
        println("Age: $age")

        // Mencetak hobi
        val hobbyMessage = if (hobby != null) {
            "Likes to $hobby."
        } else {
            "Doesn't have a hobby."
        }
        print("$hobbyMessage ")

        // Mencetak informasi tentang referrer
        val referrerMessage = if (referrer != null) {
            "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}."
        } else {
            "Doesn't have a referrer."
        }
        println(referrerMessage)

        // Menambahkan garis pemisah untuk kejelasan
        println()
    }
}
