/**
 * 
 */
package hello;

import java.math.BigDecimal;

/**
 * @author reza.lesmana
 *
 */
public class AirwayBill {
	
	private String airwayBillNumber;
	private String airwayBillStatus;
	private BigDecimal pricePerKg;
	private BigDecimal weight;
	private BigDecimal insuranceCharge;
	private BigDecimal giftWrapCharge;
	private BigDecimal otherCharge;
	private BigDecimal totalCharge;

	
	public String getAirwayBillNumber() {
		return airwayBillNumber;
	}
	public void setAirwayBillNumber(String airwayBillNumber) {
		this.airwayBillNumber = airwayBillNumber;
	}
	public BigDecimal getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(BigDecimal pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public BigDecimal getInsuranceCharge() {
		return insuranceCharge;
	}
	public void setInsuranceCharge(BigDecimal insuranceCharge) {
		this.insuranceCharge = insuranceCharge;
	}
	public BigDecimal getGiftWrapCharge() {
		return giftWrapCharge;
	}
	public void setGiftWrapCharge(BigDecimal giftWrapCharge) {
		this.giftWrapCharge = giftWrapCharge;
	}
	public BigDecimal getOtherCharge() {
		return otherCharge;
	}
	public void setOtherCharge(BigDecimal otherCharge) {
		this.otherCharge = otherCharge;
	}
	public BigDecimal getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(BigDecimal totalCharge) {
		this.totalCharge = totalCharge;
	}
	public String getAirwayBillStatus() {
		return airwayBillStatus;
	}
	public void setAirwayBillStatus(String airwayBillStatus) {
		this.airwayBillStatus = airwayBillStatus;
	}


	@Override
	public String toString() {
		return "AirwayBill [airwayBillNumber=" + airwayBillNumber + ", pricePerKg=" + pricePerKg + ", weight=" + weight
				+ ", insuranceCharge=" + insuranceCharge + ", giftWrapCharge=" + giftWrapCharge + ", otherCharge="
				+ otherCharge + ", totalCharge=" + totalCharge + ", airwayBillStatus=" + airwayBillStatus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airwayBillNumber == null) ? 0 : airwayBillNumber.hashCode());
		result = prime * result + ((airwayBillStatus == null) ? 0 : airwayBillStatus.hashCode());
		result = prime * result + ((giftWrapCharge == null) ? 0 : giftWrapCharge.hashCode());
		result = prime * result + ((insuranceCharge == null) ? 0 : insuranceCharge.hashCode());
		result = prime * result + ((otherCharge == null) ? 0 : otherCharge.hashCode());
		result = prime * result + ((pricePerKg == null) ? 0 : pricePerKg.hashCode());
		result = prime * result + ((totalCharge == null) ? 0 : totalCharge.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirwayBill other = (AirwayBill) obj;
		if (airwayBillNumber == null) {
			if (other.airwayBillNumber != null)
				return false;
		} else if (!airwayBillNumber.equals(other.airwayBillNumber))
			return false;
		if (airwayBillStatus == null) {
			if (other.airwayBillStatus != null)
				return false;
		} else if (!airwayBillStatus.equals(other.airwayBillStatus))
			return false;
		if (giftWrapCharge == null) {
			if (other.giftWrapCharge != null)
				return false;
		} else if (!giftWrapCharge.equals(other.giftWrapCharge))
			return false;
		if (insuranceCharge == null) {
			if (other.insuranceCharge != null)
				return false;
		} else if (!insuranceCharge.equals(other.insuranceCharge))
			return false;
		if (otherCharge == null) {
			if (other.otherCharge != null)
				return false;
		} else if (!otherCharge.equals(other.otherCharge))
			return false;
		if (pricePerKg == null) {
			if (other.pricePerKg != null)
				return false;
		} else if (!pricePerKg.equals(other.pricePerKg))
			return false;
		if (totalCharge == null) {
			if (other.totalCharge != null)
				return false;
		} else if (!totalCharge.equals(other.totalCharge))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}
}
