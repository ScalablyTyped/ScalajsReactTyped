package typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distribution extends StObject {
  
  /** Output only. The estimated fraction (0-1) of the total market with this configuration. */
  var marketShare: js.UndefOr[Double] = js.undefined
  
  /** Output only. The time this distribution was measured. */
  var measurementTime: js.UndefOr[String] = js.undefined
}
object Distribution {
  
  inline def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  
  extension [Self <: Distribution](x: Self) {
    
    inline def setMarketShare(value: Double): Self = StObject.set(x, "marketShare", value.asInstanceOf[js.Any])
    
    inline def setMarketShareUndefined: Self = StObject.set(x, "marketShare", js.undefined)
    
    inline def setMeasurementTime(value: String): Self = StObject.set(x, "measurementTime", value.asInstanceOf[js.Any])
    
    inline def setMeasurementTimeUndefined: Self = StObject.set(x, "measurementTime", js.undefined)
  }
}
