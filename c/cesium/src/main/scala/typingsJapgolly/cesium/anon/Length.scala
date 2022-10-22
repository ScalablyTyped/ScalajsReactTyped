package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var bottomRadius: Double
  
  var length: Double
  
  var numberOfVerticalLines: js.UndefOr[Double] = js.undefined
  
  var slices: js.UndefOr[Double] = js.undefined
  
  var topRadius: Double
}
object Length {
  
  inline def apply(bottomRadius: Double, length: Double, topRadius: Double): Length = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setBottomRadius(value: Double): Self = StObject.set(x, "bottomRadius", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNumberOfVerticalLines(value: Double): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
    
    inline def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setTopRadius(value: Double): Self = StObject.set(x, "topRadius", value.asInstanceOf[js.Any])
  }
}
