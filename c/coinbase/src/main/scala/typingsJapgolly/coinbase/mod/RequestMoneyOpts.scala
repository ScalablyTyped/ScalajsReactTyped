package typingsJapgolly.coinbase.mod

import typingsJapgolly.coinbase.coinbaseStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMoneyOpts extends StObject {
  
  /**
    * Amount to be transferred
    */
  var amount: String
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  
  /**
    * Notes to be included in the email that the recipient receives
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An email of the recipient
    */
  var to: String
  
  /**
    * Type request is required when sending money
    */
  var `type`: request
}
object RequestMoneyOpts {
  
  inline def apply(amount: String, currency: String, to: String): RequestMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[RequestMoneyOpts]
  }
  
  extension [Self <: RequestMoneyOpts](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setType(value: request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
