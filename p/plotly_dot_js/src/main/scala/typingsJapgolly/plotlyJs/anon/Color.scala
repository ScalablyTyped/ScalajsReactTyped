package typingsJapgolly.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: typingsJapgolly.plotlyJs.mod.Color
  
  var range: js.Array[Double]
}
object Color {
  
  inline def apply(color: typingsJapgolly.plotlyJs.mod.Color, range: js.Array[Double]): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
  }
}
