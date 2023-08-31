public class CashProvider {
    private long card;
    private long hashCard;
    private boolean isAuthorization;

    public CashProvider(long card, long hashCard) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = false; // По умолчанию авторизация не выполнена
    }

    public void authorization(Customer customer) {
        // логика для выполнения авторизации платежа
        // Например, проверка учетных данных покупателя и карты
        // установка флага isAuthorization в true при успешной авторизации
    }

    public void buy(double price) {
        // Здесь может быть логика для проведения покупки с использованием карты
        // Может быть проверка наличия средств, списание средств и др.
    }

    public boolean cardHasFunds(double amount) {
        // логика для проверки, достаточно ли средств на карте
        // Например, сравнение суммы с доступным балансом карты
        return false; // Замените на логику проверки баланса карты
    }

}
