import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvOperation {
    private static final String csvFilePath = "students.csv";

    public ArrayList<Student> loadStudentsFromCSV() {
        ArrayList<Student> students = new ArrayList<>(); //新建一个ArrayList
        try {
            Scanner scanner = new Scanner(Files.newInputStream(Paths.get(csvFilePath)));
            scanner.nextLine(); // 跳过标题行，从第二行读起
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                try {
                    if (data.length == 7) {
                        String name = data[0];
                        String id = data[1];
                        float JavaScore = Float.parseFloat(data[2]);
                        float mathScore = Float.parseFloat(data[3]);
                        float englishScore = Float.parseFloat(data[4]);
                        float totalScore = Float.parseFloat(data[5]);
                        float averScore = Float.parseFloat(data[6]);
                        students.add(new Student(name, id, JavaScore, mathScore, englishScore, totalScore, averScore)); //添加给students
                    } else {
                        throw new Exception("写入数据时发生错误： " + line);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return students;
    }


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