//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем групп
        Group group1 = new Group("Группа 1");
        Group group2 = new Group("Группа 2");
        Group group3 = new Group("Группа 3");
        Group group4 = new Group("Группа 4");
        Group group5 = new Group("Группа 5");

        // Создаем потоки, а в них группы
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);
        stream1.addGroup(group4);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);

        Stream stream3 = new Stream();
        stream3.addGroup(group1);
        stream3.addGroup(group5);

        // Создаем список потоков
        List<Stream> streamm = new ArrayList<>();
        streamm.add(stream1);
        streamm.add(stream2);
        streamm.add(stream3);


        // Создаем сервис с контроллером
        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        // Сортируем и выводим список потоков до и после сортировки
        System.out.println("    Списки до сортировки:");
        for (Stream stream : streamm) {
            System.out.println(stream);
        }

        controller.sortStreams(streamm);

        System.out.println("  Списки после сортировки:");
        for (Stream stream : streamm) {
            System.out.println(stream);
        }
    }
}