package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.Stepper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofStepper extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Stepper
  
  /* static member */
  var fn: Stepper
}
object TypeofStepper {
  
  inline def apply(extend: js.Object => Stepper, fn: Stepper): TypeofStepper = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStepper]
  }
  
  extension [Self <: TypeofStepper](x: Self) {
    
    inline def setExtend(value: js.Object => Stepper): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Stepper): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
