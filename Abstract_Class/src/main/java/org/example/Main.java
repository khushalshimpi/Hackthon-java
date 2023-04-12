package question5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

abstract class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    public Event(String name, String detail, String type, String organiser){
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public String getOrganiser() {
        return organiser;
    }

    public abstract Double calculateAmount();
}

class Exhibition extends Event{

    private int noOfStalls;
    private Double rentPerStall;

    public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls,Double rentPerStall){
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    @Override
    public Double calculateAmount() {
        return noOfStalls*rentPerStall;
    }
}

class StageEvent extends Event{
    private int noOfShows;
    private double costPerShow;

    public StageEvent(String name, String detail, String type, String organiser, Integer noOfShows,Double costPerShow){
        super(name, detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    @Override
    public Double calculateAmount() {
        return noOfShows*costPerShow;
    }
}

public class Main {
    public static <ArrayList> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter your choice\n" +
                    "1.Exhibition\n" +
                    "2.StageEvent");
            int choice = sc.nextInt();

            if (choice == 1){
                System.out.println("Enter the details in CSV format");
                String userInput = sc.next();
                List<String> elements = Arrays.asList(userInput.split(","));

                Exhibition obj1 = new Exhibition(elements.get(0), elements.get(1), elements.get(2), elements.get(3),
                        Integer.parseInt(elements.get(4)), Double.parseDouble(elements.get(5)));

                System.out.println("Exhibition Details" +
                        "\nEvent Name:"+ obj1.name +
                        "\nDetail:"+ obj1.detail +
                        "\nType:"+ obj1.type +
                        "\nOrganiser Name:"+ obj1.organiser +
                        "\nTotal Cost:"+ obj1.calculateAmount());
            }
            else if (choice == 2) {
                System.out.println("Enter the details in CSV format");
                String userInput = sc.next();
                String[] elements = userInput.split(",");

                StageEvent obj2 = new StageEvent(elements[0], elements[1], elements[2], elements[3],
                        Integer.parseInt(elements[4]), Double.parseDouble(elements[5]));

                System.out.println("StageEvent Details" +
                        "\nEvent Name:"+ obj2.name +
                        "\nDetail:"+ obj2.detail +
                        "\nType:"+ obj2.type +
                        "\nOrganiser Name:"+ obj2.organiser +
                        "\nTotal Cost:"+ obj2.calculateAmount());
            }
            else {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}