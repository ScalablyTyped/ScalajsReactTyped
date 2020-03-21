package typingsJapgolly.asyncPolling

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asyncPolling.mod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOn extends js.Object {
  def on(eventName: EventName, listener: js.Function): js.Any
  def run(): js.Any
  def stop(): js.Any
}

object AnonOn {
  @scala.inline
  def apply(
    on: (EventName, js.Function) => CallbackTo[js.Any],
    run: CallbackTo[js.Any],
    stop: CallbackTo[js.Any]
  ): AnonOn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.asyncPolling.mod.EventName, t1: js.Function) => on(t0, t1).runNow()))
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[AnonOn]
  }
}

