package homework9.exercise3;

import java.util.ArrayList;

public class Company {
    private ArrayList<Person> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public Person getManager() {
        for (Person employee : employees) {
            if (employee.getPosition().equals("manager")) {
                return employee;
            }
        }
        return null;
    }

    public ArrayList<Person> getPersons(String profession) {
        ArrayList<Person> foundPersons = new ArrayList<>();
        for (Person employee : employees) {
            if (employee.getPosition().equals(profession)) {
                foundPersons.add(employee);
            }
        }
        return foundPersons;
    }

    public ArrayList<Person> getPersonsOlder(int age) {
        ArrayList<Person> foundPersons = new ArrayList<>();
        for (Person employee : employees) {
            if (employee.getAge() > age) {
                foundPersons.add(employee);
            }
        }
        return foundPersons;
    }

    public ArrayList<Person> getPerson(String filterName) {
        ArrayList<Person> foundPersons = new ArrayList<>();
        for (Person employee : employees) {
            if (employee.getName().contains(filterName)) {
                foundPersons.add(employee);
            }
        }
        return foundPersons;
    }

    public void employ(Person employee) {
        if (employee.getPosition().equals("manager") && getManager() != null) {
            System.out.println("We already have a manager.");
        } else {
            employees.add(employee);
        }
    }

    @Override
    public String toString() {
        return "My company's employees are: " + employees;
    }
}
