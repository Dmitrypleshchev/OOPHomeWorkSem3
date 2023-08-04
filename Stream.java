import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroupList;

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroup3List) {
        this.studentGroupList = studentGroup3List;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

}
