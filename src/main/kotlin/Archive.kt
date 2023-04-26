class Archive(val name: String) {
    val notes = mutableListOf<Note>()

    fun addNote() {
        println("Введите название заметки:")
        val title = readlnOrNull() ?: ""
        println("Введите текст заметки:")
        val text = readlnOrNull() ?: ""
        notes.add(Note(title, text))
    }
}

