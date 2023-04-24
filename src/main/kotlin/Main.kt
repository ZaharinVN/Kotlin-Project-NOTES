//Main
fun main() { //main
    val archives = mutableListOf<Archive>()

    while (true) {
        val choice = Menu(listOf("Создать новый архив") + archives.map { it.name } + "Выход").apply {
            show()
        }.readInput()

        if (choice == 0) {
            println("Введите название архива:")
            val name = readLine() ?: ""
            archives.add(Archive(name))
        } else if (choice == archives.size + 1) {
            break
        } else {
            val archive = archives[choice - 1]

            while (true) {
                val noteChoice = Menu(listOf("Добавить заметку") + archive.notes.map { it.title } + "Назад").apply {
                    show()
                }.readInput()
                if (noteChoice == 0) {
                    archive.addNote()
                } else if (noteChoice == archive.notes.size + 1) {
                    break
                } else {
                    val note = archive.notes[noteChoice - 1]
                    println(note.text)
                    println("Нажмите 'Enter' чтобы вернуться к списку заметок")
                    readLine()
                }
            }
        }
    }
}