package typingsJapgolly.chartJs.anon

import typingsJapgolly.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  /**
    * User defined count of ticks
    */
  var count: Double
  
  /**
    * The Intl.NumberFormat options used by the default label formatter
    */
  var format: NumberFormatOptions
  
  /**
    * if defined and stepSize is not specified, the step size will be rounded to this many decimal places.
    */
  var precision: Double
  
  /**
    * User defined fixed step size for the scale
    */
  var stepSize: Double
}
object Count {
  
  inline def apply(count: Double, format: NumberFormatOptions, precision: Double, stepSize: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: NumberFormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
  }
}
