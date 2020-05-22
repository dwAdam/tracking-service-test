import org.junit.Test;

import com.simpleprogrammer.proteintracker.TrackingService;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class TrackingServiceTest {
	
	private TrackingService service;
	
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
	public void WhenAddigProteinTotalIncreasesByThatAmount() {
		service.addProtein(10);
		assertEquals(10, service.getTotal());
	}
	
	@Test
	public void WhenRemovingProteinTotalRemainsZero() {
		service.removeProtein(5); // Act.21
		assertEquals(0, service.getTotal());
	}
	
}
