package CourseEnroll;

enum Language {
    C,CPP, JAVA, CSHARP, JAVASCRIPT, NODEJS
}

enum LearningType {
    ONLINE, ONSITE
}

enum Semester {
    FIRST, SECOND, THIRD
}

enum Level {
    EASY, IMMEDIATE, ADVANCED, EXPERT
}



public class CourseEnroll {
    private Language courseLanguage;
    private LearningType courseLearningType;
    private Semester courseSemester;
    private Level courseLevel;

    public CourseEnroll(Language courseLanguage, LearningType courseLearningType, Semester courseSemester, Level courseLevel) {
        super();
        this.courseLanguage = courseLanguage;
        this.courseLearningType = courseLearningType;
        this.courseSemester = courseSemester;
        this.courseLevel = courseLevel;
    }

    @Override
    public String toString() {
        return "CourseEnroll{" +
                "courseLanguage=" + courseLanguage +
                ", courseLearningType=" + courseLearningType +
                ", courseSemester=" + courseSemester +
                ", courseLevel=" + courseLevel +
                '}';
    }

    public Language getCourseLanguage() {
        return courseLanguage;
    }

    public LearningType getCourseLearningType() {
        return courseLearningType;
    }

    public Semester getCourseSemester() {
        return courseSemester;
    }

    public Level getCourseLevel() {
        return courseLevel;
    }
}
