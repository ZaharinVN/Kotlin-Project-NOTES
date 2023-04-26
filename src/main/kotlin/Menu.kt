class Menu(private val items: List<String>) {
    fun show() {
        items.forEachIndexed { index, item ->
            println("$index. $item")
        }
        println("Введите номер пункта меню:")
    }

    fun readInput(): Int {
        val input = readlnOrNull()
        val choice = input?.toIntOrNull()
        if (choice == null) {
            println("Введите корректный пункт меню!")
            return readInput()
        } else if (choice !in items.indices) {
            println("Такого пункта меню нет!")
            return readInput()
        }
        return choice
    }
}