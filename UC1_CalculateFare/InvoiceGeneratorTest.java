package UC1_CalculateFare;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {

	 // this teat cae to return fare, distance and time is given

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        InvoiceGenerator invoice = new InvoiceGenerator();
        double distance =2.0;
        double time = 20.0;
        double  fare = invoice.calculateFare(distance,time);
        Assert.assertEquals(40.0, fare,0.0 );
        }

        // actual fare is 2.2, but we are passing test case for return
        // minimum fare which is 5.
    @Test
    public void givenDistanceAndTime_ShouldMinimumFare(){
        InvoiceGenerator invoice = new InvoiceGenerator();
        double distance =0.2;
        double time = 0.2;
        double  fare = invoice.calculateFare(distance,time);
        Assert.assertEquals(5.0, fare,0.0 );
    }
}
