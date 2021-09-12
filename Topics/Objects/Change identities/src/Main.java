class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String nameTemp = p1.name;
        int ageTemp = p1.age;
        //
        Person temp = new Person();
        temp.name = nameTemp;
        temp.age = ageTemp;
        //
        p1.name = p2.name;
        p1.age = p2.age;
        //
        p2.name = temp.name;
        p2.age = temp.age;


    }
}