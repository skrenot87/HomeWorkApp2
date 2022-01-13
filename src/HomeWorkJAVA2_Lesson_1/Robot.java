package HomeWorkJAVA2_Lesson_1;

public class Robot implements Participant{
    @Override
    public void run() {
        System.out.println("Робот пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Робот перепрыгнул стену");
    }
}
