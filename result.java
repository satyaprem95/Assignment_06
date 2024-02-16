package Assignment6P2;

class result extends Student implements examInterface {
    public result(String name, int prn, double mark1, double mark2, double mark3) {
        super(name, prn, mark1, mark2,mark3);
    }

    @Override
    public double Percent_cal(double mark1, double mark2, double mark3) {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    @Override
    public void displayExamDetails() {
        System.out.println("\nPRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Percentage: " + Percent_cal(mark1, mark2, mark3) + "%");
    }
}