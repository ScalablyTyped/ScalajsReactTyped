package typingsJapgolly.chartist.distCoreTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartRect extends StObject {
  
  def height(): Double
  
  var padding: ChartPadding
  
  def width(): Double
  
  var x1: Double
  
  var x2: Double
  
  var y1: Double
  
  var y2: Double
}
object ChartRect {
  
  inline def apply(
    height: CallbackTo[Double],
    padding: ChartPadding,
    width: CallbackTo[Double],
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): ChartRect = {
    val __obj = js.Dynamic.literal(height = height.toJsFn, padding = padding.asInstanceOf[js.Any], width = width.toJsFn, x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartRect]
  }
  
  extension [Self <: ChartRect](x: Self) {
    
    inline def setHeight(value: CallbackTo[Double]): Self = StObject.set(x, "height", value.toJsFn)
    
    inline def setPadding(value: ChartPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: CallbackTo[Double]): Self = StObject.set(x, "width", value.toJsFn)
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
