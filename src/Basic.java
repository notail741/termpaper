import java.util.Arrays;

public class Basic {
    private static Emoloyee[] emoloyees = new Emoloyee[2];

    public static void main(String[] args) {
        Emoloyee emp1 = new Emoloyee ("Петр", "Иванович", "Иванов", 1, 110000);
        Emoloyee emp2 = new Emoloyee ("Василий", "Иванович", "Иванов", 1, 120000);

        emoloyees[0] = emp1;
        emoloyees[1] = emp2;
        Emoloyee [] emp = Arrays.copyOf(emoloyees,11);

        Arrays.stream(emp).forEach(System.out::println);
        System.out.println(emp.length);

        printEmployees();

        caclucateTotalSalary();

        findEmployeeWithMinSalary();

        findEmployeeWithMaxSalary();

        calculateAverageSalary();

        printFullNames();

    }
    private static void printEmployees(){
        for (Emoloyee emoloyee : emoloyees){
            System.out.println(emoloyee);
        }
    }
    private static int caclucateTotalSalary(){
        int sum = 0;
        for (Emoloyee emoloyee : emoloyees){
            sum += emoloyee.getSalary();
        }
        return sum;
    }
    public static Emoloyee findEmployeeWithMinSalary(){
        Emoloyee result = emoloyees[0];
        int minSalary = emoloyees[0].getSalary();
        for (Emoloyee emoloyee : emoloyees){
            minSalary = emoloyee.getSalary();
            result = emoloyee;
        }
        return result;
    }
    public static Emoloyee findEmployeeWithMaxSalary(){
        Emoloyee result = emoloyees[0];
        int maxSalary = emoloyees[0].getSalary();
        for (Emoloyee emoloyee : emoloyees){
            if (emoloyee.getSalary() > maxSalary){
                maxSalary = emoloyee.getSalary();
                result = emoloyee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary(){
        int count = 0;
        int sum = 0;
        for (Emoloyee emoloyee : emoloyees){
            if (emoloyee != null){
                count++;
                sum += emoloyee.getSalary();
            }
        }
        return sum / count;
    }

    public static void printFullNames(){
        for (Emoloyee emoloyee : emoloyees){
            System.out.println(emoloyee.getLastName());
        }
    }
}
