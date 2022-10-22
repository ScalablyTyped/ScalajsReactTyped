package typingsJapgolly.formatjsEcma402Abstract.anon

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyDigitsData extends StObject {
  
  var currencyDigitsData: Record[String, Double]
}
object CurrencyDigitsData {
  
  inline def apply(currencyDigitsData: Record[String, Double]): CurrencyDigitsData = {
    val __obj = js.Dynamic.literal(currencyDigitsData = currencyDigitsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyDigitsData]
  }
  
  extension [Self <: CurrencyDigitsData](x: Self) {
    
    inline def setCurrencyDigitsData(value: Record[String, Double]): Self = StObject.set(x, "currencyDigitsData", value.asInstanceOf[js.Any])
  }
}
