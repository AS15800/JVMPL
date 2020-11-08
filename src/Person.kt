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
    //Replacing a few character in the string
    val projectList = Arrays.toString(MainGUI.projects.toTypedArray())
        .replace("[", "").replace("]", "")

    fun WriteFile(){

        val directory: File = File("Resources")
        if (! directory.exists()){
            directory.mkdir();
        }

            //Setting a file path for the text file
            val fileName = File("Resources\\file2.txt")

            //Writting a certain string in the file
            fileName.bufferedWriter().use { out ->

                out.write("Hello Imposter\n")
                out.write("Mr Potato\n")
            }

        println("Writed to file")
    }

    fun ReadFile(){
        //Read a specific file in a specific file path
        val bufferedReader: BufferedReader = File("Resources\\file2.txt").bufferedReader()
        //Read the text file
        val inputString = bufferedReader.use { it.readText() }
        println(inputString)
    }
}