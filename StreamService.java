import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private Stream stream;

    public List<StudentGroup> getSortedStudentGroupList() {
        List<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
        studentGroupList.sort(new StreamComparator());
        return studentGroupList;
    }

}