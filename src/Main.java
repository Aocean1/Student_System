import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentOperation manager = new StudentOperation();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 查找学生");
            System.out.println("4: 列出此次添加的所有学生");
            System.out.println("7: 退出系统");
            System.out.print("输入你的选择: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Add student
                    System.out.print("请输入学生姓名: ");
                    String name = scanner.next();
                    System.out.print("请输入学生 "+name+" 学号: ");
                    String id = scanner.next();
                    System.out.print("请输入学生 "+name+" 的java成绩: ");
                    float javaScore = scanner.nextInt();
                    System.out.print("请输入学生 "+name+" 的高等数学数学成绩: ");
                    float mathScore = scanner.nextInt();
                    System.out.print("请输入学生 "+name+" 的大学英语成绩: ");
                    float englishScore = scanner.nextInt();
                    Student student = new Student(name, id, javaScore, mathScore, englishScore,javaScore+englishScore+mathScore,(javaScore+englishScore+mathScore)/3);
                    manager.addStudent(student);
                    break;
                case 2: // Delete student
                    System.out.print("输入你要删除学生的学号: ");
                    String idToDelete = scanner.next();
                    manager.deleteStudent(idToDelete);
                    break;
                case 3: // Find student
                    System.out.print("输入你要查找学生的学号: ");
                    String idToFind = scanner.next();
                    manager.findStudent(idToFind);
                    break;
                case 4:
                    manager.printAllStudents();
                    break;
                case 5: // Exit
                    exit = true;
                    break;
                default: // Invalid choice
                    System.out.println("输入错误，请重新输入");
            }
        }
        scanner.close();
    }
}