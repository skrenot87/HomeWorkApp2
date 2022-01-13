package HomeWorkJAVA2_Lesson_1;

public class MainApp {
    public static void main(String[] args) {
        Obstacles[]obstacles = {
                new Wall(),
                new Treadmill(),
                new Wall(),
                new Wall(),
                new Treadmill(),
                new Treadmill(),
                new Wall(),
                new Treadmill(),
                new Wall()
        };
        Participant[]participants = {
                new Cat(),
                new Human(),
                new Human(),
                new Robot(),
                new Cat(),
                new Human(),
                new Robot(),
                new Robot(),
                new Cat(),
        };
        for(Participant p:participants){
            for (Obstacles o:obstacles){
                o.action(p);
            }
        }
    }
}
