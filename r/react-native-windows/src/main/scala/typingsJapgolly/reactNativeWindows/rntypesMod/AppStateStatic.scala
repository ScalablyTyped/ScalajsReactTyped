package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppStateStatic extends StObject {
  
  /**
    * Add a handler to AppState changes by listening to the change event
    * type and providing the handler
    */
  def addEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): NativeEventSubscription
  
  var currentState: AppStateStatus
  
  var isAvailable: Boolean
  
  /**
    * @deprecated Use the `remove()` method on the event subscription returned by `addEventListener()`.
    *
    * Remove a handler by passing the change event type and the handler
    */
  def removeEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit
}
object AppStateStatic {
  
  inline def apply(
    addEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => NativeEventSubscription,
    currentState: AppStateStatus,
    isAvailable: Boolean,
    removeEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Callback
  ): AppStateStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), currentState = currentState.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2((t0: AppStateEvent, t1: js.Function1[/* state */ AppStateStatus, Unit]) => (removeEventListener(t0, t1)).runNow()))
    __obj.asInstanceOf[AppStateStatic]
  }
  
  extension [Self <: AppStateStatic](x: Self) {
    
    inline def setAddEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => NativeEventSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setCurrentState(value: AppStateStatus): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: AppStateEvent, t1: js.Function1[/* state */ AppStateStatus, Unit]) => (value(t0, t1)).runNow()))
  }
}
