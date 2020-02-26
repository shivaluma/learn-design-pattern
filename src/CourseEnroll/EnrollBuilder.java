package CourseEnroll;

public interface EnrollBuilder {
    EnrollBuilder chooseLanguage(Language language);
    EnrollBuilder chooseSemester(Semester semester);
    EnrollBuilder chooseLearningType(LearningType learningType);
    EnrollBuilder chooseLevel(Level level);
    CourseEnroll  build();
}
