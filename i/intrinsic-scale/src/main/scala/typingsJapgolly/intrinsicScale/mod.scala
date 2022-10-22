package typingsJapgolly.intrinsicScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intrinsic-scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contain(parentWidth: Double, parentHeight: Double, childWidth: Double, childHeight: Double): IntrinsicScale = (^.asInstanceOf[js.Dynamic].applyDynamic("contain")(parentWidth.asInstanceOf[js.Any], parentHeight.asInstanceOf[js.Any], childWidth.asInstanceOf[js.Any], childHeight.asInstanceOf[js.Any])).asInstanceOf[IntrinsicScale]
  
  inline def cover(parentWidth: Double, parentHeight: Double, childWidth: Double, childHeight: Double): IntrinsicScale = (^.asInstanceOf[js.Dynamic].applyDynamic("cover")(parentWidth.asInstanceOf[js.Any], parentHeight.asInstanceOf[js.Any], childWidth.asInstanceOf[js.Any], childHeight.asInstanceOf[js.Any])).asInstanceOf[IntrinsicScale]
  
  trait IntrinsicScale extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object IntrinsicScale {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): IntrinsicScale = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntrinsicScale]
    }
    
    extension [Self <: IntrinsicScale](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
