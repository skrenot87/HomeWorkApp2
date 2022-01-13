package HomeWorkJAVA2_Lesson_1;

public class Wall implements Obstacles{
    @Override
    public void action(Participant participant) {
participant.jump();
    }
}
