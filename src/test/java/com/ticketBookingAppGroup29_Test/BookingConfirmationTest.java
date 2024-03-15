public class BookingConfirmationTest {
    @Test
    void displayConfirmation_ShouldShowDetails_WhenBookingIsConfirmed() {
        BookingConfirmation confirmation = new BookingConfirmation();
        confirmation.displayConfirmation(mockBookingDetails());
        assertTrue(confirmation.isDisplayed());
    }
}
