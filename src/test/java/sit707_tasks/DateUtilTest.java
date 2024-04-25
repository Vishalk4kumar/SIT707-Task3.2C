package sit707_tasks;

import java.util.Random;


import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222342946";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Vishal Kumar";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
    public void testDayD1Increment() {
        DateUtil date = new DateUtil(15, 1, 2024); // Day between 1 to 28
        date.increment();
        Assert.assertEquals(16, date.getDay());
    }

    @Test
    public void testDayD1Decrement() {
        DateUtil date = new DateUtil(15, 1, 2024); // Day between 1 to 28
        date.decrement();
        Assert.assertEquals(14, date.getDay());
    }

    @Test
    public void testDayD2Increment() {
        DateUtil date = new DateUtil(29, 2, 2024); // 29th day of February
        date.increment();
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testDayD3Increment() {
        DateUtil date = new DateUtil(30, 4, 2024); // 30th day of April
        date.increment();
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testDayD4Increment() {
        DateUtil date = new DateUtil(31, 1, 2024); // 31st day of January
        date.increment();
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMonthM1Increment() {
        DateUtil date = new DateUtil(30, 4, 2024); // April (30 days)
        date.increment();
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMonthM1Decrement() {
        DateUtil date = new DateUtil(30, 4, 2024); // April (30 days)
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testMonthM2Increment() {
        DateUtil date = new DateUtil(31, 1, 2024); // January (31 days)
        date.increment();
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMonthM2Decrement() {
        DateUtil date = new DateUtil(31, 1, 2024); // January (31 days)
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testMonthM3Increment() {
        DateUtil date = new DateUtil(28, 2, 2024); // February in a leap year
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testMonthM3Decrement() {
        DateUtil date = new DateUtil(1, 3, 2024); // March in a leap year
        date.decrement();
        Assert.assertEquals(29, date.getDay()); // February 29th in a leap year
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testYearY1Increment() {
        DateUtil date = new DateUtil(31, 12, 2021); // Year without leap year
        date.increment();
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2022, date.getYear());
    }

    @Test
    public void testYearY1Decrement() {
        DateUtil date = new DateUtil(1, 1, 2021); // Year without leap year
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2020, date.getYear());
    }

    @Test
    public void testYearY2Increment() {
        DateUtil date = new DateUtil(31, 12, 2024); // Year with leap year
        date.increment();
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2025, date.getYear());
    }

    @Test
    public void testYearY2Decrement() {
        DateUtil date = new DateUtil(1, 1, 2024); // Year with leap year
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
}
