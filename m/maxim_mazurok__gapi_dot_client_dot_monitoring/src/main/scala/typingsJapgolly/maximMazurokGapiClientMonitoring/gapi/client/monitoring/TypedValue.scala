package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedValue extends StObject {
  
  /** A Boolean value: true or false. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.undefined
  
  /** A 64-bit double-precision floating-point number. Its magnitude is approximately ±10±300 and it has 16 significant digits of precision. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /** A 64-bit integer. Its range is approximately ±9.2x1018. */
  var int64Value: js.UndefOr[String] = js.undefined
  
  /** A variable-length string value. */
  var stringValue: js.UndefOr[String] = js.undefined
}
object TypedValue {
  
  inline def apply(): TypedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedValue]
  }
  
  extension [Self <: TypedValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDistributionValue(value: Distribution): Self = StObject.set(x, "distributionValue", value.asInstanceOf[js.Any])
    
    inline def setDistributionValueUndefined: Self = StObject.set(x, "distributionValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
