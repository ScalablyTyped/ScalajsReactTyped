package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.esComponentsRadioRadioMod.RadioValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  def check(`val`: RadioValue): Unit
  
  var disabled: Boolean
  
  def uncheck(`val`: RadioValue): Unit
  
  var value: js.Array[RadioValue]
}
object Disabled {
  
  inline def apply(
    check: RadioValue => Callback,
    disabled: Boolean,
    uncheck: RadioValue => Callback,
    value: js.Array[RadioValue]
  ): Disabled = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1((t0: RadioValue) => check(t0).runNow()), disabled = disabled.asInstanceOf[js.Any], uncheck = js.Any.fromFunction1((t0: RadioValue) => uncheck(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setCheck(value: RadioValue => Callback): Self = StObject.set(x, "check", js.Any.fromFunction1((t0: RadioValue) => value(t0).runNow()))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setUncheck(value: RadioValue => Callback): Self = StObject.set(x, "uncheck", js.Any.fromFunction1((t0: RadioValue) => value(t0).runNow()))
    
    inline def setValue(value: js.Array[RadioValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: RadioValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
