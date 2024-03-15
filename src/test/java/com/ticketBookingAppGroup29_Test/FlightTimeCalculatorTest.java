public class FlightTimeCalculatorTest {
    @Test
    void calculateTotalFlightTime_ShouldCalculateTime_WhenGivenFlights() {
        FlightTimeCalculator calculator = new FlightTimeCalculator();
        Duration totalDuration = calculator.calculateTotalFlightTime(mockFlightList());
        assertNotNull(totalDuration);
    }
}
