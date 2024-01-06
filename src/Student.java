public class Student {
    private final String name;
    private final String id;
    private final float javaScore;
    private final float mathScore;
    private final float englishScore;
    private final float totalScore;
    private final float averScore;

    public Student(String name, String id, float javaScore, float mathScore, float englishScore,float totalScore,float averScore) {
        this.name = name;
        this.id = id;
        this.javaScore = javaScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.totalScore = totalScore;
        this.averScore = averScore;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public float getJavaScore() {
        return javaScore;
    }

    public float getMathScore() {
        return mathScore;
    }

    public float getEnglishScore() {
        return englishScore;
    }

    public float getTotalScore() {
        return totalScore;
    }

    public float getAverScore() {
        return averScore;}
}