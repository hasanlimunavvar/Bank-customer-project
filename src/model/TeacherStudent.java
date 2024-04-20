package model;

public class TeacherStudent {
    private Long id;
    private Teacher teacher;
    public Student student;
    public String subject;
    public String classNumber;

    public TeacherStudent() {
    }

    public TeacherStudent(Long id, Teacher teacher, Student student, String subject, String classNumber) {
        this.id = id;
        this.teacher = teacher;
        this.student = student;
        this.subject = subject;
        this.classNumber = classNumber;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Teacher getTeacher() {

        return teacher;
    }

    public void setTeacher(Teacher teacher) {

        this.teacher = teacher;
    }

    public Student getStudent() {

        return student;
    }

    public void setStudent(Student student) {

        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {

        this.subject = subject;
    }

    public String getClassNumber() {

        return classNumber;
    }

    public void setClassNumber(String classNumber) {

        this.classNumber = classNumber;
    }
}
