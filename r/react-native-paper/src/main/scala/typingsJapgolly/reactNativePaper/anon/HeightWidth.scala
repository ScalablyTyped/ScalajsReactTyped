package typingsJapgolly.reactNativePaper.anon

import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightWidth extends StObject {
  
  var height: AnimatedInterpolation[Double | String]
  
  var width: typingsJapgolly.reactNative.mod.Animated.Value
}
object HeightWidth {
  
  inline def apply(
    height: AnimatedInterpolation[Double | String],
    width: typingsJapgolly.reactNative.mod.Animated.Value
  ): HeightWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightWidth]
  }
  
  extension [Self <: HeightWidth](x: Self) {
    
    inline def setHeight(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: typingsJapgolly.reactNative.mod.Animated.Value): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
