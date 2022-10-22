package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.tabrisStrings.bottom
import typingsJapgolly.tabris.tabrisStrings.left
import typingsJapgolly.tabris.tabrisStrings.right
import typingsJapgolly.tabris.tabrisStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientLikeObject
  extends StObject
     with _LinearGradientValue {
  
  var colorStops: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])]
  
  var direction: js.UndefOr[Double | left | top | right | bottom] = js.undefined
}
object LinearGradientLikeObject {
  
  inline def apply(colorStops: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])]): LinearGradientLikeObject = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientLikeObject]
  }
  
  extension [Self <: LinearGradientLikeObject](x: Self) {
    
    inline def setColorStops(value: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsVarargs(value: (ColorValue | (js.Tuple2[ColorValue, PercentValue]))*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setDirection(value: Double | left | top | right | bottom): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
