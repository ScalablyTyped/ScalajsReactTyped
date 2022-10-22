package typingsJapgolly.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalBarSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var fill: js.UndefOr[String | Double] = js.undefined
  
  var opacity: js.UndefOr[String | Double] = js.undefined
  
  var stroke: js.UndefOr[String | Double] = js.undefined
  
  var x: String | Double
  
  var y: String | Double
}
object HorizontalBarSeriesPoint {
  
  inline def apply(x: String | Double, y: String | Double): HorizontalBarSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalBarSeriesPoint]
  }
  
  extension [Self <: HorizontalBarSeriesPoint](x: Self) {
    
    inline def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFill(value: String | Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
