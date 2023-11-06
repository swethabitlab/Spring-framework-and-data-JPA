package secondpgm;

public class Payment {
  private CreditCard crdcard;
  
 
public void setCrdcard(CreditCard crdcard) {
	this.crdcard = crdcard;
}

public String dopayment() {
	return crdcard.paybill();
  }
}
