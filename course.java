class course {
    String course_name;
    int registered_students;
    int passed_students;

    static int totalStudents;

    course(String course_name, int registered_students, int passed_students){
     this.course_name = course_name;
     this.registered_students = registered_students;
     this.passed_students = passed_students;
     totalStudents += registered_students;
    }

    public void CourseStats() {
        System.out.println(course_name + " has " + registered_students + " students.");
    }
    public void passPercentage() {
        double pass_percentage = (passed_students * 100.0) / registered_students;
        System.out.println(course_name + " pass percentage: "+ pass_percentage);
    }

   static void main(String[] args) {
      course c1 = new course("Applied Object Oriented Programming", 150, 130);
        course c2 = new course("Computer Networks", 110, 95);
        course c3 = new course("Research Methods", 80, 78);

        c1.CourseStats();
        c1.passPercentage();

        c2.CourseStats();
        c2.passPercentage();

        c3.CourseStats();
        c3.passPercentage();

        System.out.println("Total students across all courses: " + totalStudents);

    }

}
