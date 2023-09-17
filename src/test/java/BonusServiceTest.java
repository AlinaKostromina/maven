import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        org.example.BonusService service = new org.example.BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        // здесь пришлось писать путь, надо было создать BonusServiceTest также в папке test/java?
        org.example.BonusService service = new org.example.BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    // новые тесты

    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        org.example.BonusService service = new org.example.BonusService();

        // подготавливаем данные:
        long amount = 2000;
        boolean registered = false;
        long expected = 20;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndOverLimit() {
        // здесь пришлось писать путь, надо было создать BonusServiceTest также в папке test/java?
        org.example.BonusService service = new org.example.BonusService();

        // подготавливаем данные:
        long amount = 50_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
