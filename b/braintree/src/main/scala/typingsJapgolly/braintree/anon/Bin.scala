package typingsJapgolly.braintree.anon

import typingsJapgolly.braintree.mod.HealthCare
import typingsJapgolly.braintree.mod.Payroll
import typingsJapgolly.braintree.mod.Prepaid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bin extends StObject {
  
  var bin: String
  
  var cardType: String
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var commercial: typingsJapgolly.braintree.mod.Commercial
  
  var countryOfIssuance: String
  
  var customerLocation: typingsJapgolly.braintree.mod.CustomerLocation
  
  var debit: String
  
  var durbinRegulated: typingsJapgolly.braintree.mod.DurbinRegulated
  
  var expirationDate: js.UndefOr[String] = js.undefined
  
  var expirationMonth: js.UndefOr[String] = js.undefined
  
  var expirationYear: js.UndefOr[String] = js.undefined
  
  var healthcare: HealthCare
  
  var issuingBank: String
  
  var last4: String
  
  var payroll: Payroll
  
  var prepaid: Prepaid
  
  var productId: String
  
  var token: String
  
  var uniqueNumberIdentifier: String
}
object Bin {
  
  inline def apply(
    bin: String,
    cardType: String,
    commercial: typingsJapgolly.braintree.mod.Commercial,
    countryOfIssuance: String,
    customerLocation: typingsJapgolly.braintree.mod.CustomerLocation,
    debit: String,
    durbinRegulated: typingsJapgolly.braintree.mod.DurbinRegulated,
    healthcare: HealthCare,
    issuingBank: String,
    last4: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    token: String,
    uniqueNumberIdentifier: String
  ): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uniqueNumberIdentifier = uniqueNumberIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  extension [Self <: Bin](x: Self) {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    inline def setCommercial(value: typingsJapgolly.braintree.mod.Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setCustomerLocation(value: typingsJapgolly.braintree.mod.CustomerLocation): Self = StObject.set(x, "customerLocation", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: String): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulated(value: typingsJapgolly.braintree.mod.DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    inline def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    inline def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    inline def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUniqueNumberIdentifier(value: String): Self = StObject.set(x, "uniqueNumberIdentifier", value.asInstanceOf[js.Any])
  }
}
