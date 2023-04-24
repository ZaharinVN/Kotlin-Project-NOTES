//Archive
class Archive(val name: String) {
    val notes = mutableListOf<Note>()

    fun addNote() {
        println("Введите название заметки:")
        val title = readLine() ?: ""
        println("Введите текст заметки:")
        val text = readLine() ?: ""
        notes.add(Note(title, text))
    }

    fun readNote(): Note? {
        val choice = Menu(listOf("Добавить заметку") + notes.map { it.title }).apply {
            show()
        }.readInput()

        return if (choice == 0) {
            addNote()
            null
        } else {
            notes[choice - 1]
        }
    }
}
