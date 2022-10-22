package typingsJapgolly.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectangleOptions extends StObject {
  
  var color: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var dash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var fill: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var rotationOrigin: js.UndefOr[js.Array[Double]] = js.undefined
  
  var stroke: js.UndefOr[String | js.Array[Double]] = js.undefined
}
object RectangleOptions {
  
  inline def apply(): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectangleOptions]
  }
  
  extension [Self <: RectangleOptions](x: Self) {
    
    inline def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDash(value: js.Array[Double]): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setDashVarargs(value: Double*): Self = StObject.set(x, "dash", js.Array(value*))
    
    inline def setFill(value: String | js.Array[Double]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: Double*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationOrigin(value: js.Array[Double]): Self = StObject.set(x, "rotationOrigin", value.asInstanceOf[js.Any])
    
    inline def setRotationOriginUndefined: Self = StObject.set(x, "rotationOrigin", js.undefined)
    
    inline def setRotationOriginVarargs(value: Double*): Self = StObject.set(x, "rotationOrigin", js.Array(value*))
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setStroke(value: String | js.Array[Double]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeVarargs(value: Double*): Self = StObject.set(x, "stroke", js.Array(value*))
  }
}
