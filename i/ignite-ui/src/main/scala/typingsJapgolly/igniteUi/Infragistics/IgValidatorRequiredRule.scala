package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgValidatorRequiredRule extends StObject {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String
  
  def getMessageType(options: js.Object): Unit
  
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): String
  
  def isValid(options: js.Object, value: js.Object): Unit
  
  def shouldRun(options: js.Object): Unit
}
object IgValidatorRequiredRule {
  
  inline def apply(
    formatMessage: String => String,
    getMessageType: js.Object => Callback,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Callback,
    shouldRun: js.Object => Callback
  ): IgValidatorRequiredRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction1((t0: js.Object) => getMessageType(t0).runNow()), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (isValid(t0, t1)).runNow()), shouldRun = js.Any.fromFunction1((t0: js.Object) => shouldRun(t0).runNow()))
    __obj.asInstanceOf[IgValidatorRequiredRule]
  }
  
  extension [Self <: IgValidatorRequiredRule](x: Self) {
    
    inline def setFormatMessage(value: String => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    inline def setGetMessageType(value: js.Object => Callback): Self = StObject.set(x, "getMessageType", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setGetRuleMessage(value: js.Object => String): Self = StObject.set(x, "getRuleMessage", js.Any.fromFunction1(value))
    
    inline def setIsValid(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "isValid", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setShouldRun(value: js.Object => Callback): Self = StObject.set(x, "shouldRun", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
