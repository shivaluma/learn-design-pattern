package CourseEnroll;

public class CourseEnrollBuilder implements EnrollBuilder {

    private Language courseLanguage;
    private LearningType courseLearningType;
    private Semester courseSemester;
    private Level courseLevel;

    @Override
    public EnrollBuilder chooseLanguage(Language language) {
        this.courseLanguage = language;
        return this;
    }

    @Override
    public EnrollBuilder chooseSemester(Semester semester) {
        this.courseSemester = semester;
        return this;
    }

    @Override
    public EnrollBuilder chooseLearningType(LearningType learningType) {
        this.courseLearningType = learningType;
        return this;
    }

    @Override
    public EnrollBuilder chooseLevel(Level level) {
        this.courseLevel = level;
        return this;
    }

    @Override
    public CourseEnroll build() {
        return new CourseEnroll(courseLanguage,courseLearningType,courseSemester,courseLevel);
    }
}
