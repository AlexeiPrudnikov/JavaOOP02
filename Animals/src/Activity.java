public interface Activity {
    default void sleep() {
        System.out.println("Хрррр....");
    }

    default void jump() {
        System.out.println("Прыжок");
    }

    default void move() {
        System.out.println("Движение");
    }

    default void run() {
        System.out.println("Бег");
    }

    public abstract void answer();
}
