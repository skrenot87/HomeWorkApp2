package HomeWorkJAVA2_Lesson_1;

public class Human implements Participant{
    @Override
    public void run() {
        System.out.println("Человек пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Человек перепрыгнул стену");
    }
}
