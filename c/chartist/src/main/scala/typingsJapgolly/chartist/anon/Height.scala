package typingsJapgolly.chartist.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  def height(): Double
  
  var padding: Bottom
  
  def width(): Double
  
  var x1: Double
  
  var x2: Double
  
  var y1: Double
  
  var y2: Double
}
object Height {
  
  inline def apply(
    height: CallbackTo[Double],
    padding: Bottom,
    width: CallbackTo[Double],
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): Height = {
    val __obj = js.Dynamic.literal(height = height.toJsFn, padding = padding.asInstanceOf[js.Any], width = width.toJsFn, x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: CallbackTo[Double]): Self = StObject.set(x, "height", value.toJsFn)
    
    inline def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: CallbackTo[Double]): Self = StObject.set(x, "width", value.toJsFn)
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
