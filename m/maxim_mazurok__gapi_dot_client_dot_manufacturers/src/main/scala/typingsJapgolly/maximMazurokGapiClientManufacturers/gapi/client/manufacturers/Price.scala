package typingsJapgolly.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  /** The numeric value of the price. */
  var amount: js.UndefOr[String] = js.undefined
  
  /** The currency in which the price is denoted. */
  var currency: js.UndefOr[String] = js.undefined
}
object Price {
  
  inline def apply(): Price = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Price]
  }
  
  extension [Self <: Price](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
