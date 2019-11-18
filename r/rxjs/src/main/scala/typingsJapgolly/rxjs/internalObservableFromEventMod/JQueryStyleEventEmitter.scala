package typingsJapgolly.rxjs.internalObservableFromEventMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStyleEventEmitter
  extends EventTargetLike[js.Any] {
  def off(eventName: String, handler: js.Function): Unit
  def on(eventName: String, handler: js.Function): Unit
}

object JQueryStyleEventEmitter {
  @scala.inline
  def apply(off: (String, js.Function) => Callback, on: (String, js.Function) => Callback): JQueryStyleEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.asInstanceOf[JQueryStyleEventEmitter]
  }
}

