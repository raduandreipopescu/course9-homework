package homework9.exercise3;

public class RunningCompany {
    public static void main(String[] args) {
        Company myCompany = new Company();

        myCompany.employ(new Welder("George", 23));
        myCompany.employ(new Person("Luca", 43, "manager"));
        myCompany.employ(new Manager("Matei", 42));
        myCompany.employ(new Person("Gheorghe", 24, "welder"));
        myCompany.employ(new Person("Gigi", 25, "welder"));
        myCompany.employ(new Carpenter("Ilie", 37));
        myCompany.employ(new Plumber("Vasile", 32));

        System.out.println(myCompany);
        System.out.println("Find manager: " + myCompany.getManager());
        System.out.println("Find profession: " + myCompany.getPersons("welder"));
        System.out.println("Older than 30 employees: " + myCompany.getPersonsOlder(30));
        System.out.println("Employees with G in name: " + myCompany.getPerson("G"));
    }
}