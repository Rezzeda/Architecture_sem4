import java.time.LocalDateTime;
import java.util.List;

public class Customer {
    private int id;
    private List<Ticket> tickets;
    private CashProvider cash;

    public Customer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCash(CashProvider cash) {
        this.cash = cash;
    }

    public boolean buyTicket(Ticket ticket) {
        if (cash != null && cash.cardHasFunds(ticket.getPrice())) {
            cash.buy(ticket.getPrice());
            tickets.add(ticket);
            return true;
        }
        return false;
    }

    public List<Ticket> search(LocalDateTime date, long rootNumber) {
        // Здесь может быть логика для поиска билетов у данного покупателя
        // по заданным параметрам (дате и номеру корневого билета)
        // Возвращает список найденных билетов
        return null; // логика поиска билетов
    }

}

