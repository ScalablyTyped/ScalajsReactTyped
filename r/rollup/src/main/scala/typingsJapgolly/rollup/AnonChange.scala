package typingsJapgolly.rollup

import japgolly.scalajs.react.Callback
import typingsJapgolly.rollup.mod.RollupWatcherEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChange extends js.Object {
  def change(id: String): Unit
  def event(event: RollupWatcherEvent): Unit
  def restart(): Unit
}

object AnonChange {
  @scala.inline
  def apply(change: String => Callback, event: RollupWatcherEvent => Callback, restart: Callback): AnonChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(js.Any.fromFunction1((t0: java.lang.String) => change(t0).runNow()))
    __obj.updateDynamic("event")(js.Any.fromFunction1((t0: typingsJapgolly.rollup.mod.RollupWatcherEvent) => event(t0).runNow()))
    __obj.updateDynamic("restart")(restart.toJsFn)
    __obj.asInstanceOf[AnonChange]
  }
}

