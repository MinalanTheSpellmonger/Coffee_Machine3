import javax.print.Doc;

class Army {

    public static void createArmy() {
        //5 units
        Unit unitOne = new Unit("unitOne");
        Unit unitTwo = new Unit("unitTwo");
        Unit unitThree = new Unit("unitThree");
        Unit unitFour = new Unit("unitFour");
        Unit unitFive = new Unit("unitFive");
        //3 knghts
        Knight alan = new Knight("Alan");
        Knight bob = new Knight("Bob");
        Knight charles = new Knight("Charles");
        //1 General
        General george = new General("George");
        //1 Doctor
        Doctor derek = new Doctor("Derek");

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}