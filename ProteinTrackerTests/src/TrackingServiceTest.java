import org.junit.Test;

import com.simpleprogrammer.proteintracker.InvalidGoalException;
import com.simpleprogrammer.proteintracker.TrackingService;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class TrackingServiceTest {
	
	private TrackingService service;
	
	@BeforeClass
	public static void before() {
		System.out.println("Test --> BeforeClass");
	}
	
	@AfterClass
	public static void after() {
		System.out.println("Test --> AfterClass");
	}
	
	@Before
	public void setUp() {
		System.out.println("Test --> Before"); // Act.21
		service = new TrackingService();
	}
	
	@After
	public void tearDown() {
		System.out.println("Test --> After"); // Act.22
	}
	
	@Test
	public void NewTrackingServiceTotalIsZero() {
		assertEquals("Tracking service total was not Zero.", 0, service.getTotal()); // Act.18
	}
	
	@Test
	@Ignore // Act. 25
	public void WhenAddigProteinTotalIncreasesByThatAmount() {
		service.addProtein(10);
		assertEquals(10, service.getTotal());
	}
	
	@Test
	public void WhenRemovingProteinTotalRemainsZero() {
		service.removeProtein(5); // Act.21
		assertEquals(0, service.getTotal());
	}
	
	@Test(expected = InvalidGoalException.class)
	public void WhenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {
		service.setGoal(-5); // Act. 27
	}
	
	@Test(timeout = 200) // Act. 29
	public void BadTest() {
		for (int i = 0; i < 10000000; i++) { // 10 000 000
			service.addProtein(1);
		}
	}
}
