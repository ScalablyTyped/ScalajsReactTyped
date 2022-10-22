package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeTargetingOptionDetails extends StObject {
  
  /** Output only. The type of exchange. */
  var exchange: js.UndefOr[String] = js.undefined
}
object ExchangeTargetingOptionDetails {
  
  inline def apply(): ExchangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeTargetingOptionDetails]
  }
  
  extension [Self <: ExchangeTargetingOptionDetails](x: Self) {
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
  }
}
