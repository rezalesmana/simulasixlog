package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirwayBillController {
	
	@Autowired
	private AirwayBillService airwayBillService;
	
	@RequestMapping("/airwayBill/{airwayBillNumber}")
    public AirwayBill airwayBillInfo(@PathVariable("airwayBillNumber") String airwayBillNumber) {
        return airwayBillService.getAirwayBillInfo(airwayBillNumber);
    }

}
