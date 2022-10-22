package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single data value, including the error
  *
  * This struct is currently used nowhere.
  * @deprecated Deprecated
  */
trait ChartDataValue extends StObject {
  
  /** highest possible error value. */
  var HighError: Double
  
  /** lowest possible error value. */
  var LowError: Double
  
  /** value by itself. */
  var Value: Double
}
object ChartDataValue {
  
  inline def apply(HighError: Double, LowError: Double, Value: Double): ChartDataValue = {
    val __obj = js.Dynamic.literal(HighError = HighError.asInstanceOf[js.Any], LowError = LowError.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataValue]
  }
  
  extension [Self <: ChartDataValue](x: Self) {
    
    inline def setHighError(value: Double): Self = StObject.set(x, "HighError", value.asInstanceOf[js.Any])
    
    inline def setLowError(value: Double): Self = StObject.set(x, "LowError", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
