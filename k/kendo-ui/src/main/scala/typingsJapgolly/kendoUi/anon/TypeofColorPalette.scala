package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.ColorPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofColorPalette extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ColorPalette
  
  /* static member */
  var fn: ColorPalette
}
object TypeofColorPalette {
  
  inline def apply(extend: js.Object => ColorPalette, fn: ColorPalette): TypeofColorPalette = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofColorPalette]
  }
  
  extension [Self <: TypeofColorPalette](x: Self) {
    
    inline def setExtend(value: js.Object => ColorPalette): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ColorPalette): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
