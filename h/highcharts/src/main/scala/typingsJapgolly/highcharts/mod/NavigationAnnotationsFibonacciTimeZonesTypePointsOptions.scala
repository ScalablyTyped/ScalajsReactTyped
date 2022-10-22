package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsFibonacciTimeZonesTypePointsOptions extends StObject {
  
  var controlPoint: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.undefined
}
object NavigationAnnotationsFibonacciTimeZonesTypePointsOptions {
  
  inline def apply(): NavigationAnnotationsFibonacciTimeZonesTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsFibonacciTimeZonesTypePointsOptions]
  }
  
  extension [Self <: NavigationAnnotationsFibonacciTimeZonesTypePointsOptions](x: Self) {
    
    inline def setControlPoint(value: Double): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
    
    inline def setControlPointUndefined: Self = StObject.set(x, "controlPoint", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
