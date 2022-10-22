package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IZoom extends StObject {
  
  var active: Boolean
  
  var chart: IChart
  
  var direction: String
  
  var enabled: Boolean
  
  var format: IFormat
  
  var mouseButton: Double
  
  def reset(): Unit
}
object IZoom {
  
  inline def apply(
    active: Boolean,
    chart: IChart,
    direction: String,
    enabled: Boolean,
    format: IFormat,
    mouseButton: Double,
    reset: Callback
  ): IZoom = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], mouseButton = mouseButton.asInstanceOf[js.Any], reset = reset.toJsFn)
    __obj.asInstanceOf[IZoom]
  }
  
  extension [Self <: IZoom](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMouseButton(value: Double): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
