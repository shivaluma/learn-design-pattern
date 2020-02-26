package CourseEnroll;

public class Student {
    public static void main(String[] args) {
        CourseEnroll myCourseErroll = new CourseEnrollBuilder()
                .chooseLanguage(Language.JAVASCRIPT)
                .chooseLearningType(LearningType.ONLINE)
                .chooseSemester(Semester.FIRST)
                .chooseLevel(Level.ADVANCED)
                .build();
        System.out.println(myCourseErroll);
    }
}
