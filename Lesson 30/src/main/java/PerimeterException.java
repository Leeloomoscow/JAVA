public class PerimeterException extends Exception { // при создании собственной ошибки нужно добавлять слово Exeption и наследоваться от класса Exeption

    public PerimeterException() { // Пустой конструктор
    }

    public PerimeterException(String message) { // Конструктор принимающий сообщение, которое хотим передать пользователю
        super(message);
    }

    public PerimeterException(String message, Throwable cause) { //Сообщение с причиной
        super(message, cause);
    }

    public PerimeterException(Throwable cause) { //Причина
        super(cause);
    }

    public PerimeterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
