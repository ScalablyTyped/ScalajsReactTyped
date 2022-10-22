package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackAndroid extends StObject {
  
  def addListener(handler: EventListener): BackAndroidRevoker
  
  def exitApp(): Unit
  
  def initEventListener(): Unit
  
  def removeListener(handler: EventListener): Unit
}
object BackAndroid {
  
  inline def apply(
    addListener: EventListener => BackAndroidRevoker,
    exitApp: Callback,
    initEventListener: Callback,
    removeListener: EventListener => Callback
  ): BackAndroid = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), exitApp = exitApp.toJsFn, initEventListener = initEventListener.toJsFn, removeListener = js.Any.fromFunction1((t0: EventListener) => removeListener(t0).runNow()))
    __obj.asInstanceOf[BackAndroid]
  }
  
  extension [Self <: BackAndroid](x: Self) {
    
    inline def setAddListener(value: EventListener => BackAndroidRevoker): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setExitApp(value: Callback): Self = StObject.set(x, "exitApp", value.toJsFn)
    
    inline def setInitEventListener(value: Callback): Self = StObject.set(x, "initEventListener", value.toJsFn)
    
    inline def setRemoveListener(value: EventListener => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: EventListener) => value(t0).runNow()))
  }
}
