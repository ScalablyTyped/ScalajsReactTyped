package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue extends StObject {
  
  /** Double value. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /** Integer value. */
  var int64Value: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue](x: Self) {
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
  }
}
