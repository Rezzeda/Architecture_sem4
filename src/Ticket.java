import java.time.LocalDateTime;

public class Ticket {
    private long rootNumber;
    private double price;
    private Integer place;
    private LocalDateTime date;
    private boolean isValid;

    public Ticket(long rootNumber, double price, Integer place, LocalDateTime date) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = true; // Новый билет по умолчанию действителен
    }

    public long getRootNumber() {
        return rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public Integer getPlace() {
        return place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public boolean isValid() {
        return isValid;
    }

    public void cancel() {
        isValid = false;
    }

}

