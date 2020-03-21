package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackHandlerStatic extends js.Object {
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[Unit]): NativeEventSubscription
  def exitApp(): Unit
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[Unit]): Unit
}

object BackHandlerStatic {
  @scala.inline
  def apply(
    addEventListener: (BackPressEventName, js.Function0[Unit]) => CallbackTo[NativeEventSubscription],
    exitApp: Callback,
    removeEventListener: (BackPressEventName, js.Function0[Unit]) => Callback
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNative.mod.BackPressEventName, t1: js.Function0[scala.Unit]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("exitApp")(exitApp.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNative.mod.BackPressEventName, t1: js.Function0[scala.Unit]) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[BackHandlerStatic]
  }
}

