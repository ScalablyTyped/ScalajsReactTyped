package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.RangeSlider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRangeSlider extends StObject {
  
  /* static member */
  def extend(proto: js.Object): RangeSlider
  
  /* static member */
  var fn: RangeSlider
}
object TypeofRangeSlider {
  
  inline def apply(extend: js.Object => RangeSlider, fn: RangeSlider): TypeofRangeSlider = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRangeSlider]
  }
  
  extension [Self <: TypeofRangeSlider](x: Self) {
    
    inline def setExtend(value: js.Object => RangeSlider): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: RangeSlider): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
