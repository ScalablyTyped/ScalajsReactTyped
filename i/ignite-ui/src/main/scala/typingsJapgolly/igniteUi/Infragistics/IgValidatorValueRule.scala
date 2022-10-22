package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgValidatorValueRule extends StObject {
  
  def getMessageType(): Unit
  
  def isValid(options: js.Object, value: js.Object): Unit
}
object IgValidatorValueRule {
  
  inline def apply(getMessageType: Callback, isValid: (js.Object, js.Object) => Callback): IgValidatorValueRule = {
    val __obj = js.Dynamic.literal(getMessageType = getMessageType.toJsFn, isValid = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (isValid(t0, t1)).runNow()))
    __obj.asInstanceOf[IgValidatorValueRule]
  }
  
  extension [Self <: IgValidatorValueRule](x: Self) {
    
    inline def setGetMessageType(value: Callback): Self = StObject.set(x, "getMessageType", value.toJsFn)
    
    inline def setIsValid(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "isValid", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
  }
}
