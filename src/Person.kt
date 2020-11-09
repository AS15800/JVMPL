import java.io.BufferedReader
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
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

    fun WriteFile(title: String, description: String){

        //Creating directory, if it doesn't exist
        val directory: File = File("Resources")
        if (! directory.exists()){
            directory.mkdir();
        }

            //Setting a file path for the text file
        val fileName = File("Resources\\$title.txt")
        if (fileName.exists()){
            println("File name exists")
        } else {
            //Writting a certain string in the file
            fileName.bufferedWriter().use { out ->

                out.write("Project Title:$title\n")
                out.write("Description:$description\n")
            }
            println("Writed to file")
        }
    }

    fun ReadFile(){
        try {
            val projectDirAbsolutePath = Paths.get("").toAbsolutePath().toString()
            val resourcesPath = Paths.get(projectDirAbsolutePath, "Resources")
            val path = Files.walk(resourcesPath)
                .filter { item -> Files.isRegularFile(item) }
                .filter { item -> item.toString().endsWith(".txt") }
                .forEach { item ->
                    //val projectTitle = "$item".replace("C:\\Users\\adesh\\IdeaProjects\\Test\\Resources\\", "")
                    //CreateProjectForm.createBtn(projectTitle)
                    //println("Filename: $item");
                    val bufferedReader: BufferedReader = File("$item").bufferedReader();
                    //val inputString = bufferedReader.use { it.readText() };
                    val titleString = bufferedReader.use { it.readLines()[0] }
                    if (titleString.contains("Project Title:")) {
                        val projectTitle = titleString.replace("Project Title:", "")
                        //println(projectTitle)

                        CreateProjectForm.createBtn(projectTitle)
                    }
                }
        } catch (e: Exception){
            println(e)
        }
                //println(inputString)}
    }
}