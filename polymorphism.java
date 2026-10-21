class HillStations {
    void location() {
        System.out.println("Location is: ");
    }
    void famousfor() {
        System.out.println("Famous for: ");
    }
}

class Manali extends HillStations {
    void location() {
        System.out.println("Manali is in Himachal Pradesh.");
    }
    void famousfor() {
        System.out.println("It is famous for Hadimba Temple and adventure sports.");
    }
}

class Mussoorie extends HillStations {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand.");
    }
    void famousfor() {
        System.out.println("It is famous for educational institutions.");
    }
}

class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulamarg is in J&K.");
    }
    void famousfor() {
        System.out.println("It is famous for skiing.");
    }
}

class Main {
    public static void main(String args[]) {
        HillStations A = new HillStations();
        HillStations M = new Manali();

        HillStations Mu = new Mussoorie();

        HillStations G = new Gulmarg();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();
    }
}
