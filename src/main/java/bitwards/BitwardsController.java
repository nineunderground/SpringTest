package bitwards;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bitwards.request.BitwardsRestClientImpl;
import bitwards.response.BitwardsResponse;

@RestController
public class BitwardsController {

	/**
	 * Call two clients and combine into same response object
	 * @param cityName City name to check weather from
	 * @param daysForecast Number of days considered for forecast
	 * @return Combined JSON formatted text
	 */
    @RequestMapping("/bitwards")
    public BitwardsResponse getCombinedRequest( 	@RequestParam(value="city", defaultValue="Seatle") String cityName, 
    							@RequestParam(value="days", defaultValue="7") Long daysForecast
    							) {
    	BitwardsRestClientImpl restFulClient = new BitwardsRestClientImpl(cityName, daysForecast);
    	return restFulClient.getResponse(); 	
    }

}
