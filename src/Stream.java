import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group> {
    private final List<Group> studyGroups;

    public Stream() {
        this.studyGroups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        studyGroups.add(group);
    }

    public List<Group> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public String toString() {
        return "Поток групп" +
                " - " + studyGroups;
    }

    @Override
    public Iterator<Group> iterator() {
        return studyGroups.iterator();
    }


}
