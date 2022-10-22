package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNative.mod.ProcessedColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: js.Array[js.UndefOr[ProcessedColorValue | Null]]
}
object Colors {
  
  inline def apply(colors: js.Array[js.UndefOr[ProcessedColorValue | Null]]): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  extension [Self <: Colors](x: Self) {
    
    inline def setColors(value: js.Array[js.UndefOr[ProcessedColorValue | Null]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: (js.UndefOr[ProcessedColorValue | Null])*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
