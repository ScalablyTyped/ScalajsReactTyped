package typingsJapgolly.frappeGantt.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gantt extends js.Object {
  def change_view_mode(mode: viewMode): Unit
  def refresh(tasks: js.Array[Task]): Unit
}

object Gantt {
  @scala.inline
  def apply(change_view_mode: viewMode => Callback, refresh: js.Array[Task] => Callback): Gantt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change_view_mode")(js.Any.fromFunction1((t0: typingsJapgolly.frappeGantt.mod.viewMode) => change_view_mode(t0).runNow()))
    __obj.updateDynamic("refresh")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.frappeGantt.mod.Task]) => refresh(t0).runNow()))
    __obj.asInstanceOf[Gantt]
  }
}

