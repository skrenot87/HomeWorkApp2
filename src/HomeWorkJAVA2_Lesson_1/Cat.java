package HomeWorkJAVA2_Lesson_1;

public class Cat implements Participant{
    @Override
    public void run() {
        System.out.println("Кот пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот перепрыгнул стену");
    }
}
