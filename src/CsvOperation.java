import java.io.*;

public class CsvOperation {
    private static final String csvFilePath = "students.csv";

    public static void writeToFile() {
        FileWriter writer = null;
        try {
            writer = new FileWriter(csvFilePath, true); //使用追加模式
            for (Student student : StudentOperation.students) {
                writer.write("姓名：" + student.getName());
                writer.append(",");
                writer.write("学号：" + student.getId());
                writer.append(",");
                writer.write("java分数" + student.getJavaScore());
                writer.append(",");
                writer.write("高等数学分数：" + student.getMathScore());
                writer.append(",");
                writer.write("大学英语分数：" + student.getEnglishScore());
                writer.append(",");
                writer.write("总分：" + student.getTotalScore());
                writer.append(",");
                writer.write("平均分：" + student.getAverScore());
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("写入学生数据时发生错误");
            e.printStackTrace(System.err);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("关闭文件流时发生错误");
                    e.printStackTrace(System.err);
                }
            }
        }
    }
}