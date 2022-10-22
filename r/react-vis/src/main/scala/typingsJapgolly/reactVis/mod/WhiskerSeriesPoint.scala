package typingsJapgolly.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhiskerSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var opacity: js.UndefOr[String | Double] = js.undefined
  
  var size: js.UndefOr[String | Double] = js.undefined
  
  var stroke: js.UndefOr[String | Double] = js.undefined
  
  var x: String | Double | js.Date
  
  var xVariance: js.UndefOr[String | Double] = js.undefined
  
  var y: String | Double | js.Date
  
  var yVariance: js.UndefOr[String | Double] = js.undefined
}
object WhiskerSeriesPoint {
  
  inline def apply(x: String | Double | js.Date, y: String | Double | js.Date): WhiskerSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiskerSeriesPoint]
  }
  
  extension [Self <: WhiskerSeriesPoint](x: Self) {
    
    inline def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setX(value: String | Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVariance(value: String | Double): Self = StObject.set(x, "xVariance", value.asInstanceOf[js.Any])
    
    inline def setXVarianceUndefined: Self = StObject.set(x, "xVariance", js.undefined)
    
    inline def setY(value: String | Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVariance(value: String | Double): Self = StObject.set(x, "yVariance", value.asInstanceOf[js.Any])
    
    inline def setYVarianceUndefined: Self = StObject.set(x, "yVariance", js.undefined)
  }
}
