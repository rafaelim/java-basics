package com.rafael.j8.basics.lambda.scope;

public class LambdaScope extends SuperScope {

    public String member = "FATHER";


    interface Family {
        String who(String member);
    }

    public void testMember (String member) {
        System.out.println("Local member: " + member);
        System.out.println("Family member - this: " + this.member);
        System.out.println("Family member - super: " + super.member);

        Family familyLambda = (familyMember) -> {
            System.out.println("Local Lambda member: " + familyMember);
            System.out.println("Local Lambda member: " + member);
            System.out.println("Local Lambda Family member - this: " + this.member);
            System.out.println("Local Lambda Family member - super: " + super.member);
            return familyMember;
        };

        familyLambda.who(member);
    }

    public static void main(String[] args) {
        new LambdaScope().testMember("SON");
    }
}
