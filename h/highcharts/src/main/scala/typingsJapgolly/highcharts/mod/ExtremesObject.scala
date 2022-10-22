package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtremesObject extends StObject {
  
  /**
    * The maximum value of the axis' associated series.
    */
  var dataMax: Double
  
  /**
    * The minimum value of the axis' associated series.
    */
  var dataMin: Double
  
  /**
    * The maximum axis value, either automatic or set manually. If the `max`
    * option is not set, `maxPadding` is 0 and `endOnTick` is false, this value
    * will be the same as `dataMax`.
    */
  var max: Double
  
  /**
    * The minimum axis value, either automatic or set manually. If the `min`
    * option is not set, `minPadding` is 0 and `startOnTick` is false, this
    * value will be the same as `dataMin`.
    */
  var min: Double
  
  /**
    * The user defined maximum, either from the `max` option or from a zoom or
    * `setExtremes` action.
    */
  var userMax: Double
  
  /**
    * The user defined minimum, either from the `min` option or from a zoom or
    * `setExtremes` action.
    */
  var userMin: Double
}
object ExtremesObject {
  
  inline def apply(dataMax: Double, dataMin: Double, max: Double, min: Double, userMax: Double, userMin: Double): ExtremesObject = {
    val __obj = js.Dynamic.literal(dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], userMax = userMax.asInstanceOf[js.Any], userMin = userMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtremesObject]
  }
  
  extension [Self <: ExtremesObject](x: Self) {
    
    inline def setDataMax(value: Double): Self = StObject.set(x, "dataMax", value.asInstanceOf[js.Any])
    
    inline def setDataMin(value: Double): Self = StObject.set(x, "dataMin", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setUserMax(value: Double): Self = StObject.set(x, "userMax", value.asInstanceOf[js.Any])
    
    inline def setUserMin(value: Double): Self = StObject.set(x, "userMin", value.asInstanceOf[js.Any])
  }
}
