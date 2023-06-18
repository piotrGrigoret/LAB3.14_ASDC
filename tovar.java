import java.io.BufferedReader;
import java.io.IOException;
import java.util.Formatter;

/**

 Класс Tovar определяет объект товара и содержит методы для работы с ним.
 */
public class Tovar {

    private String name;
    private String description;
    private int price;
    private int number;
    private String unit;
    private int ID;

    /**

     Конструктор без параметров, который инициализирует поля объекта значениями по умолчанию.
     */
    public Tovar() {
        name = "None";
        description = "None";
        price = 0;
        number = 0;
        unit = "None";
        ID = 0;
    }
    /**

     Конструктор копирования, который создает новый объект Tovar, копируя все поля из объекта other.
     @param other объект, из которого копируются значения полей.
     */
    public Tovar(Tovar other) {
        name = other.name;
        description = other.description;
        price = other.price;
        number = other.number;
        unit = other.unit;
        ID = other.ID;
    }
    /**

     Метод клонирования, который создает новый объект Tovar и копирует в него все поля текущего объекта.
     @return копию текущего объекта Tovar.
     */
    public Tovar clone() {
        return new Tovar(this);
    }
    /**

     Метод, который сравнивает текущий объект Tovar с объектом other и возвращает true, если все поля равны, и false в противном случае.
     @param other объект, с которым сравнивается текущий объект.
     @return true, если объекты равны, и false в противном случае.
     */
    public boolean equal(Tovar other) {
        return (name.equals(other.name) &&
                description.equals(other.description) &&
                price == other.price &&
                number == other.number &&
                unit.equals(other.unit) &&
                ID == other.ID);
    }
    /**

     Метод для чтения данных из файла. Он принимает объект BufferedReader, считывает строку из файла, разбивает ее на поля и присваивает их значениям соответствующих полей текущего объекта.
     @param reader объект BufferedReader, из которого считывается строка данных.
     @throws IOException если при чтении данных произошла ошибка.
     */
    public void readingFile(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        String[] fields = line.split(", ");
        name = fields[0];
        description = fields[1];
        price = Integer.parseInt(fields[2]);
        number = Integer.parseInt(fields[3]);
        unit = fields[4];
        ID = Integer.parseInt(fields[5]);
    }
    /**

     Метод для вывода информации о товаре в консоль в формате "name, description, price, number, unit, ID".
     */
    public void writeElement() {
        System.out.println(name + ", " +
                description + ", " +
                price + ", " +
                number + ", " +
                unit + ", " +
                ID);
    }
/**

 Метод для вывода информации о товаре в таблицу в формате "%s ,%s ,%d ,%d ,%s ,%4d\n". Он Он принимает объект Formatter, который форматирует вывод в таблицу.
 *
 * @param formatter объект Formatter, который форматирует вывод в таблицу
 */
public void writeTable(Formatter formatter) { // метод для вывода информации о товаре в таблицу в формате "%s ,%s ,%d ,%d ,%s ,%4d\n". Он принимает объект Formatter, который форматирует вывод в таблицу.
    formatter.format("%s ,%s ,%d ,%d ,%s ,%4d\n", name, description, price, number, unit, ID);
}
}
