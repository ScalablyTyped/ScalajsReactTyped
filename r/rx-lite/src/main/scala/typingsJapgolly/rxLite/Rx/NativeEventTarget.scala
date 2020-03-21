package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEventTarget extends js.Object {
  def off(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit
  def on(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit
}

object NativeEventTarget {
  @scala.inline
  def apply(
    off: (String, js.Function1[/* e */ js.Any, js.Any]) => Callback,
    on: (String, js.Function1[/* e */ js.Any, js.Any]) => Callback
  ): NativeEventTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ js.Any, js.Any]) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ js.Any, js.Any]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[NativeEventTarget]
  }
}

