package typingsJapgolly.braintree.anon

import typingsJapgolly.braintree.mod.HealthCare
import typingsJapgolly.braintree.mod.Payroll
import typingsJapgolly.braintree.mod.Prepaid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debit extends StObject {
  
  var bin: String
  
  var commercial: typingsJapgolly.braintree.mod.Commercial
  
  var countryOfIssuance: String
  
  var debit: typingsJapgolly.braintree.mod.Debit
  
  var durbinRegulated: typingsJapgolly.braintree.mod.DurbinRegulated
  
  var expirationMonth: String
  
  var expirationYear: String
  
  var googleTransactionId: String
  
  var healthcare: HealthCare
  
  var imageUrl: String
  
  var payroll: Payroll
  
  var prepaid: Prepaid
  
  var productId: String
  
  var sourceCardLast4: String
  
  var sourceCardType: String
  
  var sourceDescription: String
  
  var token: String
  
  var virtualCardLast4: String
  
  var virtualCardType: String
}
object Debit {
  
  inline def apply(
    bin: String,
    commercial: typingsJapgolly.braintree.mod.Commercial,
    countryOfIssuance: String,
    debit: typingsJapgolly.braintree.mod.Debit,
    durbinRegulated: typingsJapgolly.braintree.mod.DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    googleTransactionId: String,
    healthcare: HealthCare,
    imageUrl: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    sourceCardType: String,
    sourceDescription: String,
    token: String,
    virtualCardLast4: String,
    virtualCardType: String
  ): Debit = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], googleTransactionId = googleTransactionId.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], sourceCardType = sourceCardType.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], virtualCardLast4 = virtualCardLast4.asInstanceOf[js.Any], virtualCardType = virtualCardType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debit]
  }
  
  extension [Self <: Debit](x: Self) {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setCommercial(value: typingsJapgolly.braintree.mod.Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: typingsJapgolly.braintree.mod.Debit): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulated(value: typingsJapgolly.braintree.mod.DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setGoogleTransactionId(value: String): Self = StObject.set(x, "googleTransactionId", value.asInstanceOf[js.Any])
    
    inline def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    inline def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setSourceCardLast4(value: String): Self = StObject.set(x, "sourceCardLast4", value.asInstanceOf[js.Any])
    
    inline def setSourceCardType(value: String): Self = StObject.set(x, "sourceCardType", value.asInstanceOf[js.Any])
    
    inline def setSourceDescription(value: String): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setVirtualCardLast4(value: String): Self = StObject.set(x, "virtualCardLast4", value.asInstanceOf[js.Any])
    
    inline def setVirtualCardType(value: String): Self = StObject.set(x, "virtualCardType", value.asInstanceOf[js.Any])
  }
}
