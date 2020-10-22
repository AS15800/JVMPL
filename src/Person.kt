import java.util.*

data class Person (var name: String, var age: Int = 18, var height: Int = 175, var weight: Float = 55f, var email: String) {
    override fun toString(): String {
        return "$name $age $height $weight $email"
    }

}

    class PersonHandler() {
        fun createPerson( age: String, name: String, height: String, weight: String, email: String) :Person{
            return Person(email = "adesh5800@hotmail.co.uk", name = name)
        }

        fun getHeightInInches (person: Person) = person.heightInInches()
    }

fun Person.heightInInches(): Float{
    return this.height* (1f/2.4f);
}

class printProject(){
    val projectList = Arrays.toString(MainGUI.projects.toTypedArray())
        .replace("[", "").replace("]", "")
}