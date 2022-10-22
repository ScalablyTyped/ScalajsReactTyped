package typingsJapgolly.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpotPriceOpts extends StObject {
  
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String
  
  /**
    * Specify date for historic spot price in format YYYY-MM-DD (UTC)
    */
  var date: js.UndefOr[String] = js.undefined
}
object GetSpotPriceOpts {
  
  inline def apply(currencyPair: String): GetSpotPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpotPriceOpts]
  }
  
  extension [Self <: GetSpotPriceOpts](x: Self) {
    
    inline def setCurrencyPair(value: String): Self = StObject.set(x, "currencyPair", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
