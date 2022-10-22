package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bridge extends StObject {
  
  def callNative(moduleName: String, methodName: String, args: Any*): Unit
  
  def callNativeWithCallbackId(moduleName: String, methodName: String, args: Any*): Double
  
  def callNativeWithPromise[T](moduleName: String, methodName: String, args: Any*): js.Promise[T]
  
  def removeNativeCallback(callbackId: Double): Unit
}
object Bridge {
  
  inline def apply(
    callNative: (String, String, /* repeated */ Any) => Callback,
    callNativeWithCallbackId: (String, String, /* repeated */ Any) => Double,
    callNativeWithPromise: (String, String, /* repeated */ Any) => js.Promise[Any],
    removeNativeCallback: Double => Callback
  ): Bridge = {
    val __obj = js.Dynamic.literal(callNative = js.Any.fromFunction3((t0: String, t1: String, t2: /* repeated */ Any) => (callNative(t0, t1, t2)).runNow()), callNativeWithCallbackId = js.Any.fromFunction3(callNativeWithCallbackId), callNativeWithPromise = js.Any.fromFunction3(callNativeWithPromise), removeNativeCallback = js.Any.fromFunction1((t0: Double) => removeNativeCallback(t0).runNow()))
    __obj.asInstanceOf[Bridge]
  }
  
  extension [Self <: Bridge](x: Self) {
    
    inline def setCallNative(value: (String, String, /* repeated */ Any) => Callback): Self = StObject.set(x, "callNative", js.Any.fromFunction3((t0: String, t1: String, t2: /* repeated */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setCallNativeWithCallbackId(value: (String, String, /* repeated */ Any) => Double): Self = StObject.set(x, "callNativeWithCallbackId", js.Any.fromFunction3(value))
    
    inline def setCallNativeWithPromise(value: (String, String, /* repeated */ Any) => js.Promise[Any]): Self = StObject.set(x, "callNativeWithPromise", js.Any.fromFunction3(value))
    
    inline def setRemoveNativeCallback(value: Double => Callback): Self = StObject.set(x, "removeNativeCallback", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
