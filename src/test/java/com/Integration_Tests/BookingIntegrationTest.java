import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingIntegrationTest {

    @Test
    void testBookDirectFlight() {
        assertTrue(BookingManager.bookDirectFlight("ABC123", "2024-03-15", "08:00", "12:00"));
    }

    @Test
    void testBookRoundTrip() {
        assertTrue(BookingManager.bookRoundTrip("XYZ456", "2024-03-15", "12:00", "2024-03-20", "15:00"));
    }

    // More integration tests can be added to cover other scenarios
}

