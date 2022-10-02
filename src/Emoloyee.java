public class Emoloyee {

    private static int counter = 0;

    private Integer id;

    private String name;

    private String lastName;

    private String middlName;

    private int departament;

    private int salary;

    public Emoloyee(String name, String lastName, String middlName, int departament, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.middlName = middlName;
        this.departament = departament;
        this.salary = salary;
        this.id = counter++;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddlName() {
        return middlName;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emoloyee{" +
                "id=" + id +
                ", Имя='" + name + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Отчество='" + middlName + '\'' +
                ", Отдел=" + departament +
                ", Зарплата=" + salary +
                '}';
    }
}
