package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.RadioButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadioButton extends StObject {
  
  /* static member */
  def extend(proto: js.Object): RadioButton
  
  /* static member */
  var fn: RadioButton
}
object TypeofRadioButton {
  
  inline def apply(extend: js.Object => RadioButton, fn: RadioButton): TypeofRadioButton = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadioButton]
  }
  
  extension [Self <: TypeofRadioButton](x: Self) {
    
    inline def setExtend(value: js.Object => RadioButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: RadioButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
