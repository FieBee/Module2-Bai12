public class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    private String anddress;

    public Student(String name, Integer age, String anddress) {
        this.name = name;
        this.age = age;
        this.anddress = anddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAnddress() {
        return anddress;
    }

    public void setAnddress(String anddress) {
        this.anddress = anddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", anddress='" + anddress + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
