package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventHandler extends js.Object {
  // The |off| function removes the event event handling function |f| from
  // both |on| and the |once| event handling.
  def off(t: String, f: js.Function): Unit
  // Adds |f| as an event handler for all subsiquent events of type |t|.
  def on(t: String, f: js.Function): Unit
  // Adds |f| as an event handler for only the next event of type |t|.
  def once(t: String, f: js.Function): Unit
}

object EventHandler {
  @scala.inline
  def apply(
    off: (String, js.Function) => Callback,
    on: (String, js.Function) => Callback,
    once: (String, js.Function) => Callback
  ): EventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => once(t0, t1).runNow()))
    __obj.asInstanceOf[EventHandler]
  }
}

