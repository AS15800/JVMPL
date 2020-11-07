import java.io.BufferedReader
import java.io.File
import java.util.*

data class Person(
    var name: String,
    var age: Int = 18,
    var height: Int = 175,
    var weight: Float = 55f,
    var email: String
) {
    override fun toString(): String {
        return "$name $age $height $weight $email"
    }

}

    class PersonHandler() {
        fun createPerson(age: String, name: String, height: String, weight: String, email: String) :Person{
            return Person(email = "adesh5800@hotmail.co.uk", name = name)
        }

        fun getHeightInInches(person: Person) = person.heightInInches()
    }

fun Person.heightInInches(): Float{
    return this.height* (1f/2.4f);
}

class printProject(){
    val projectList = Arrays.toString(MainGUI.projects.toTypedArray())
        .replace("[", "").replace("]", "")

    fun WriteFile(){

        val fileName = File("C:\\Users\\adesh\\Desktop\\file1.txt")

        fileName.bufferedWriter().use { out ->

            out.write("Hello Niyaz\n")
            out.write("Mr Potato\n")
        }

        println("Writed to file")
    }

    fun ReadFile(){

        val bufferedReader: BufferedReader = File("C:\\Users\\adesh\\Desktop\\file1.txt").bufferedReader()
        val inputString = bufferedReader.use { it.readText() }
        println(inputString)
    }
}