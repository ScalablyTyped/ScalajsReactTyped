package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgValidatorLengthRule extends StObject {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String
  
  def getMessageType(): Unit
  
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): String
  
  def isValid(options: js.Object, value: js.Object): Unit
  
  /**
    * Checks if rule should run on the current field and/or value.
    *
    * @param options Options for the validator, if fields are used this parameter is already populated with inherited ones.
    * @param value The stringified value to check.
    */
  def shouldRun(options: js.Object, value: String): Boolean
}
object IgValidatorLengthRule {
  
  inline def apply(
    formatMessage: String => String,
    getMessageType: Callback,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Callback,
    shouldRun: (js.Object, String) => Boolean
  ): IgValidatorLengthRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = getMessageType.toJsFn, getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (isValid(t0, t1)).runNow()), shouldRun = js.Any.fromFunction2(shouldRun))
    __obj.asInstanceOf[IgValidatorLengthRule]
  }
  
  extension [Self <: IgValidatorLengthRule](x: Self) {
    
    inline def setFormatMessage(value: String => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    inline def setGetMessageType(value: Callback): Self = StObject.set(x, "getMessageType", value.toJsFn)
    
    inline def setGetRuleMessage(value: js.Object => String): Self = StObject.set(x, "getRuleMessage", js.Any.fromFunction1(value))
    
    inline def setIsValid(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "isValid", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setShouldRun(value: (js.Object, String) => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction2(value))
  }
}
