class Student {
    private String name;
    private int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);  
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("John", 95);
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Grade: " + s1.getGrade());
    }
}
