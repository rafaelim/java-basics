package com.rafael.j8.basics.interfaces;

public class DefaultAndStaticMethods {

    @FunctionalInterface
    interface Employee {
        Employee find(int id);

        default boolean isExec(int id) {
            return true;
        }

        static String getDefaultState() {
            return "SP";
        }

    }


    public static void main(String[] args) {

        class EmployeeImpl implements Employee {


            @Override
            public Employee find(int id) {
                boolean executive = isExec(id);
                return null;
            }
        }

        EmployeeImpl employee = new EmployeeImpl();
        employee.find(1);

        String defaultState = Employee.getDefaultState();

        System.out.println(defaultState);

    }
}
