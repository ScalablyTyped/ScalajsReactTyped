package typingsJapgolly.reactScroll.scrollEventsMod.Events

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollEvent extends js.Object {
  def register(eventName: String, callback: js.Function2[/* to */ String, /* element */ js.Any, Unit]): Unit
  def remove(eventName: String): Unit
}

object ScrollEvent {
  @scala.inline
  def apply(
    register: (String, js.Function2[/* to */ String, /* element */ js.Any, Unit]) => Callback,
    remove: String => Callback
  ): ScrollEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* to */ java.lang.String, /* element */ js.Any, scala.Unit]) => register(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[ScrollEvent]
  }
}

