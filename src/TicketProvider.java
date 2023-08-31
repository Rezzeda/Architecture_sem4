import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    private List<Ticket> availableTickets;

    public TicketProvider() {
        availableTickets = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket) {
        return availableTickets.add(ticket);
    }

    public boolean removeTicket(Ticket ticket) {
        return availableTickets.remove(ticket);
    }

    public List<Ticket> getTicket(long rootNumber) {
        List<Ticket> result = new ArrayList<>();
        for (Ticket ticket : availableTickets) {
            if (ticket.getRootNumber() == rootNumber) {
                result.add(ticket);
            }
        }
        return result;
    }

    public boolean updateTicketStatus(Ticket ticket) {
        // логика для обновления статуса билета
        // например, пометить билет как проданный или аннулированный
        return false; // логика обновления статуса билета
    }

}

