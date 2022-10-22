package typingsJapgolly.reactNativeWindows

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageQueue extends StObject {
  
  def getCallableModule(name: String): js.Object
  
  def registerCallableModule(name: String, module: js.Object): Unit
  
  def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit
}
object MessageQueue {
  
  inline def apply(
    getCallableModule: String => js.Object,
    registerCallableModule: (String, js.Object) => Callback,
    registerLazyCallableModule: (String, js.Function0[js.Object]) => Callback
  ): MessageQueue = {
    val __obj = js.Dynamic.literal(getCallableModule = js.Any.fromFunction1(getCallableModule), registerCallableModule = js.Any.fromFunction2((t0: String, t1: js.Object) => (registerCallableModule(t0, t1)).runNow()), registerLazyCallableModule = js.Any.fromFunction2((t0: String, t1: js.Function0[js.Object]) => (registerLazyCallableModule(t0, t1)).runNow()))
    __obj.asInstanceOf[MessageQueue]
  }
  
  extension [Self <: MessageQueue](x: Self) {
    
    inline def setGetCallableModule(value: String => js.Object): Self = StObject.set(x, "getCallableModule", js.Any.fromFunction1(value))
    
    inline def setRegisterCallableModule(value: (String, js.Object) => Callback): Self = StObject.set(x, "registerCallableModule", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setRegisterLazyCallableModule(value: (String, js.Function0[js.Object]) => Callback): Self = StObject.set(x, "registerLazyCallableModule", js.Any.fromFunction2((t0: String, t1: js.Function0[js.Object]) => (value(t0, t1)).runNow()))
  }
}
