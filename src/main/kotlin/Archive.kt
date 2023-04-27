class Archive(val name: String) {
    val notes = mutableListOf<Note>()

    fun addNote() {
        var title: String
        var text: String
        do {
            println("Введите название заметки:")
            title = readlnOrNull() ?: ""
        } while (title.isBlank())
        do {
            println("Введите текст заметки:")
            text = readlnOrNull() ?: ""
        } while (text.isBlank())
        notes.add(Note(title, text))
    }
}

