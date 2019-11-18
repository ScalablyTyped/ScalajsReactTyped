package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppStateStatic extends js.Object {
  var currentState: AppStateStatus
  /**
    * Add a handler to AppState changes by listening to the change event
    * type and providing the handler
    */
  def addEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit
  /**
    * Remove a handler by passing the change event type and the handler
    */
  def removeEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit
}

object AppStateStatic {
  @scala.inline
  def apply(
    addEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Callback,
    currentState: AppStateStatus,
    removeEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Callback
  ): AppStateStatic = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.AppStateEvent, t1: js.Function1[
  /* state */ typingsJapgolly.reactDashNative.reactDashNativeMod.AppStateStatus, 
  scala.Unit]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.AppStateEvent, t1: js.Function1[
  /* state */ typingsJapgolly.reactDashNative.reactDashNativeMod.AppStateStatus, 
  scala.Unit]) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[AppStateStatic]
  }
}

