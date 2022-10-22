package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorUtils extends StObject {
  
  def getGlobalHandler(): ErrorHandlerCallback
  
  def setGlobalHandler(callback: ErrorHandlerCallback): Unit
}
object ErrorUtils {
  
  inline def apply(
    getGlobalHandler: CallbackTo[ErrorHandlerCallback],
    setGlobalHandler: ErrorHandlerCallback => Callback
  ): ErrorUtils = {
    val __obj = js.Dynamic.literal(getGlobalHandler = getGlobalHandler.toJsFn, setGlobalHandler = js.Any.fromFunction1((t0: ErrorHandlerCallback) => setGlobalHandler(t0).runNow()))
    __obj.asInstanceOf[ErrorUtils]
  }
  
  extension [Self <: ErrorUtils](x: Self) {
    
    inline def setGetGlobalHandler(value: CallbackTo[ErrorHandlerCallback]): Self = StObject.set(x, "getGlobalHandler", value.toJsFn)
    
    inline def setSetGlobalHandler(value: ErrorHandlerCallback => Callback): Self = StObject.set(x, "setGlobalHandler", js.Any.fromFunction1((t0: ErrorHandlerCallback) => value(t0).runNow()))
  }
}
