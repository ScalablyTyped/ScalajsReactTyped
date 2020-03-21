package typingsJapgolly.relayRuntime.relayModernQueryExecutorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskScheduler extends js.Object {
  def cancel(id: String): Unit
  def schedule(fn: js.Function0[Unit]): String
}

object TaskScheduler {
  @scala.inline
  def apply(cancel: String => Callback, schedule: js.Function0[Unit] => CallbackTo[String]): TaskScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: java.lang.String) => cancel(t0).runNow()))
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => schedule(t0).runNow()))
    __obj.asInstanceOf[TaskScheduler]
  }
}

