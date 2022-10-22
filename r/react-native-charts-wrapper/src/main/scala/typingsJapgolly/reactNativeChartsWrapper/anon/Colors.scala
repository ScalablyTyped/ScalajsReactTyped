package typingsJapgolly.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: js.UndefOr[js.Array[typingsJapgolly.reactNativeChartsWrapper.mod.Color]] = js.undefined
  
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}
object Colors {
  
  inline def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  extension [Self <: Colors](x: Self) {
    
    inline def setColors(value: js.Array[typingsJapgolly.reactNativeChartsWrapper.mod.Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: typingsJapgolly.reactNativeChartsWrapper.mod.Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
