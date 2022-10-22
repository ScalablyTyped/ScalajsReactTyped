package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.esComponentsCheckboxCheckboxMod.CheckboxValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  def check(`val`: CheckboxValue): Unit
  
  var disabled: Boolean
  
  def uncheck(`val`: CheckboxValue): Unit
  
  var value: js.Array[CheckboxValue]
}
object Check {
  
  inline def apply(
    check: CheckboxValue => Callback,
    disabled: Boolean,
    uncheck: CheckboxValue => Callback,
    value: js.Array[CheckboxValue]
  ): Check = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1((t0: CheckboxValue) => check(t0).runNow()), disabled = disabled.asInstanceOf[js.Any], uncheck = js.Any.fromFunction1((t0: CheckboxValue) => uncheck(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
  
  extension [Self <: Check](x: Self) {
    
    inline def setCheck(value: CheckboxValue => Callback): Self = StObject.set(x, "check", js.Any.fromFunction1((t0: CheckboxValue) => value(t0).runNow()))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setUncheck(value: CheckboxValue => Callback): Self = StObject.set(x, "uncheck", js.Any.fromFunction1((t0: CheckboxValue) => value(t0).runNow()))
    
    inline def setValue(value: js.Array[CheckboxValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: CheckboxValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
