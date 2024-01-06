import java.util.ArrayList;
public class StudentOperation {
    public static ArrayList<Student> students;

    public StudentOperation() {                       //创建一个ArrayList用于存放信息，并且把csv里的数据载入students中
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void deleteStudent(String id) {          //遍历students，当学号相等时删除
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                return;
            }
        }
        System.out.println("找不到对应学号的学生： " + id);
    }
    public void findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("姓名: " + student.getName());
                System.out.println("学号: " + student.getId());
                System.out.println("Java分数: " + student.getJavaScore());
                System.out.println("高等数学分数: " + student.getMathScore());
                System.out.println("大学英语分数: " + student.getEnglishScore());
                System.out.println("总分: " + student.getTotalScore());
                System.out.println("平均分: " + student.getAverScore());
                return;
            }
        }
        System.out.println("找不到对应学号的学生: " + id);
    }
    public void printAllStudents() {
        for (Student student : students) {           //遍历输出
            String info = "姓名：" + student.getName() + "\t" + "学号：" + student.getId() + "\t" + "Java分数：" + student.getJavaScore() + "\t"
                    + "高等数学分数：" + student.getMathScore() + "\t" + "大学英语：" + student.getEnglishScore() + "\t"
                    + "总分：" + student.getTotalScore() + "\t" + "平均分：" + student.getAverScore() + " ";
            System.out.println(info);
        }
    }
}