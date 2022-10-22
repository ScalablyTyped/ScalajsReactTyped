package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgValidatorControlRule extends StObject {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String
  
  def getMessageType(): Unit
  
  /**
    * Returns an error message for the rule from options
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): Unit
  
  def isValid(options: js.Object): Unit
  
  def shouldRun(options: js.Object, value: js.Object): Unit
}
object IgValidatorControlRule {
  
  inline def apply(
    formatMessage: String => String,
    getMessageType: Callback,
    getRuleMessage: js.Object => Callback,
    isValid: js.Object => Callback,
    shouldRun: (js.Object, js.Object) => Callback
  ): IgValidatorControlRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = getMessageType.toJsFn, getRuleMessage = js.Any.fromFunction1((t0: js.Object) => getRuleMessage(t0).runNow()), isValid = js.Any.fromFunction1((t0: js.Object) => isValid(t0).runNow()), shouldRun = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (shouldRun(t0, t1)).runNow()))
    __obj.asInstanceOf[IgValidatorControlRule]
  }
  
  extension [Self <: IgValidatorControlRule](x: Self) {
    
    inline def setFormatMessage(value: String => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    inline def setGetMessageType(value: Callback): Self = StObject.set(x, "getMessageType", value.toJsFn)
    
    inline def setGetRuleMessage(value: js.Object => Callback): Self = StObject.set(x, "getRuleMessage", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setIsValid(value: js.Object => Callback): Self = StObject.set(x, "isValid", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setShouldRun(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "shouldRun", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
  }
}
