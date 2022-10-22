package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackHandlerStatic extends StObject {
  
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): NativeEventSubscription
  
  def exitApp(): Unit
  
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): Unit
}
object BackHandlerStatic {
  
  inline def apply(
    addEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription,
    exitApp: Callback,
    removeEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Callback
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), exitApp = exitApp.toJsFn, removeEventListener = js.Any.fromFunction2((t0: BackPressEventName, t1: js.Function0[js.UndefOr[Boolean | Null]]) => (removeEventListener(t0, t1)).runNow()))
    __obj.asInstanceOf[BackHandlerStatic]
  }
  
  extension [Self <: BackHandlerStatic](x: Self) {
    
    inline def setAddEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setExitApp(value: Callback): Self = StObject.set(x, "exitApp", value.toJsFn)
    
    inline def setRemoveEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: BackPressEventName, t1: js.Function0[js.UndefOr[Boolean | Null]]) => (value(t0, t1)).runNow()))
  }
}
