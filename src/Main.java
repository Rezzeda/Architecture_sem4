import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты CashProvider, Customer и TicketProvider
        CashProvider cashProvider = new CashProvider(123456789, 987654321);
        Customer customer = new Customer(1);
        customer.setCash(cashProvider);
        TicketProvider ticketProvider = new TicketProvider();

        // Создаем билет
        LocalDateTime eventDate = LocalDateTime.of(2023, 9, 1, 18, 0);
        Ticket ticket = new Ticket(1, 50.0, 101, eventDate);

        // Добавляем билет в TicketProvider
        ticketProvider.addTicket(ticket);

        // Покупка билета покупателем
        if (customer.buyTicket(ticket)) {
            System.out.println("Билет успешно куплен!");
        } else {
            System.out.println("Ошибка покупки билета.");
        }

        // Поиск билетов у покупателя
        LocalDateTime searchDate = LocalDateTime.of(2023, 9, 1, 0, 0);
        long searchRootNumber = 1;
        List<Ticket> foundTickets = customer.search(searchDate, searchRootNumber);
        if (foundTickets.isEmpty()) {
            System.out.println("Билеты не найдены.");
        } else {
            System.out.println("Найдены следующие билеты:");
            for (Ticket foundTicket : foundTickets) {
                System.out.println("Билет с номером места " + foundTicket.getPlace());
            }
        }
    }
}
