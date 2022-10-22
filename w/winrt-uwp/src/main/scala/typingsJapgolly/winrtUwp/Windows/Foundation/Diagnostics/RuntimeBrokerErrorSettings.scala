package typingsJapgolly.winrtUwp.Windows.Foundation.Diagnostics

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents diagnostic error reporting settings. */
trait RuntimeBrokerErrorSettings extends StObject {
  
  /**
    * Gets the type of error reporting for the error object.
    * @return One of the enumeration values.
    */
  def getErrorOptions(): ErrorOptions
  
  /**
    * Sets the type of error reporting for the error object.
    * @param value One of the enumeration values.
    */
  def setErrorOptions(value: ErrorOptions): Unit
}
object RuntimeBrokerErrorSettings {
  
  inline def apply(getErrorOptions: CallbackTo[ErrorOptions], setErrorOptions: ErrorOptions => Callback): RuntimeBrokerErrorSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = getErrorOptions.toJsFn, setErrorOptions = js.Any.fromFunction1((t0: ErrorOptions) => setErrorOptions(t0).runNow()))
    __obj.asInstanceOf[RuntimeBrokerErrorSettings]
  }
  
  extension [Self <: RuntimeBrokerErrorSettings](x: Self) {
    
    inline def setGetErrorOptions(value: CallbackTo[ErrorOptions]): Self = StObject.set(x, "getErrorOptions", value.toJsFn)
    
    inline def setSetErrorOptions(value: ErrorOptions => Callback): Self = StObject.set(x, "setErrorOptions", js.Any.fromFunction1((t0: ErrorOptions) => value(t0).runNow()))
  }
}
